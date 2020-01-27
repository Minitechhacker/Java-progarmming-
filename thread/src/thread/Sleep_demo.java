package thread;
import java.lang.*;
public class Sleep_demo {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 long start = System.currentTimeMillis();
	        Thread.sleep(20000);
	        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
	}

}
