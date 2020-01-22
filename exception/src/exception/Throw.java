package exception;
import java.lang.*;
public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Throw t1=new Throw();
		
		try
		{
			t1.test();
		}
		catch(NullPointerException npe)
		{
			
			System.out.println("caught second time");
		}
	}

	private void test() {
		// TODO Auto-generated method stub
		try
		{
			throw new NullPointerException();
			
		}
		catch(NullPointerException npe)
		{
			
			System.out.println("Got NPE");
            throw npe;		
		}
	}
	

}
