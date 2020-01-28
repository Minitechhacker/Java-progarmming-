package collections;
import java.util.*;
public class Arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Type safe array list, stores only string 
        List<String> l = new ArrayList<String>(5); 
        l.add("java"); 
        l.add("for"); 
        l.add("java"); 
  
        // Using indexOf() and lastIndexOf() 
        System.out.println("first index of java:"
                           + l.indexOf("java")); 
        System.out.println("last index of java:"
                           + l.lastIndexOf("java")); 
        System.out.println("Index of element"
                           + " not present : "
                           + l.indexOf("hello")); 
	}

}
