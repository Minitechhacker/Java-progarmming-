package sample;
class car
{
	private int a=10;
	public int b=20;
	public void add()
	{
		//int c;
		System.out.println("total is:"+(a+b));
	}
}

public class Objectexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		System.out.println("b values:" +c.b);
		c.add();

	}

}
