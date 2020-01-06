package sample;
import java.util.*;

class fun
{
	private int a,b;
	public void add()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("what is your a and b values:");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("\n total is:"+(a+b));
				
		
	}
}
public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun o=new fun();
		o.add();

	}

}
