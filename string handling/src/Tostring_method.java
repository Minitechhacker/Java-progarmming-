
class Student
{  
  int rollno;  
  String name;  
  String city;  
  
 Student(int rollno, String name, String city)
 {  
  this.rollno=rollno;  
  this.name=name;  
  this.city=city;  
 }  
   
 public String toString()
 {
	 //overriding the toString() method  
 
  return rollno+" "+name+" "+city;  
 }  

}

public class Tostring_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Raj","cbe");  
		   Student s2=new Student(102,"Vijay","chennai");  
		     
		   System.out.println(s1);  
		   System.out.println(s2);
	}

}
