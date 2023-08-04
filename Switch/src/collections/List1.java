package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stud s1=new Stud(123, "Paul", "ST. Johns");
		 Stud s2=new Stud(765, "Adam", "ST. Johns");
		 Stud s3=new Stud(236, "Lina", "ST. Johns");
		 int arr[]= {2,3,4,5,6,6,};
		 List<Integer> al1=new ArrayList<Integer>();
		 
		List<Stud> al= new ArrayList<Stud>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			Stud st=(Stud)itr.next();
			//System.out.println(st.name+" "+st.rollno+" "+st.school);
		}
		
		for(Stud name:al) {
			//System.out.println(name);
		}
		
		List<String> al2= new ArrayList<String>();
		al2.add("Ram");
		al2.add("Shyam");
		al2.add("Ghanshaym");
		
		List<String> al3= new ArrayList<String>();
		al3.add("Ram");
		al3.add("mike");
		al3.add("john");
		
		//al2.retainAll(al3);
		
		ListIterator<String>  itr2=al2.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		//Or use for each loop
		
//		for(String name:al2) {
//			System.out.println(name);
//		}
	}

}
