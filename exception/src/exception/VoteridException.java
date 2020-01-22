package exception;

public class VoteridException  extends Exception 
{
	public VoteridException(int age) {
		// TODO Auto-generated constructor stub

		System.out.println("your age is "+age);
	}

	public static void verifyage(int age) {
		// TODO Auto-generated method stub
		if(age>18)
		{
			try
			{
				throw new VoteridException(age);
			}
			catch(Exception e)
			{
				System.out.println("please check your age");
			}
		}
	}
	
}
