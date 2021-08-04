
public class Thread1 {

	public static void main(String[] args) {
		
       a ref1 = new a();
       b ref2 = new b();
       
       ref1.start();
       ref2.start();
		
	}

}

class a extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("i wala thread finished");
	}
}

class b extends Thread
{
	public void run()
	{
		for(int j=6;j<10;j++)
		{
			System.out.println(j);
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("j wala thread finished");
	}
}