package sample;
class parent
{
	public String address="coimbatore";
	
	void bank()
	{
		System.out.println("my bank is sbi,then my bank account number is 78946513568");
	}
	private void ATM_pin()
	{
		System.out.println("my pin number is 1245");
	}
}
class child extends parent
{
	public String address1="palani";
	
	void bank()
	{
		System.out.println("my bank is KVB,then my bank account number is 7894964688");
	}
	
}
public class Rahul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  child c=new child();
  System.out.println(c.address);
  System.out.println(c.address1);
  c.bank();
	}

}
