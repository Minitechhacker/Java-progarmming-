package sample;
import java.util.*;

class object
{
	int a,b;
	void add()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("what is a and b values:");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("total:"+(a+b));	//this one is correct 
	}
	void display()
	{
		System.out.println("total:"+(a+b));    //this one is wrong
	}
}


public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		object o=new object();
		o.add();
		o.display();

	}

}
