import java.util.ArrayList;
import java.lang.System;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    // instance variables - replace the example below with your own
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        // initialise instance variables
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }

    /**
     * Añadimos mensaje al tablon
     * @param message un objeto MessagePost a añadir al muro
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }
    
    /**
     * Añadimos foto al tablon
     * 
     * @param message un objeto PhotoPost a añadir al muro
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    
    /**
     * Vemos el tablon
     */
    public void show(){
        for (MessagePost mensaje: messages)
        {
            mensaje.display();
        }
        
        for (PhotoPost foto: photos)
        {
            foto.display();
        }
        
    }
}
