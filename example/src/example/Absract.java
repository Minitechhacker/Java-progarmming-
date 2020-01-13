package example;
abstract class bike
{
	bike()
	{
		System.out.println("not runing");
	}
	abstract void break_down();
	 
	void petrol()
	{
		System.out.println("full");
	}
		
	
}
class workshop extends bike
{
	void break_down()
	{
		System.out.println("engin is demage");
	}
}
public class Absract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     workshop w=new workshop();
     w.petrol();
     w.break_down();
     
	}

}
