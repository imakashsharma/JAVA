package akashsharma;
import java.util.Scanner;
public class gettinguserinputs {
	public static void main(String[]args)
	{
	Scanner a = new Scanner(System.in);
	//Scanner b = new Scanner(System.in);
	//Scanner c = new Scanner(System.in);
	//Scanner d = new Scanner(System.in);
	System.out.println("Enter Name:");
	String name = a.next();
	System.out.println("Enter Geneder:");
	char gender = a.next().charAt(0);
	System.out.println("Enter Age:");
    int age = a.nextInt();
    System.out.println("Enter Phone Number:");
    long phonenu = a.nextLong();
    System.out.println("Name:"+name+","+"Gender:"+gender+","+"Age:"+age+","+"Phone Number:"+phonenu );
}
}