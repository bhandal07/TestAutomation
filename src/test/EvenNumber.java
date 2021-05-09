package test;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number;
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        Number = scanner.nextInt();
        if(Number % 2 == 0)
        {
            System.out.println("The given number "+Number+" is Even ");
        }
        else
        	
        {
            System.out.println("The given number "+Number+" is not even ");
	}
		
		

	}

}
