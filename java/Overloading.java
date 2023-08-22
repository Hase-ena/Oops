class Adder{
    static int add(int a,int b){return a+b;}
    static double add(double a,double b){return a+b;}
}
class Overloading{
    public static void main(String[] args){
        System.out.println(Adder.add(12,13));
        System.out.println(Adder.add(12.5,13.6));
    }
}