package firstjavaproject;
import java.util.Scanner;
public class pattern1 {
	public static void main(String args[])  
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int n= sc.nextInt();
        for(i=1; i<=n; i++)  
        {
        	for(j=1; j<=i; j++)  
        	{
        		System.out.print(i+ "");   	
        	}
        	System.out.println();   	
        }
	}

}
