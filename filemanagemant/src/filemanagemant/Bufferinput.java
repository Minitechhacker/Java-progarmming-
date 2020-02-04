package filemanagemant;
import java.io.*;
public class Bufferinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileInputStream m=new FileInputStream("F:durai.txt");
			BufferedInputStream bin=new BufferedInputStream(m);
			int i;
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
			}
				bin.close();
				m.close();
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
