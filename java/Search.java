import java.util.Scanner;
public class Search{  
  public static void main(String args[])  
  {  
    int i, n, search, array[];  
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter the limit:");  
    n = in.nextInt();  
    array = new int[n];  
   
    System.out.println("Enter the " + n + " numbers:");  
   
    for (i = 0; i < n; i++)  
      array[i] = in.nextInt();  
   
    System.out.println("Enter number to be searched");  
    search = in.nextInt();  
   
    for (i = 0; i < n; i++)  
    {  
      if (array[i] == search)      
      {  
         System.out.println("number is at the position:"+ (i + 1) + ".");  
          break;  
      }  
   }  
   if (i == n)
      System.out.println(search + " number is not in array.");  
  }  
}  