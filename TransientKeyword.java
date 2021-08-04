import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Login implements Serializable 
{
	String Uid;
	transient String pwd;
	String timeOFlogin;
	
	Login(String u, String pw, String tol)
	{
		Uid=u;
		pwd=pw;
		timeOFlogin = tol;
		
	}
	
	void showDetails()
	{
		System.out.println("User Id: "+Uid+" Password: "+pwd+" TimeOfLogin: "+timeOFlogin);
	}
}

class SerializeUser 
{
	void serializeObject(Login user)
	{
		try {
			FileOutputStream fos = new FileOutputStream("login.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
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
			FileInputStream fis = new FileInputStream("login.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Login p = (Login)ois.readObject();
			p.showDetails();
			
			ois.close();
			fis.close();
			
			System.out.println("Object Deserialized Succesfullu");
			
			
		}catch(Exception e)
		{
			
		}
	}
}

public class TransientKeyword {

	public static void main(String[] args) {
		
		SerializeUser sp = new SerializeUser();
		Login user = new Login("prince","wadhwa","15:34AM");
		
		sp.serializeObject(user);
		sp.deserializeObject();
		

	}

}