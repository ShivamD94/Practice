package collections.Sorting;

import java.util.HashMap;
import java.util.Map;

public class TestHMSortByVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Math", 203);
		hm.put("Eng", 257);
		hm.put("Science", 340);
		hm.put("Hindi", 245);
		hm.put("PHE", 364);
		
		//Comparing and sorting map using lambda, Collections.sort() and comparator
		Map<String, Integer> hm1=SortHMValLambda.sortByVal(hm);
		for(Map.Entry m:hm1.entrySet())
		{
			System.out.println("sub::"+m.getKey()+" ==== marks::"+m.getValue());
		}
		
		
		//Comparing and sorting map using Streams, Map.Entry Interface 
	//	hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(s->System.out.println(s));
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(s->System.out.println(s));
		//hm.keySet().stream().sorted().forEach(s->System.out.println(s));                            // return only set view of keys inside the map
	}

}
