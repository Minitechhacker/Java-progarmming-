package filemanagemant;
import java.io.*;
public class Bufferstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fout=new FileOutputStream("F:durai.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="minidurai";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("successs....");
			} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
