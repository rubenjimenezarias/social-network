import java.util.ArrayList;
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
        timestamp = 0;
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
        System.out.println("Hace " + timestamp + " milisegundos");
        System.out.println(likes + " likes");
        System.out.println("Comentarios");
        for(String comentario: comments){
            System.out.println("comment-- "+ comentario);
        }
        System.out.println("-----------------------------------------------");
    }
    
    /**
     * Devuelve el tiempo en string
     */
    private String timeString(long time){
        return "El tiempo es " + timestamp + " milisegundos";
    }
    
}
