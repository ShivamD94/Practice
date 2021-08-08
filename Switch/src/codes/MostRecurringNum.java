package codes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostRecurringNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,4,5,6,3,4,5,6,7,8,3};
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		for( int i=0 ;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
				//System.out.println(a[i]);
				//break;
			}else
				hm.put(a[i], 1);
			// most recurring and first recurring element using hashmap
			
			
		
			
		}
		int value=Collections.max(hm.values());
		
		for(Map.Entry<Integer,Integer>m:hm.entrySet())
		{
			if(m.getValue()==value)
			{ hm.remove(m.getKey()); }
		}
		int value2=Collections.max(hm.values());
		System.out.println(value);
	}

}
