package firstjavaproject;
import java.util.Scanner;
public class multiplicationtable {
	public static void main(String[] args)
	{
		 Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int num=s.nextInt();
			System.out.print("Enter n value:");
			int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
	
		System.out.println(num+"*"+i+" = "+num*i);
		}
	}

}
