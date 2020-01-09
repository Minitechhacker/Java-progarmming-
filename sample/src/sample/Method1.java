package sample;
class method2
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
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       method2 m=new method2();
       System.out.println("your first add values:"+m.add(10, 10));
       System.out.println("your second add values:"+m.add(10, 11, 12));
	}

}
