package sample;

class method
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


public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          method over=new method();
          System.out.println(over.add(11, 11));
          System.out.println(over.add(11, 11, 11));
          
	}

}
