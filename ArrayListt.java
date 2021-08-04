import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

class Employee 
{
	int Id;
	String Ename;
	
	Employee(int Id, String Ename)
	{
		this.Id = Id;
		this.Ename = Ename;
	}
	
	public String getData()
	{
		return ("ID = "+Id+"  Employee = "+Ename);
	}
}

public class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList <Employee> lst = new ArrayList <Employee>();
		System.out.println(lst.size());
		
		lst.add(new Employee(101,"prince"));
		Employee emp = new Employee(102,"Hardik");
		
		lst.add(emp);
		
		lst.add(new Employee(103,"Rishabh"));
		lst.add(new Employee(104,"saksham"));
		
		System.out.println(lst.size());
		
		for(int i=0;i<lst.size();i++)
		{
			Employee ref = lst.get(i);
			System.out.println(ref.getData());
		}
		
		lst.add(0,new Employee(105,"sanyam chalana"));// insrting at 0th index
		System.out.println(lst.size());
		
		//lst.remove(1); // removing from 1st index
		System.out.println(lst.size());
		// lst.clear(); // to delete / clear all objects
		
		//--------------------------FOR_EACH LOOP-----------------------------
		
		System.out.println("Using For-eah loop");
		for(Employee ref : lst)
		{
			System.out.println(ref.getData());
		}
		
		//--------------------Using Iterator Interface--------------------------
		
		Iterator <Employee> itr = lst.iterator();
		System.out.println("=====Using Iterator Interface");
		
		while(itr.hasNext()) // checking existence of element in an array
		{
			Employee ref = itr.next(); // gives reference of object
			System.out.println(ref.getData());
		}
		
		Collections.shuffle(lst); // For shuffling between the objects
		
		//------------------------------Using Enumeration--------------
		
		Enumeration <Employee> enm = Collections.enumeration(lst);
		System.out.println("=====Using Enumeration===");
		
		while(enm.hasMoreElements())
		{
			Employee ref = enm.nextElement();
			System.out.println(ref.getData());
		}
		
		//--------------------Using ListIteartor-------------------------
		
		ListIterator <Employee> litr = lst.listIterator();
		
		litr.next(); // going to 1st index
		litr.next(); // going to 2nd index
		litr.next(); // going to 3rd index
		litr.next(); // going to 4th index
		
		System.out.println("=====USing ListIterator===");
		while(litr.hasPrevious())
		{
			Employee ref = litr.previous();
			System.out.println(ref.getData());
		}
	}

}