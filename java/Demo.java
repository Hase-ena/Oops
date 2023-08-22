
public class Multiplication extends Thread {
 
    public void run();

        int num = 5;
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }

public class PrimeNumbers extends Thread{

    {
        int i,n,counter, j;
        n= 10;
        //System.out.printf("Enter the n value is %d ", n);
        System.out.printf("\nPrime numbers between 1 to %d are ", n);
        public void run();
        {
        for(j=2;j<=n;j++){
           counter=0;
           for(i=1;i<=j;i++){
              if(j%i==0){
                 counter++;
              }
           }
           if(counter==2)
           System.out.print(j+" ");
        }
     }
  }
}
public class Demo{
public static void main(String[] args){

Multiplication m=new Multiplication();
Thread t1=new Thread();

t1.start();

PrimeNumbers p=new PrimeNumbers();
Thread t2=new Thread();
t2.start();
}
}
}
