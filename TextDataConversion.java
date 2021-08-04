import java.io.*;

public class TextDataConversion {

	public static void main(String[] args) throws IOException {
                try {
		CopyText();
                }catch(FileNotFoundException e)
                {
                	e.printStackTrace();
                }

	}
    
	static void CopyText() throws IOException,FileNotFoundException
	{
		File src = new File("princy.txt");
		FileReader fis = new FileReader(src);
		
		FileWriter fos = new FileWriter("princy2.txt");
		int c;
		
		while(true)
		{
			c=fis.read();
			if(c==-1)
				break;
			
			fos.write(c);
			
			System.out.println((char)c);
			
			System.out.println("File Copied");
		}
		fis.close();
		fos.close();
	}
}
