
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Company implements Serializable 
{
	String name, website;
	Company(String n, String ws)
	{
		name = n;
		website = ws;
	}
	
	String getCompileDetails()
	{
		return "Company Name = " + name + "Website Name = "+ website;
	}
}

class Product implements Serializable 
{
	String ProductName;
	Company comp;
	
	Product(String pn, String nm, String ws)
	{
		comp = new Company(nm,ws);
		ProductName = pn;
	}
	
	void showProductDetails()
	{
		System.out.println("Product = "+ProductName + "," + comp.getCompileDetails());
	}
}

class SerializeProcess 
{
	void serializeObject(Product p)
	{
		try {
			FileOutputStream fos = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			oos.close();
			fos.close();
			System.out.println("Object Serialized Succesfully");
		}catch(Exception e)
		{
			
		}
	}
	
	void deserializeObject()
	{
		try {
			System.out.println("---------Deserializing start -------------");
			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Product p = (Product)ois.readObject();
			p.showProductDetails();
			
			ois.close();
			fis.close();
			
			System.out.println("Object Deserialized Succesfullu");
			
			
		}catch(Exception e)
		{
			
		}
	}
}

public class SerializationVsDeserealization {

	public static void main(String[] args) {
		
		SerializeProcess sp = new SerializeProcess();
		Product pro = new Product("Laptop","Dell","www.dell.com");
		
		sp.serializeObject(pro);
		
		sp.deserializeObject();

	}

}