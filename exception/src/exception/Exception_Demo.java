package exception;

import java.util.Scanner;

public class Exception_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        System.out.println("what is your values");
        int a=in.nextInt();
        int b=in.nextInt();
        float c=a/b;
        System.out.println(c);
	}

}
