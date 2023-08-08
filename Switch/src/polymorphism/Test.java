package polymorphism;

public class Test {
	
	public static void main(String args[])
	{
		
		Base obj1= new Base();
		obj1.display();
		obj1.print();
		
		Base obj2=new Derived();
		obj2.display(); // hidden due to static keyword
		obj2.print();   // run time polymorphism called as per reference to object created 
		
		Derived obj3 = new Derived();
		obj3.print();
		obj3.display();
	}


}
