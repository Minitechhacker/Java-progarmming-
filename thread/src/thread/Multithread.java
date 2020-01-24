package thread;
import java.lang.*;

class MyThread implements Runnable {
String name;
Thread t;
    MyThread String thread;
    {
    java.lang.String threadname;
	name = threadname; 
    t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start();
}
public MyThread(java.lang.String string2) {
		// TODO Auto-generated constructor stub
	}
public void run() {
 try {
     for(int i = 5; i > 0; i--) {
     System.out.println(name + ": " + i);
      Thread.sleep(1000);
}
}catch (InterruptedException e) {
     System.out.println(name + "Interrupted");
}
     System.out.println(name + " exiting.");
}
}

public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyThread("One");
	     new MyThread("Two");
	     new NewThread("Three");
	try {
	     Thread.sleep(10000);
	} catch (InterruptedException e) {
	      System.out.println("Main thread Interrupted");
	}
	      System.out.println("Main thread exiting.");
	}

}
