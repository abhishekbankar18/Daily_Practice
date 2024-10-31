// By implementing runnable interface

public class Mult2 
{
    public static void main(String arg[]) throws InterruptedException
    {
        Mult mobj = new Mult();

        Thread tobj = new Thread(mobj);
        tobj.start();

        for(int i = 1; i<=5;i++)
        {
            System.out.println("Main thread");
            Thread.sleep(1000);
        }
    }
}

class Mult implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 1; i<=5;i++)
            {
                System.out.println("My child thread");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            
        }
       
    }
}