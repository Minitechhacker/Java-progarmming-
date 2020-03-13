package interfaces;

abstract class Bike
{  
	  abstract void run();
	  
	  public void petrol()
	  {
		  System.out.println("full");
	  }
	}  
class workshop extends Bike
{
	public void run()
	{
		System.out.println("engine demage");
	}
}

public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		workshop y=new workshop();
		y.petrol();
		y.run();
	}

}
