package akashsharma;
import java.util.Scanner;

public class sumofenteddigits {
	public static void main(String[] args) {
		int q, r, result=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter any Number:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++){
		q=n/10;
		r=n%10;
		n=q;	
		result+=r;
		}
		System.out.print("Sum of its digits are :"+result);
		}
}
