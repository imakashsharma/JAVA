package akashsharma;

import java.util.Scanner;

public class company {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		manager M=new manager();  
		System.out.print("Enter Manager's Name and Salary:");
		String MName=input.nextLine();
		float Msalary=input.nextFloat(); 
		M.setSalary(Msalary); 
		M.setName(MName);//manager info
		System.out.println("Manager's Name and Salary is : "+M.getName()+" "+ 	M.getSalary());
		M.assign_Work("Karanjit Singh");	
		employee E=new employee();  
		E.setSalary(4000);//Employee info
		System.out.print("Employee's salary is "+E.getSalary());
		E.doWork();
		}
		}