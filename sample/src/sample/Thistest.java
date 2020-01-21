package sample;

class student24
{
	 int rolno;
	String name;
	float avg;
	student24(int rolno,String name,float avg)
	{
		this.rolno=rolno;
		this.name=name;
		this.avg=avg;
	}
	void display()
	{
		System.out.println(rolno +" "+ name+" "+ avg);
	}
}
public class Thistest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student24 s=new student24(111,"mini",75.00f);
		System.out.println(s);
		//s.display();
		
		

	}

}
