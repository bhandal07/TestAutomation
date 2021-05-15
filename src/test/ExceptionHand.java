package test;

public class ExceptionHand {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a= 2;
		int b= 0;
		try 
		{
			int result = a/b;
			System.out.println(result);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Handled");	
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			
		}
		finally
		{
			System.out.print("All catch executed");
		}
		
		System.out.println("Hello");
		
		
		
	}

}
