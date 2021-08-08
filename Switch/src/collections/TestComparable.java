package collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud s1=new Stud(104, "john", "kmp");
		Stud s2=new Stud(103, "mike", "kmp");
		Stud s3=new Stud(102, "lily", "kmp");
		Stud s4=new Stud(101, "klop", "kmp");
		
		ArrayList<Stud> al=new ArrayList<Stud>();
		al.add(s4);
		al.add(s2);
		al.add(s1);
		al.add(s3);
		Collections.sort(al);
		for(Stud s:al)
		{
			System.out.println(s.rollno+"::"+s.name+"::"+s.school);
		}
		}

}
