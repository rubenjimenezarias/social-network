
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        NewsFeed tablon = new NewsFeed();
        MessagePost mensaje1 = new MessagePost("Pedro","Hola soy pedro");
        PhotoPost foto1 = new PhotoPost("Maria","selfie.jpg","foto con la playa de fondo");
        
        mensaje1.like();
        mensaje1.like();
        mensaje1.like();
        foto1.unlike();
        mensaje1.addComment("primer comentario");
        mensaje1.addComment("segundo comentario");
        mensaje1.addComment("tercer comentario");
        mensaje1.addComment("cuarto comentario");
        
        tablon.addMessagePost(mensaje1);
        tablon.addPhotoPost(foto1);
        tablon.show();
    }

}
