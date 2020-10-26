package akashsharma;

import java.util.Scanner;

public class factorial {
public static void main(String[]args) {
	String yn;
	do {
Scanner a=new Scanner(System.in);
System.out.println("Enter the Number:");
int number=a.nextInt();
int factorial=1;
for(int i=number;i>=1;i--) {
	factorial=factorial*i;
}
System.out.println("The factorial of given number is :" +factorial);

System.out.println("Do you want to continuou Press Y for yes and N for no");
yn=a.next();

}
	while(yn.equals("y") || yn.equals("Y"));
}
}