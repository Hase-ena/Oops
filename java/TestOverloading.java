class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class TestOverloading{
    public static void main(String[] args){
        System.out.println(Adder.add(12,13));
        System.out.println(Adder.add(12,13,14));
    }
}