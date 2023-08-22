import java.io.FileWriter;
import java.io.FileReader;
public class File7
{

   public static void main(String [] args)

    {
      
String  message =("Learn Java Programming");
char [] data = new char[100];


try
  {
  FileWriter fw= new FileWriter("C:\\Users\\mca\\Documents\\hasi\\java\\3\\File12.txt");
   fw.write(message);
          
  System.out.println("Message written to file successfully!!!");
 fw.close();


FileReader fr= new FileReader("C:\\Users\\mca\\Documents\\hasi\\java\\3\\File2.txt");
          fr.read(data);
          
          System.out.println("Contents of file :");
          System.out.println(data);
          fr.close();
          
          }


catch(Exception e)
  {
          System.out.println("Error occured during file writing ");
}
}
}