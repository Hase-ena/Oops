public void run()
{
for int(int i=1;i<=5;i++)
System.out.println("Thread"+" " +i+"start running);
}
public static void main(string args[])
{
ThreadEg t1=new ThreadEg();
t1.start();
}
}