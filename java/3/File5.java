import java.io.FileReader;

public class File5
{

   public static void main(String [] args)

    {
      
     char [] data = new char[100];


     try
      {
          FileReader fr= new FileReader("C:\\Users\\mca\\Documents\\hasi\\java\\3\\File2.txt");
          fr.read(data);
          
          System.out.println("Contents of file :");
          System.out.println(data);
          fr.close();
          
          }


      catch(Exception e)
      {
          System.out.println("Error occured during file reading ");

      }

 }    

}