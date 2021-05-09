package test;

import java.util.Scanner;

public class ClassA {
	public int salary;
	public String Name;
	String Orgname;
	
	public void Get() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Name:");
        Name= scanner.next();
        System.out.print("Enter the Salary:");
        salary= scanner.nextInt();
        System.out.print("Enter the Org:");
        Orgname= scanner.next();
	}
	public void Display() {
		System.out.print("Name of Employee:" +Name+ '\n');
		System.out.print("Salary of" +Name+ ":" +salary+ '\n');
		System.out.print("Organisation of" +Name+ ":" +Orgname+ '\n');
	}

}
