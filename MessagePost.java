
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends Post
{
    // instance variables - replace the example below with your own
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String text)
    {
        // initialise instance variables
        super(author);
        message = text;
        
        
    }

    /**
     * devolvemos texto del MessagePost
     */
    public String getText(){
        return message;
    }
    
    /**
     * Resumen por pantalla del mensaje
     */
    public void display(){
        System.out.println("-----------------------------------------------");
        System.out.println("Autor: " + getUsername());
        
        System.out.println("Mensaje : " + message);
        
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
    
    /**
     * Muestra una frase
     */
    public void printShortSummary(){
        System.out.println("Esto es un post de texto creado por " + getUsername() + ".");
    }
}
