import java.util.ArrayList;
import java.lang.System;
/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    // instance variables - replace the example below with your own
    private String username;
    private int likes;
    private ArrayList<String> comments;
    private long timestamp;
    /**
     * Constructor for objects of class Post
     */
    public Post(String author)
    {
        // initialise instance variables
        username = author;
        likes = 0;
        comments = new ArrayList<>();
        timestamp = System.currentTimeMillis();
    }

    /**
     * sumamos un like
     */
    public void like()
    {
        likes++;
    }
    
    /**
     * restamos un like
     */
    public void unlike()
    {
        if (likes > 0){
            likes--;
        }
    }
    
    /**
     * añadimos comentario
     * @param texto del comentario
     */
    public void addComment(String text){
        comments.add(text);
    }
    
    /**
     * devolvemos el tiempo
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
    
    
    /**
     * Devuelve el tiempo en string
     *
     * @param tiempo actual en milisegundos.
     * @return informacion en min y segundos del tiempo que ha transcurrido 
     *          desde que subimos la foto hasta ahora.
    */
    public String timeString(long time){
		    long diferencia = (time - timestamp);
		    int segundos = (int)diferencia/1000;
		    int minutos = segundos/60;
		    int horas = minutos/60;
		    minutos -= horas*60;
		    segundos -= minutos*60;
		    
		    String tiempo = "Hace ";
		    if(horas != 0)
		    {
		        tiempo += horas + " horas ";
		    }
		    if(minutos != 0)
		    {
		        tiempo += minutos + " minutos ";
		    }
		    tiempo += segundos + " segundos ";
		    return tiempo;        
    }
    
    
    
    /**
     * Devuelve el nombre del autor.
     */
    public String getUsername(){
        return username;
    }
    
    /**
     * devuelve el numero de likes.
     */
    public int getLikes(){
        return likes;
    }
    
    /**
     * Devuelve el array de comentarios.
     */
    public ArrayList<String> getComments(){
        return comments;
    }
}
