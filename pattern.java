package akashsharma;

import java.util.Scanner;

public class pattern {
	public static void main(String []args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num=a.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			
		}
		System.out.println("");
	}
	
	}

}
