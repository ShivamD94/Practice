package Java8.Lambda;

public class TestPrintable {

	public static void main(String[] args) {
		
		//Implementing thorugh a class method - conventional way
		
		IPrintable obj=new PrintableImpl();
		obj.print();
		
		//Implementing abstract method via anonymous inner class
		IPrintable obj1=new IPrintable() {
			
			@Override
			public void print() {
				System.out.println("message from anonymous ineer class");
				
			}
		};
            obj1.print();
            
            IPrintable obj3=  ()->{ System.out.println("Implementing abstract method using lambda");};
            obj3.print();
	}

}
