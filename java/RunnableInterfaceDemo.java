public class RunnableInterfaceDemo implements Runnable
 {
 public void run()
{
for(int i=1;i<=5;i++){
System.out.println(Thread.currentThread().getName()+":"+i);
}
}
}
public class RunnableInterface {
public static void main(String[] args)
{
    RunnableWorker r= new RunnableWorker();
Thread t1=new Thread();
Thread t2=new Thread();
Thread t3=new Thread();
t1.start();
t2.start();
t3.start();
}
}
    