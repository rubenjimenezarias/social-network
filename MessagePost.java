import java.util.ArrayList;
import java.lang.System;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    // instance variables - replace the example below with your own
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        // initialise instance variables
        username = author;
        message = text;
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
     * devolvemos texto
     */
    public String getText(){
        return message;
    }
    
    /**
     * devolvemos el tiempo
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
    /**
     * Resumen por pantalla del mensaje
     */
    public void display(){
        System.out.println("-----------------------------------------------");
        System.out.println("Autor: " + username);
        System.out.println("Mensaje: " + message);
        System.out.println(timeString(System.currentTimeMillis()));
        System.out.println(likes + " likes");
        
        if(comments.size() == 0){
            System.out.println("No hay comentarios");
        }
        else{
            System.out.println("Comentarios");
            for(String comentario: comments){
                System.out.println("comment-- "+ comentario);
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
