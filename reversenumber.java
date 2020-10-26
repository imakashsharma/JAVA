package akashsharma;
import java.util.Scanner;
public class reversenumber {
	public static void main(String[]args) {
	System.out.println("Enter the Number:");
	Scanner a = new Scanner(System.in);
	long number = a.nextLong();
	long  reminder,reverse=0;
	while(number!=0) {
		reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
		
	}
	System.out.println("The Number after Reverse is:"+reverse);
	
	
	}
}
