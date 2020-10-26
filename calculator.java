package akashsharma;
import java.util.Scanner;
public class calculator {
	public static void main(String[]args) {	
		String yn;
		do {
		Scanner a = new Scanner(System.in);
		System.out.println("****WELCOME TO THE CALCULATOR****");
		System.out.println("Enter the First Number:");
		long first= a.nextLong();
		System.out.println("Enter the second number:");
		long second = a.nextLong();
		System.out.println("Chhose the option");
		System.out.println("1 for Addition, 2 for Subtraction, 3 for Multiplication,");
		System.out.println("4 for Divison, 5 for Reminder after Divison");
		int option = a.nextInt();
		long result=0;
		long temp;
		if (first<second){
			temp=first;
			first=second;
			second=temp;
		}
		switch(option) {
			case 1:
				result = first+second;
			System.out.println("The addition of two numbers is:"+result);
			break;
			case 2:
				result = first-second;	
			System.out.println("The subtraction of two numbers is:"+result);
			break;
			case 3:
				result = first*second;	
				System.out.println("The multiplication of two numbers is:"+result);
				break;
			case 4:
				try {
				result = first/second;	}
				catch(Exception e)
				{
					System.out.println(e);
					System.out.println("You cannot devide a Number by Zero");
				}
				System.out.println("The divison of two numbers is:"+result);
				break;
			case 5:
				result = first%second;	
				System.out.println("The reminder of two numbers after divison is:"+result);
				break;
		default:
			System.out.println("Default option");
		
	}
		System.out.println("Do you want to continuou.? Press Y for Yes or N for No");
		yn=a.next();
		}
		while(yn.equals("y") || yn.equals("Y"));
	}
}