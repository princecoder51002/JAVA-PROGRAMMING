import java.io.*;

public class BinaryDataConversion {

	public static void main(String[] args) {
		
		try {
			CopyImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void CopyImage() throws IOException
	{
		File src = new File("Maa.mp3"); // take file from current folder
		
		File des = new File("Maa2.mp3");
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		int c, count =0;
		try {
		
		while((c=fis.read())!=-1)
		{
			count++;
			fos.write(c);

			if(count==5335846)
			break;
		}
		
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
System.out.println(count+ "Byte Copied");
		
		fis.close();
		fos.close();
	}

}