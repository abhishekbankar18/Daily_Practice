// join method

public class Mult4
{
    public static void main(String arg[]) throws InterruptedException
    {
        Mult t1 = new Mult();
        Mult t2 = new Mult();
        Mult t3 = new Mult();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t3.start();
        try
        {
            t3.join();
        }
        catch(InterruptedException e)
        {

        }
        t1.start();
        t2.start();
        String n = Thread.currentThread().getName();
        for(int i =1; i<=3;i++)
        {
            System.out.println(n);
        }
    }
}

class Mult extends Thread
{
    public void run()
    {
        String n = Thread.currentThread().getName();
        for(int i =1; i<=3;i++)
        {
            System.out.println(n);
        }
    }
}