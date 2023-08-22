import java.util.Scanner;
public class Symmetric
{
public static void main(String[] args )
{
Scanner s = new Scanner( System.in);
System.out.println( "Enter the number of rows :");
int rows = s.nextInt();
System.out.println("Enter the number of columns :");
int cols = s.nextInt();
int matrix[][] = new int[rows][cols];
System.out.println("Enter the elements:");
for ( int i = 0; i < rows; i++ )
{
for ( int j = 0; j < cols; j++ )
{
matrix[i][j] = s.nextInt();
}
}
System.out.println("Transpose Matrix");
for ( int i = 0; i < rows; i++ )
{
for ( int j = 0; j < cols; j++ )
{
System.out.print(matrix[i][j]+"\t");
}
System.out.println();
}

if ( rows != cols )
{
System.out.println("could'nt find symmetric matrix, rows and columns are not same");

System.out.println("Transpose Matrix");
      for(int i = 0; i < cols; i++)
        {
              for( int j = 0; j < rows; j++)
            {
                System.out.print(matrix[j][i]+"");
            }
            System.out.println("");
                }
}  
else
{
boolean symmetric = true;
for ( int i = 0; i < rows; i++ )
{
for ( int j = 0; j < cols; j++ )
{
if ( matrix[i][j] != matrix[j][i] )
{
symmetric = false;
break;
}
}
}
if ( symmetric)
{
System.out.println("The given matrix is symmetric.");
}
else
{
System.out.println("The given matrix is not symmetric.");
}
}


}
}