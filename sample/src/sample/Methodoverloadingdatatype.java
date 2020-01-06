package sample;


class over
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
}
public class Methodoverloadingdatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     over method=new over();
     System.out.println(method.add(10.2, 15.2));
	 System.out.println(method.add(5, 5));
	}

}
