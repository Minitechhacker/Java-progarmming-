package sample;

class mini
{
	public  int a=0;
	void count()
	{
		a++;
		System.out.println("static values:"+a);
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mini s=new mini();
		mini s1=new mini();
        mini s2=new mini();
		s.count();
		s1.count();
		s2.count();
		s.count();

	}

}
