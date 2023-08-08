package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaSortList {
	
	public static void main (String args[])
	{
		Product p1= new Product(2011, "TV", 23000);
		Product p2= new Product(2022, "Fridge", 30000);
		Product p3= new Product(2032, "Washing MAchine", 29000);
		Product p4= new Product(2041, "AC", 55000);
		
		List <Product> li= new ArrayList<Product>();
		li.add(p1);
		li.add(p2);
		li.add(p3);
		li.add(p4);
		
		Collections.sort(li ,(i1,i2)->{
			return i1.name.compareTo(i2.name);});
		
		li.stream().filter(p->p.price>25000).forEach(p->System.out.println(p.id+" "+p.name+" "+p.price));
		Stream<Product>ppro=li.stream().filter(p->p.price>25000);
		
		ppro.forEach(
				p->System.out.println(p.id+" "+p.name+" "+p.price));
	
	
	}

}

