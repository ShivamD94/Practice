package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("Ram");
		al2.add("Ram");
		al2.add("Ghanshaym");
		al2.add("Pinto");
		
		List<String> list= new ArrayList<String>();
		list.add("John");
		list.add("Boorish");
		list.add("Pinto");
		al2.addAll(list);
		System.out.println(al2);
		//Collections.sort(list);
		HashSet<String> s = new HashSet<String>();
		s.add("nathan");
		s.add("Pedro");
		s.add("Olo");
		s.addAll(al2);
		char mychr="piper".charAt(3);
		System.out.println(s);
		// Collections.sort(al2);
		
		
	
		  //  String arr[]= List.toArray(new String[list.Size()]);
					
		
			 
		

	}

}
