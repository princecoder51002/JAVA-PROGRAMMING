import java.io.File;
import java.io.IOException;
import java.util.Date;


public class FileClass 
{

	public static void main (String args[]) throws IOException
	{

		/*File newfile = new File("/home/prince/Desktop/REAL_JAVA/DaemonThread.java");
		System.out.println(newfile.exists());
		*/

               /* File obj1 = new File("/home/prince/princy.com");
		System.out.println(obj1.getAbsolutePath());
		System.out.println(obj1.getCanonicalPath());
		if(obj1.exists())
		{
			System.out.println(obj1.getName());
                        System.out.println(obj1.getParent());
			System.out.println(obj1.getPath());


		}
		else 
		{
			System.out.println("File Not Found");

		}
		*/

		/*File dir = new File("myfile.txt");
		System.out.println(dir.getCanonicalPath());
		System.out.println(dir.getAbsolutePath()); // it shows the file name with current folde path
               */

		File dir = new File("/home/prince/Desktop/REAL_JAVA");
		File ary[] = dir.listFiles(); // returns array of objects of class File
		int fcount =0 , dcount=0;
		for (File ref:ary)
		{

		//	System.out.println(ref.getPath());
			if(ref.isFile())
			{

				Date dt = new Date(ref.lastModified());
				System.out.println(ref.getName()+"\t"+dt.toLocaleString()+"\t | "+ref.length() +" Bytes");
                                        fcount++;

			}
			else if(ref.isDirectory())
			{

				dcount++;
                                System.out.println("                         <DIR>"+ref.getName());

			}
		}
		System.out.println("Files="+fcount+"   Directories="+dcount);





	}
}
