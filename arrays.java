package akashsharma;

import java.util.Scanner;

public class arrays {
public static void main(String[]args) {
Scanner a= new Scanner(System.in);
System.out.println("Enter the size of the Array:");
int size= a.nextInt();
		int[] array = new int[size];		
		System.out.println("Enter the Elements of the Array:");
		for(int x=0;x<size;x++) {
		array[x] = a.nextInt();	
	}
	int temp;
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length-1;j++) {
			if(array[j]>array[j+1]) {
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]+" ");
	}
}
}
