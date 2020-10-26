package akashsharma;

import java.util.Scanner;

public class pyramidpattern {
public static void main(String []args) {
Scanner a=new Scanner(System.in);
System.out.println("Enter the Number:");
int number=a.nextInt();
for(int i=1;i<=number;i++) {
	for(int j=number-1;j>=i;j--) {
		System.out.print(" ");	
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" *");
		
	}
	System.out.println("");
}
}
}

