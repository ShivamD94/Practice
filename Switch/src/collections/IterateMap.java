package collections;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Math", 203);
		hm.put("Eng", 257);
		hm.put("Science", 340);
		hm.put("Hindi", 245);
		hm.put("PHE", 364);
	   
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey() +"::"+m.getValue());
		}
		
		for(String sub :hm.keySet())
		{
			int marks=hm.get(sub);
			System.out.println("Subject::"+sub+" Marks::"+marks);
		}
		
		//hm.forEach((k , v)-> System.out.println("Subject::"+k+" Marks::"+v));
	}

}
