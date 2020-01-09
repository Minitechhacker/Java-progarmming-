package sample;

class parent
{
	public String address="coimbatore";
	
	
	public void bank()
	{
		System.out.println("my bank is sbi and account number is 789456123789 ");
	}
	private void ATM_pin()
	{
		System.out.println("my atm pin numbers is 1234");
	}
	public final void study()
	{
		System.out.println("daily 8 hrs study");
	}
}
class child extends parent
{
	public String address1="palani";
	
	private void Bike()
	{
		System.out.println("no use for anyone:");
	}
	void call_bank()
	{
		bank();
		super.bank();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son c=new Son();
		System.out.println(c.address);
		System.out.println(c.address1);
	   // c.bank();
		System.out.println(c.address3);
		//c.bank();
		c.call_bank();
		c.study();
	c.bank();
		
	

	}

}
