package methodoverloading;

class over
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over o=new over();
		//System.out.println(o.add(10, 15));
		System.out.println(o.add(15, 20, 25));
		

	}

}
