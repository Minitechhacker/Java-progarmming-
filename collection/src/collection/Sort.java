package collection;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Set deonstration using HashSet 
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("java"); 
        hash_Set.add("For"); 
        hash_Set.add("java"); 
        hash_Set.add("minidurai"); 
        hash_Set.add("xplore"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hash_Set); 
  
        // Set deonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
        System.out.println(tree_Set); 
	}

}
