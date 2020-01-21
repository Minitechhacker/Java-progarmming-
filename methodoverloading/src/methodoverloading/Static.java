package methodoverloading;
class st
{
	public static  int a=0;
	public void increment()
	{
		a++;
		System.out.println(a);
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     st s=new st();
     st s1=new st();
     st s3=new st();
   s.increment();
   s1.increment();
   s3.increment();
	}

}
