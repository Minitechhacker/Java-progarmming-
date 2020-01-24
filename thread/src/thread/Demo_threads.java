package thread;
import java.lang.*;
public class Demo_threads extends Thread 
{
    
	public void run()
	{
		System.out.println("thread is running ....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo_threads t=new Demo_threads();
		t.start();
		
	}

}
