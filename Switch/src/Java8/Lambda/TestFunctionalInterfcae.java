package Java8.Lambda;

import java.util.function.Function;

public abstract class TestFunctionalInterfcae {

	
	private static Function<Integer , Integer> add5=  i-> i+5;
	private static Function<Integer , Integer> mul5=  i-> i*5;
	private static Function<String , Integer> length=  s->s.length();
	public static void main(String[] args) {
	
	
	          int j=add5.apply(5);
	          System.out.println(j);
	          
	          System.out.println(length.andThen(add5).apply("Testing is done"));
	}

}
