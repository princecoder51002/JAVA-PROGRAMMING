import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AdvancedArrayListt {

	public static void main(String[] args) {
		
		ArrayListt2 Ar = new ArrayListt2();
		Ar.learn();
	}

}

class ArrayListt2 
{
	
	public void learn()
	{
		int max=10;
		int counter=0;
		
		List <Object> listA = new ArrayList <Object>();
		List <Object> listB = new ArrayList <Object>();
		
		System.out.println("----Storing 10 Integers");
		for(int i=0;i<max-1;i++)
		{
			listA.add(new Integer(i));
		}
		
		System.out.println("Storing Strings");
		
		listA.add("Prince");
		listA.add("Hardik");
		listA.add("Rishabh");
		listA.add("Saksham");
		
		System.out.println("Retrieve Objects using an Iterator");
		
		Iterator <Object> itr = listA.iterator();
		while(itr.hasNext())
		{
			Object ob = itr.next();
			System.out.print(ob+" , ");
		}
		
		int loc = listA.indexOf("Hardik");
		System.out.println("\n Location Of Hardik is: "+loc);
		
		@SuppressWarnings("unchecked")
		List <String> listSub = ((List<String>) (Object)(listA)).subList(9, listA.size());
		System.out.println("New SubList: "+listSub);
		
		Collections.sort(listSub);
		System.out.println("New Sortedlist: "+listSub);
		
		Collections.reverse(listSub);
		System.out.println("Reversed List: "+listSub);
		System.out.println("Is SubList empty? : "+listSub.isEmpty());
		
		System.out.println("Are List A and B equal? : "+listA.equals(listB));
		
		System.out.println("----Converting an List to an Array---");
		
		Object [] objarray = listA.toArray(); 
		for(int j=0;j<objarray.length;j++)
		{
			System.out.print(", Element [" + j +"] ="+objarray[j]);
		}
		
	}
}