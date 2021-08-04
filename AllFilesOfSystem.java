import java.io.IOException;
import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class AllFilesOfSystem 
{

	public static void main(String args[]) throws IOException
	{
		            
		File dir = new File("/home/prince/Desktop/");
		//System.out.println(dir.exists());
                
		File [] ary = dir.listFiles();
		AllFilesOfSystem A = new AllFilesOfSystem();
		System.out.println("Files of: "+dir.getName());


		for(File ref:ary) 
		{
			
                    
			if(ref.isFile())
			{
			
              	        	Date dt=new Date(ref.lastModified());
                                System.out.println(ref.getName()+"\t"+dt.toLocaleString()+"\t | "+ref.length() +" Bytes");

			}
			else if(ref.isDirectory())
			{
				System.out.println();
                                System.out.println();
                                System.out.println();

                                System.out.println();

				System.out.println("<DIR>                                        "+ref.getName()+"                    <DIR>");
				A.FileNames(ref);
				System.out.println();
                                System.out.println();
			}
			
		}

	}

        void FileNames(File ref)
	{
		File AllFiles[] = ref.listFiles();
                System.out.println("Files of: "+ref.getName());
              for(File ref1:AllFiles)
	      {
		      if(ref1.isFile())
		      {
		           
                             Date dt=new Date(ref1.lastModified());
                             System.out.println(ref1.getName()+"\t"+dt.toLocaleString()+"\t | "+ref1.length() +" Bytes");
		      }
		      else if(ref1.isDirectory())
		      {
			     System.out.println();
			     System.out.println();
                             System.out.println();
                             System.out.println();

			     System.out.println("<SUB DIR> OF "+ref.getName()+"                                         "+ref1.getName()+"                   <SUB DIR>");
			     FileNames(ref1);
			     System.out.println();
                             System.out.println();

		      }
	      }

	}
}
