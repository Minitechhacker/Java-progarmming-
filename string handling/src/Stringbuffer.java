
public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("hello");
		//System.out.println(s1.append("world"));
		
       StringBuffer s=new StringBuffer("hello");
       System.out.println(s.append("world"));
       
     
       System.out.println(s.insert(1,"welcome"));
       
      
       System.out.println(s.replace(1,3,"world"));
       
      
       System.out.println(s.delete(1,5));
       
       
       System.out.println(s.reverse());
       
       
	}

}
