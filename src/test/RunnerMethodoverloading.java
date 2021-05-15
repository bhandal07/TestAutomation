package test;

public class RunnerMethodoverloading {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		obj.add(1, 2);
		obj.add(2.2, 3.3);
		
		methodoverridParent obj1 = new methodoverridParent();
		obj1.disp();
		
		MethodoverChild obj2 = new MethodoverChild();
		
		obj2.disp();
		
		//abstractchild obj3 = new abstractchild();
		//obj3.method2();
	//	obj3.method1();
		
		interfacechild obj4 = new interfacechild();
		obj4.method1();
		obj4.method2();
		
		Encapsule obj5  = new Encapsule();
		obj5.setSalary(1000);
		System.out.println(obj5.getSalary());
		System.out.println(obj5.getName());
		
		
		
		
		
		
	}

}
