package exception;

public class Throwscalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		try
		{
			ThroesDemo.divide(5, 0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("please check your inputs");
		}
	}

}
