import java.util.*;

public class Mapp {

	public static void main(String[] args) {
		
          Random rnd = new Random();
          
          HashMap <Integer, Integer> m = new HashMap<Integer, Integer>();
          
          for(int i=1;i<=1000;i++)
          {
        	  int r = rnd.nextInt(10);
        	  
        	  Integer occr = m.get(r);
        	  if(occr == null)
        		  occr=1;
        	  else 
        		  occr=occr+1;
        	  m.put(r, occr);
          }
          
          System.out.println(m);
	}

}