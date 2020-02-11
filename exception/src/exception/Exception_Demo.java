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
        System.out.println("what is your values");
        int a1=in.nextInt();
        int b1=in.nextInt();
        float c1=a1/b1;
        System.out.println(c1);
	}

}
