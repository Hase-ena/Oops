import java.util.Scanner;
public class Matrix
{
    public static void main(String[] args)
    {
        int p, q, m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows-1st matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns-1st matrix:");
        q = s.nextInt();
        System.out.print("Enter number of rows-2nd matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns-2nd matrix:");
        n = s.nextInt();
        if (p == m && q == n)
        {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];
            System.out.println("Enter the elements of 1st matrix:");
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < q; j++)
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter the elements of 2nd matrix:");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("1st Matrix:");
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < q; j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("2nd Matrix:");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < q; k++)
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Added Matrix:");
            for (int i = 0; i < p; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition is not possible");
        }
    }
}
