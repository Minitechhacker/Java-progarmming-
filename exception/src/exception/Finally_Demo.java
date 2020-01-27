package exception;

public class Finally_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a=50, b=0;
		Finally_Demo fd=new Finally_Demo();
		fd.divide(a,b);
	}
	private float divide(int a,int b)
	{
		try {
		return a/b;
		}
		finally  
		{
			System.out.println("im finally block");
		}
	}
}
