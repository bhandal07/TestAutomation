package test;

public class MethodOverloading {
	public void add (int a,int b)
	{
	int sum = a+b;
	System.out.println("int is" + sum);
	}
	
	public void add(double a,double b)
	{
	double sum = a+b;
	System.out.println("double is" + sum);
	}

}
