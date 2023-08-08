package Java8.Lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperator {

	public static void main(String[] args) {
	
		ArrayList <String> list = new ArrayList<String>();
		list.add("Davy");
		list.add("Jones");
		list.add("Lost");
		list.add("the");
		list.add("chest");
		
		// Function<String , String> func == UnaryOperator<String> Ope 
		UnaryOperator<String> ope= s->s.toUpperCase();
		list.replaceAll(ope);
		System.out.println(list);

	}

}
