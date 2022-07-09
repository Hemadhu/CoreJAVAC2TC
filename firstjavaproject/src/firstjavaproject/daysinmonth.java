package firstjavaproject;
import java.util.Scanner;
public class daysinmonth {
	private static Scanner sc;
	 public static void main(String[] args) {
		 int month;
		 System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
		 sc = new Scanner(System.in);
		 month = sc.nextInt();	
		 switch(month) {
		 case 1:
			 System.out.println("number of days in january is 31");
			 break;
		 case 2:
			 System.out.println("number of days in february is 28 or 29");
			 break;
		 case 3:
			 System.out.println("number of days in march is 31");
			 break;
		 case 4:
			 System.out.println("number of days in april is 30");
			 break;
		 case 5:
			 System.out.println("number of days in may is 31");
			 break;
		 case 6:
			 System.out.println("number of days in june is 30");
			 break;
		 case 7:
			 System.out.println("number of days in july is 31");
			 break;
		 case 8:
			 System.out.println("number of days in august is 31");
			 break;
		 case 9:
			 System.out.println("number of days in september is 30");
			 break;
		 case 10:
			 System.out.println("number of days in october is 31");
			 break;
		 case 11:
			 System.out.println("number of days in november is 30");
			 break;
		 case 12:
			 System.out.println("number of days in december is 31");
			 break;
			 default:
				 System.out.println("invalid month");
		 
		 }
	 }
         

}
