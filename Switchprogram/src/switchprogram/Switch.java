package switchprogram;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your for 1,2,3,4");
		int number=input.nextInt();
		 switch(number){  
		    //Case statements  
		    case 1:
		    	System.out.println("10");  
		    break;  
		    case 2:
		    	System.out.println("20");  
		    break;  
		    case 3:
		    	System.out.println("30");  
		    break;
		    case 4: 
		    	System.out.println("30");  
		    break;
		    //Default case statement  
		    default:
		    	System.out.println("Not in 1, 2 , 3 or 4");  
		    }  

	}

}
