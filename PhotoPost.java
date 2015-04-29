import java.util.ArrayList;
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
        System.out.println("Autor: " + username);
        System.out.println("Nombre de la foto: " + filename);
        System.out.println("Descripcion " + caption);
        System.out.println("Hace " + timestamp + " milisegundos");
        System.out.println(likes + " likes");
        System.out.println("Comentarios");
        for(String comentario: comments){
            System.out.println(comentario);
        }
    }
    
    /**
     * Devuelve el tiempo en string
     */
    private String timeString(long time){
        return "El tiempo es " + timestamp + " milisegundos";
    }
}
