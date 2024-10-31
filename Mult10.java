// setPriority() and getPriority()

public class Mult10 
{
    public static void main(String arg[])
    {
        Mult t1 = new Mult();
        Mult t2 = new Mult();
        Mult t3 = new Mult();

        t1.setName("t1 Thread");
        t2.setName("t2 Thread");
        t3.setName("t3 Thread");

        t1.setPriority(10);
        t2.setPriority(6);
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
    }
}

class Mult extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
