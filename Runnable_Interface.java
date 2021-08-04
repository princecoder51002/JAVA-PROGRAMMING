
public class Runnable_Interface {
    
    public static void main(String args[])
    {
        Thread5 t1= new Thread5(1,5,"A");
        Thread5 t2 = new Thread5(6,10,"B");
        Thread5 t3 = new Thread5(11,15,"C");

    }

}

class Thread4 
{

}
class Thread5 extends Thread4 implements Runnable
{
    int sp, ep;
   public void run() 
    {
        for(int i=sp;i<=ep;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try 
            {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread()+": stop");
    }

    Thread5(int s, int e, String name)
    {
        
        sp=s;
        ep=e;
        Thread ref = new Thread(this);
        ref.start();
        ref.setName(name);
    }
}
