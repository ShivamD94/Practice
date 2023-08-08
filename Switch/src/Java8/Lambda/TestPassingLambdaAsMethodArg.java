package Java8.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestPassingLambdaAsMethodArg {

    //Defining method that takes lambda as an argument	using default comsumer interface
	private static void stringOperation(Consumer<String> consumer,String name)
	{
		consumer.accept(name);
	}
	public static void main(String args[]) {
		//Passing lambda expression as an argument to the method 
		stringOperation(s->System.out.println(s.length()), "Spellberge");
		List <String> list=Arrays.asList("John","Wilkis","Booth");
		
		
	    Consumer<String> consumer=s->System.out.println(s);
	    Consumer<String> consumer1=s->System.out.println(s.toUpperCase());
	    list.forEach(consumer.andThen(consumer1));
	}
	
}
