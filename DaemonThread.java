class DaemonThread 
{
     public static void main(String args[])
     {
	     System.out.println("Main Thread started");
	     Daemon D1 = new Daemon();
	     D1.setDaemon(true);
	     D1.start();
	     try{
		     Thread.sleep(1000);
	     }catch(Exception ex)
	     {

	     }
	     System.out.println("Main Thread Stopped");
     }

}

class Daemon extends Thread 
{
	public void run()
	{
		System.out.println("Daemon Thread Started");
		for(char ch =65;ch<=90;ch++)
		{
			System.out.print(ch+" ");
			try{
				sleep(100);
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Daemon Thread Stopped");
	}

}

