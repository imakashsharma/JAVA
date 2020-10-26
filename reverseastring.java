package akashsharma;
import java.util.*;

public class reverseastring {
	public static void main(String args[]) {
		System.out.println("Enter any string:");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		}	
		System.out.print("Reversed string:"+reverse);
		}

}
