// interrupt method

public class Mult9
{
    public static void main(String arg[]) throws InterruptedException
    {
        Mult t1 = new Mult();
        // Mult t2 = new Mult();

        t1.setName("Thread 1");
        // t2.setName("Thread 2");

        t1.start();
        t1.interrupt();

        // t2.start();

    }
}

class Mult extends Thread
{
    public void run()
    {
        try
        {
            for(int i =1;i<=5;i++)
            {
                System.out.println("t1 thread running");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("t1 thread interrupted");
        }
        
    }
}