package filestream;
import java.io.*;
public class Fileinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileInputStream m=new FileInputStream("F:mini.txt");
			int i;
			while((i=m.read())!=-1)
			System.out.print((char)i);
			m.close();
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
