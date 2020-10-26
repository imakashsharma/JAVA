package akashsharma;
import java.util.Scanner;
import java.lang.Math.*;

public class areaofhexagone {
	public static void main(String[] args) {
		double area; 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the side of Hexagon");
		int side=input.nextInt();
		area=(6*(side*side))/(4* java.lang.Math.tan(Math.PI/6));
		System.out.print(area);
		}
	       	}