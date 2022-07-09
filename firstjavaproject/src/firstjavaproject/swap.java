package firstjavaproject;
import java.util.*;  
public class swap {
	
		public static void main(String[] args)
		{

			int x ,y;
			Scanner sc = new Scanner(System.in);  
			  System.out.println("Enter the value of X and Y");  
		       x = sc.nextInt();  
		       y = sc.nextInt();  
		    System.out.println("Before Swap");
			System.out.println("x = " + x);
			System.out.println("y = " + y);

			int temp = x;
			x = y;
			y = temp;

			System.out.println("After swap");
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
	}



