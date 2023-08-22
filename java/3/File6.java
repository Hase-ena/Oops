import java.io.File;
public class File6
{

   public static void main(String [] args)

    {
      
    
     try
      {
          File f1= new File("C:\\Users\\mca\\Documents\\hasi\\java\\3\\File12.txt");
          f1.delete();       
          System.out.println("File Deleted!!!");
         
          
          }


      catch(Exception e)
      {
          System.out.println("Error occured during file deletion ");

      }

 }    

}