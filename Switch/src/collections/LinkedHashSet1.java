package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s1=new HashSet<String>();
		s1.add("lame");
		s1.add("ass");
		s1.add("joke");
		s1.add("often");
		s1.add("work");
		s1.add("better");
		s1.add(" ");
		s1.add(" ");
		s1.add(" lop");
		//s1.removeIf(Str->Str.contains("lame"));
		System.out.println(s1.size());
	
		Iterator<String> itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
