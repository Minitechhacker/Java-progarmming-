package filemanagemant;
import java.io.*;
public class Deletefolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myObj = new File("F:\\minidurai"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the folder: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the folder.");
	    } 
	}

}
