import java.util.Scanner;
public class Complex
{
public static void main(String[] args)
{
int a,b,c,d,fnum,snum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real part of the first number:");
a=sc.nextInt();
System.out.println("Enter the imaginary part of the first number:");
b=sc.nextInt();
System.out.println("Enter the real part of the second number:");
c=sc.nextInt();
System.out.println("Enter the imaginary part of the second number:");
d=sc.nextInt();
fnum=a+c;
snum=b+d;
System.out.println("Sum is: "+ fnum+" + "+snum +"i");
}
}
