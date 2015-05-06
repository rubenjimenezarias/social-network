
/**
 * Write a description of class PhotoPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends Post
{
    // instance variables - replace the example below with your own
    private String filename;
    private String caption;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String author, String filename, String caption)
    {
        // initialise instance variables
        super(author);
        this.filename = filename;
        this.caption = caption;
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
     * Resumen por pantalla del mensaje
     */
    public void display(){
        System.out.println("-----------------------------------------------");
        System.out.println("Autor: " + getUsername());
        
        System.out.println("Nombre de la foto: " + filename);
        System.out.println("Descripcion: " + caption);
        
        System.out.println(timeString(System.currentTimeMillis()));
        System.out.println(getLikes() + " likes");
        
        if(getComments().size() == 0){
            System.out.println("*****No hay comentarios*****");
        }
        else{
            System.out.println("*****Comentarios*****");
            for(String comentario: getComments()){
                System.out.println("comment-- "+ comentario);
            }
            System.out.println("*********************");
        }
        
        System.out.println("-----------------------------------------------");
    }
}
