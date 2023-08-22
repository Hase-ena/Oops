import java.util.Scanner;
class AreaS{
    static int eqn(int a){return a*a;}
    static int eqn(int a,int b){return 2*(a+b);}
}
class AreaW{
    public static void main(String[] args){
Scanner myObj = new Scanner(System.in);
int a = myObj.nextInt();
Scanner myObj1 = new Scanner(System.in);
int b = myObj1.nextInt();


        System.out.println("Area of square:" + AreaS.eqn(a));
        System.out.println("Area of rectangle:"+ AreaS.eqn(a,b));
    }
}