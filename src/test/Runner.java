package test;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total Number of Enployee:");
        i = scanner.nextInt();
        j=i;
        		
        while(i > 0)
        {
		i--;
		ClassA Emp = new ClassA();
		Emp.Get();
		}
        while(j > 0)
        {
        	j--;
        
        ClassA Emp = new ClassA();
        Emp.Display();
        }
	}

}
