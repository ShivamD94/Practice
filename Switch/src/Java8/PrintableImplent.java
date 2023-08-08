package Java8;

public class PrintableImplent {

	public static void main(String[] args) {
		
		IPrintable obj=new IPrintable() {
			
			@Override
			public void print() {
				System.out.println("message from anonymous ineer class");
				
			}
		};
            obj.print();
	}

}
