package exception;
import java.util.*;
import java.lang.*;
public class Nested_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("what is your a values:");
		int a=in.nextInt();
		try
		{
			int b=10/a;
			System.out.println("b values is "+b);
		
		try
		{
			if(a==1)
			{
				a=a/(a-1);
			}
			if(a==2)
			{
				int[] c= {1,2,3};
				c[5]=456;
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bounds exception occurs");
		}
	}
	catch (ArithmeticException ae)
	{
		System.out.println("this exception due to divide by zero");
	}
}
}
