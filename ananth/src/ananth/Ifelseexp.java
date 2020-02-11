package ananth;
import java.util.*;

public class Ifelseexp {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Scanner onput=new Scanner(System.in);
		System.out.println("what is your age");
		System.out.println("what is your name");
		int age=input.nextInt();
		String name=onput.nextLine();
		String a="abc";
		if(age>=18&&name=="a")
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	
	}
}
