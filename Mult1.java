// By extending thread class

class Mult1
{
    public static void main(String arg[]) throws InterruptedException
    {
        Mult mobj = new Mult();
        mobj.run();

        for(int i =1; i<=5;i++)
        {
            System.out.println("Om namh shivay...");
            Thread.sleep(1000);

        }
    }
}

class Mult extends Thread
{
    public void run()
    {
        try
        {
            for(int i =1; i<=5;i++)
            {
                System.out.println("AAi Marimata...");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {

        }
        
    }
}