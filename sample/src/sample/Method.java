package sample;
class example
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
		
	}
	
}

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example o=new example();
		System.out.println(o.add(10, 10));
		System.out.println(o.add(10, 15, 20));

	}

}
