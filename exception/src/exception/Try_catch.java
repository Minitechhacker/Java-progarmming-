package exception;
import java.lang.*;
public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d = 0; 
		  int n = 20;
		  try 
		  {
		   int fraction = n / d;
		   System.out.println(fraction);
		  
		  } 
		  catch (ArithmeticException e) 
		  {
		   System.out.println("This line will not be Executed");
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
		  
	}

}
