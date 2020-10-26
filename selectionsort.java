package akashsharma;

import java.util.Scanner;

public class selectionsort {
	public static void main(String []args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the siz of the Array:");
	int size=a.nextInt();
	int[] array = new int[size];		
	System.out.println("Enter the Elements of the Array:");
	int m,temp=0;
	for(int x=0;x<size;x++) {
	array[x] = a.nextInt();	
}
	
	for(int i=0;i<array.length;i++) {
		m=i;
		for(int j=i+1;j<array.length;j++) {
			if(array[j]<array[m]) {
			m=j;
		}
		temp=array[i];
		array[i]=array[m];
		array[m]=temp;
	}
	}
	for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	}
	}
	
}