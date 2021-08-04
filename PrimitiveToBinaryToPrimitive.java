import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveToBinaryToPrimitive {

	public static void main(String[] args) {
		
		int productid = 1;
		String productname = "Laptop";
		int Quantity = 1;
		float price = 1000000;
		
		int productid2 = 2;
		String productname2 = "Bike";
		int Quantity2 = 2;
		float price2 = 2000000;
		
		try {
			
			FileOutputStream fos = new FileOutputStream("product.txt", true);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeInt(productid);
			dos.writeUTF(productname);
			dos.writeInt(Quantity);
			dos.writeFloat(price);
			
			dos.writeInt(productid2);
			dos.writeUTF(productname2);
			dos.writeInt(Quantity2);
			dos.writeFloat(price2);
			
			dos.flush();
			dos.close();
			
			// Reading data from file
			
			FileInputStream fis = new FileInputStream("product.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			try {
				while(true)
				{
					int ProductId3 = dis.readInt();
					String ProductName3 = dis.readUTF();
					int Quantity3 = dis.readInt();
					float price3 = dis.readFloat();
					
					System.out.println("Id: "+ProductId3);
					System.out.println("Product Name: "+ProductName3);
					System.out.println("Quantity: "+Quantity3);
					System.out.println("Price: "+price3);
					System.out.println("===================");
					
				}
			}catch(Exception e)
			{
				
			}
			
			dis.close();
			
		}catch(IOException e)
		{
			
		}

	}

}