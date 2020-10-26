package akashsharma;

import java.util.Scanner;

public class pattern6 {
public static void main(String []args) {
Scanner a=new Scanner(System.in);
System.out.println("Enter the Number:");
int number=a.nextInt();
for(int i=1;i<=number;i++) {
	for(int j=number-1;j>=i;j--) {
		System.out.print(" ");	
	}
	for(int k=1;k<=i;k++) {
		System.out.print("*");
		
	}
	System.out.println("");
}
for(int i=1;i<=number;i++) {
	for(int j=0;j<=i-1;j++) {
		System.out.print(" ");
	}
	for(int j=number-1;j>=i;j--){
		System.out.print("*");
		
	}
	System.out.println("");
	
}
}
}

