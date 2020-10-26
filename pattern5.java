package akashsharma;

import java.util.Scanner;

public class pattern5 {
public static void main(String []args) {
Scanner a=new Scanner(System.in);
System.out.println("Enter the Number:");
int number=a.nextInt();
for(int i=1;i<=number;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	for(int j=number;j>=i;j--){
		System.out.print("*");
		
	}
	System.out.println("");
	
}

	
}
}
