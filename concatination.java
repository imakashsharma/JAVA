package akashsharma;

import java.util.Scanner;

public class concatination {
	public static void  main(String[] args) {
		String a,b;
		Scanner inp = new Scanner(System.in);
		 System.out.print("Enter String One:");
		 a =inp.next();
		 System.out.print("Enter String Two:");
		 b =inp.next();
		 System.out.println("Methods to Concate Strings \n 1.Using (+) operator \n 2.Using  String Function");
		 System.out.println("Concatenated String using method One:"+ a + b);
		 System.out.println("Concatenated String using method Two: " + a.concat(b));
		
	}

}
