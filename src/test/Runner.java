package test;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total Number of Enployee:");
		ClassA Emp = new ClassA();
		ClassB obj = new ClassB();
		ClassC obj1 = new ClassC();
		
		obj1.Name = "Test";
		obj1.Display();
		
		obj.Display();
		
		obj.show();
	
        i = scanner.nextInt();
        j=i;
        		
        while(i > 0)
        {
		i--;
		
		Emp.Get();
		Emp.Display();
		}
        
	}

}
