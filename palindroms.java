package akashsharma;

import java.util.Scanner;

public class palindroms {
	public static void main(String []args) {
		String opt;
		do {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Number:");
		long number =a.nextLong();
		long temp;
		temp=number;
		long reminder,reverse = 0;
		while(temp!=0) {
			reminder=temp%10;
			reverse=reverse*10+reminder;
			temp=temp/10;	
		}
		if(reverse==number) {
			System.out.println("The entred number is a Palindrom");
}
		else {
			System.out.println("The entred number is Not a Palindrom");
		}
		System.out.println("Press Y for continuou and N for Exit");
		opt=a.next();
	}
		
		
		while(opt.equals("y") || opt.equals("Y"));
	

}
	
}
