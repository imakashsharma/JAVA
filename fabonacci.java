package akashsharma;

import java.util.Scanner;

public class fabonacci {
	public static void main(String []args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int first =a.nextInt();
		System.out.println("Enter the second Number:");
		int second =a.nextInt();
		System.out.println("Enter the limit of the Fabonacci:");
		int limit = a.nextInt();
		int result=0;
	for(int i=1;i<=limit;i++) {
		result=first+second;
		first=second;
		second=result;
		
	}
	
	System.out.println("The Fabonacci series of the given numer as per the limit is:"+result);
}
}