package thread;
import java.util.*;
import java.lang.*; 

//MyThread extending Thread 
class MyThread extends Thread
{ 
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==2) yield();
		
		System.out.println("thread form Mythread...."+i);
	}
		System.out.println("mythread is completed");
	}
} 
class MyThread1 extends Thread
{
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==3)stop();
				
			System.out.println("this is mythread1 classs");
		}
		System.out.println("mythread1 is completed");
	}

	
	
}
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			if(i==4)
			{
				System.out.println("system is going to sleep");
				try
				{
					sleep(20000);
				}
				catch(Exception e)
				{
					System.out.println("error :"+e);
				}
			}
		}
	}
	
}
public class Yield_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MyThread o1=new MyThread();
		 MyThread1 o2=new MyThread1();
		 MyThread2 o3=new MyThread2();
		 System.out.println("1 st thread started");
		 o1.start();
		 System.out.println("2 nd thread started");
		 o2.start();
		 System.out.println("3 th thread started");
		 o3.start();
		
	        } 
	

}
