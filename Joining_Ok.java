public class Joining_Ok {
    
    public static void main(String args[])
    {
        System.out.println("Main thread starts");
        task th = new task("prince wadhwa");
        th.start();
        try{
        th.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("main thread finished");
    }

}

class task extends Thread 
{
     task(String name)
     {
         setName(name);
     }

     public void run()
     {
         for(int i=0;i<=2;i++)
         {
             System.out.println("thread-> "+getName()+":"+i);

         }
         System.out.println(getName()+" : thread finished");
     }
}
