// isAlive method

public class Mult8
{
    public static void main(String arg[]) throws InterruptedException
    {
        Mult t1 = new Mult();
        Mult t2 = new Mult();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());

    }
}

class Mult extends Thread
{
    public void run()
    {
        
        System.out.println("isAlive method program...");
        
    }
}