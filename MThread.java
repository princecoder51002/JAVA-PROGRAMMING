public class MThread {
    
    public static void main(String args[])
    {
        Thread1 th1 = new Thread1(1,5,"a");
        Thread1 th2 = new Thread1(6,10,"b");

        th1.start();
        th2.start();

    }

}

class Thread1 extends Thread{
    int sp, ep;
    public void run()
    {
        for(int i=sp;i<=ep;i++)
        {
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException exp)
            {
                exp.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread()+" Stopped");
    }

    Thread1(int s, int e, String name)
    {
        sp=s;
        ep=e;
        setName(name);
        start();
    }
}