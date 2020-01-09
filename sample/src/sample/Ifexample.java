package sample;
import java.util.*;

public class Ifexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("what is your age:");
		int age=in.nextInt();
		if(age>18)
		{
			System.out.println("your eligiable for vote:"+age);
		}
		else
		{
			System.out.println("not eligiable for vote:"+age);
		}
		

	}

}
