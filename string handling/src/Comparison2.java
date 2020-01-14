import java.util.*;
public class Comparison2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String string1 = new String("minidurai"); 
	        String string2 = new String("java"); 
	        String string3 = new String("xplore"); 
	        String string4 = new String("xplore"); 
	  
	        // Comparing for String 1 < String 2 
	        System.out.println("Comparing " + string1 + " and " + string2 
	                           + " : " + string1.compareTo(string2)); 
	  
	        // Comparing for String 3 = String 4 
	        System.out.println("Comparing " + string3 + " and " + string4 
	                           + " : " + string3.compareTo(string4)); 
	  
	        // Comparing for String 1 > String 4 
	        System.out.println("Comparing " + string1 + " and " + string4 
	                           + " : " + string1.compareTo(string4)); 
	}

}
