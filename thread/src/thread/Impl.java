package thread;
import java.lang.*;
public class Impl implements Runnable
{ 
	public void run()
	{
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Impl m=new Impl();
		Thread t=new Thread(m);
		t.start();
	}

}
