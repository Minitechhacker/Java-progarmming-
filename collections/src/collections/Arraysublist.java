package collections;
import java.util.*;
public class Arraysublist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> l = new ArrayList<String>(5); 
		  
	        l.add("java"); 
	        l.add("Practice"); 
	        l.add("collections"); 
	        l.add("IDE"); 
	        l.add("Courses"); 
	  
	        List<String> range = new ArrayList<String>(); 
	  
	        // Return List between 2nd(including) 
	        // and 4th element(excluding) 
	        range = l.subList(2, 4); 
	  
	        System.out.println(range); 
	}

}
