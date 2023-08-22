import java.io.FileWriter;

public class File4
{

   public static void main(String [] args)

    {
      
String  message =("Learn Java Programming");

try
  {
  FileWriter fw= new FileWriter("C:\\Users\\mca\\Documents\\hasi\\java\\3\\File12.txt");
   fw.write(message);
          
  System.out.println("Message written to file successfully!!!");
 fw.close();
          
          }


catch(Exception e)
  {
          System.out.println("Error occured during file writing ");
}
}
}