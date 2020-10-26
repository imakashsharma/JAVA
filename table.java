package akashsharma;
import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Enter any number");
		int number=input.nextInt();
		for(i=1;i<=10;i++) {
		System.out.println(number + " * "+i+" = "+number*i);
		}
		}
	}