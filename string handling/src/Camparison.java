
public class Camparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String string1 = new String("xplore"); 
	        String string2 = new String("it"); 
	        String string3 = new String("xplore"); 
	        String string4 = new String("java"); 
	        String string5 = new String("java"); 
	  
	        
	        System.out.println("Comparing " + string1 + " and " + string2 
	                           + " : " + string1.equalsIgnoreCase(string2)); 
	  
	        
	        System.out.println("Comparing " + string3 + " and " + string4 
	                           + " : " + string3.equals(string4)); 
	  
	       
	        System.out.println("Comparing " + string4 + " and " + string5 
	                           + " : " + string4.equals(string5)); 
	  
	        
	        System.out.println("Comparing " + string1 + " and " + string4 
	                           + " : " + string1.equals(string4)); 
	}

}
