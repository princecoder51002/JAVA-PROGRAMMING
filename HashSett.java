import java.util.*;

public class HashSett {

	public static void main(String[] args) {
		
		String java[] = {"Diya", "Tanvi", "Prince", "Rishabh"};
		String donet[] = {"Hardik", "Diya", "Saksham"};
		
		HashSet <String> jb = new HashSet <String>(Arrays.asList(java));

		HashSet <String> dn = new HashSet <String>(Arrays.asList(donet));
		
		System.out.println("Java Batch: "+jb);
		System.out.println("DoNet Batch: "+dn);
		
		HashSet <String> dncopy = new HashSet <String>(dn);
		dncopy.retainAll(jb); // Intersection
		System.out.println("RetainAll(): "+dncopy);
		
		HashSet <String> dncopy2 = new HashSet <String>(dn);
		dncopy.removeAll(jb); // Subtraction
		System.out.println("RetainAll(): "+dncopy2);
		
		HashSet <String> dncopy3 = new HashSet <String>(dn);
		dncopy3.addAll(jb); // Union
		dncopy3.addAll(dn);
		System.out.println("addAll(): "+dncopy3);
	}

}