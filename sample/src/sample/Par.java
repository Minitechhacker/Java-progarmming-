package sample;

class student
{
	int id;
	String name;
	student(int i,String n)
	
	{
	id=i;
	name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}
public class Par {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
        student s2=new student(111,"mini");
        student s1=new student(112,"durai");
        s2.display();
        s1.display();
	}

}
