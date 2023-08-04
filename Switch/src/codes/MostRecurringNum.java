package codes;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MostRecurringNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,5,6,3,4,5,6,7,8,3,3};
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		for( int i=0 ;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
				//	System.out.println(a[i]);  // first recurring element
				//break;
			}else
				hm.put(a[i], 1);
			// most recurring and first recurring element using hashmap
			
			
		
			
		}
		//int value=Collections.max(hm.keySet());
		List<Integer>li=hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(m->m.getKey()).collect(Collectors.toList());
		System.out.println(li.get(li.size()-1));
		
		int value2=Collections.max(hm.values());
	
	}

}
