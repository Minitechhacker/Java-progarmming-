
public class Method_of_string_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mini";  
		System.out.println(s.toUpperCase());  
		System.out.println(s.toLowerCase());
		System.out.println(s);
		
		String s1="   mini  durai     ";  
		System.out.println(s1);  
		System.out.println(s1.trim());
		
		String s2="mini";  
		 System.out.println(s2.startsWith("mi")); 
		 System.out.println(s2.endsWith("n"));  
		
		 String s3="xplore";  
		 System.out.println(s3.charAt(0));  
		 System.out.println(s3.charAt(3));
		 
		 String s4="xplore";  
		 System.out.println(s4.length());
		 
		 String s5="kava is a programming language. kava is a platform. Java is an Island.";    
		 String replaceString=s5.replace("kava","java");    
		 System.out.println(replaceString);    
		 
	}

}
