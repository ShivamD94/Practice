package codes;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoFrequency {

	public static void noFreq(int a[])
	{
		Map<Integer, Integer> mp=new LinkedHashMap<Integer, Integer>(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			if(mp.containsKey(a[i]))
				mp.put(a[i], mp.get(a[i])+1);
			else
				mp.put(a[i], 1);
			
		}
		for(Map.Entry<Integer, Integer>m:mp.entrySet())
		{System.out.println(m.getKey()+":"+m.getValue());}
		
		
	}
	public static void main(String[] args) {
		int a[]= {1,3,2,3,5,4,3,2,6,4,3,6,7,6,5,3};
		noFreq(a);
}
}
