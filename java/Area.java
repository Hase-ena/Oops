class AreaS{
    static int eqn(int a){return a*a;}
    static double eqn(double a,double b){return 2*(a+b);}
    static double eqn(double a){return 3.14*(a*a);}
}
class Area{
    public static void main(String[] args){
        System.out.println("Area of square:" + AreaS.eqn(12));
        System.out.println("Area of rectangle:"+ AreaS.eqn(12.5,13.6));
	System.out.println("Area of circle:" + AreaS.eqn(10.2));
    }
}