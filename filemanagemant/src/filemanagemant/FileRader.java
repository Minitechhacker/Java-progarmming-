package filemanagemant;
import java.io.*;
public class FileRader {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		// variable declaration 
        int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("text"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 
	}

}