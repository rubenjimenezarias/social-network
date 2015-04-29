import java.util.ArrayList;
import java.lang.System;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    // instance variables - replace the example below with your own
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        // initialise instance variables
        username = author;
        this.filename = filename;
        this.caption = caption;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
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
     * Devolvemos el nombre de la imagen
     */
    public String getImageFile(){
        return filename;
    }
    
    /**
     * Devolvemos la descripcion de la imagen
     */
    public String getCaption(){
        return caption;
    }
    
    /**
     * Devolvemos el tiempo de la imagen
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
    /**
     * Resumen por pantalla de la imagen
     */
    public void display(){
        System.out.println("-----------------------------------------------");
        System.out.println("Autor: " + username);
        System.out.println("Nombre de la foto: " + filename);
        System.out.println("Descripcion " + caption);
        System.out.println(timeString(System.currentTimeMillis()));
        System.out.println(likes + " likes");
        if(comments.size() == 0){
            System.out.println("No hay comentarios");
        }
        else{
            System.out.println("Comentarios");
            for(String comentario: comments){
                System.out.println("comment-- " + comentario);
            }
        }
        
        System.out.println("-----------------------------------------------");
    }
    
    /**
     * Devuelve el tiempo en string
     */
    private String timeString(long time){
        return "Hace " + ((time - timestamp)/1000)/60 + " minutos " + ((time - timestamp)/1000)%60 + " segundos";
    }
}
