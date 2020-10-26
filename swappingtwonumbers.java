package akashsharma;
import java.util.Scanner;

public class swappingtwonumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Before Swapping ,Enter two Number:");
		int n1=input.nextInt();
		int n2=input.nextInt();
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.print("After Swapping, Values becomes :"+ n1+" and "+ n2);
		}
		}