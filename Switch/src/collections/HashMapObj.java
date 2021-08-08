package collections;

import java.util.HashMap;import java.util.Map;

public class HashMapObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud s1=new Stud(10, "Palki", "jss");
		Stud s2=new Stud(11, "Jalki", "jss");
		Stud s3=new Stud(12, "Mohan", "jss");
		Stud s4=new Stud(13, "Sohan", "jss");
		
		HashMap<Integer, Stud> hm=new HashMap<Integer, Stud>();
		hm.put(s1.getRollno(), s1);
		hm.put(s2.getRollno(), s2);
		hm.put(s3.getRollno(), s3);
		hm.put(s4.getRollno(), s4);
		
		for(Map.Entry<Integer, Stud>m:hm.entrySet())
		{
			Stud s=m.getValue();
			System.out.println(s.name);
		}
		
	}

}
