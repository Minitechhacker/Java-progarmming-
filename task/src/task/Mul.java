package task;
import java.util.*;
public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("enter the multiable number");
		int b=in.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+b+"="+(i*b));
		}
	}

}
