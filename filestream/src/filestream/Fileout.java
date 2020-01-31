package filestream;
import java.io.*;
public class Fileout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileOutputStream mini=new FileOutputStream("F:mini.txt");
		String s="hi im minidurai";
		byte b[]=s.getBytes();
		mini.write(b);
		
		mini.close();
		System.out.println("Successs.....");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
