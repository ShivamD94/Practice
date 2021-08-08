package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="this is ehncahnced for loop execution";
		char a[]=str.toCharArray();
		HashMap<Character , Integer> mp=new HashMap<Character , Integer>();
		for(int i=0;i<a.length;i++)
		{    
			if(mp.containsKey(a[i])&& a[i]!=' ')
			{  mp.put(a[i], mp.get(a[i])+1);}
			else
				mp.put(a[i], 1);
		}
		
		List<Map.Entry<Character , Integer>> list= new LinkedList<Map.Entry<Character , Integer>>(mp.entrySet());
		Collections.sort(list, (i1,i2)->i1.getValue().compareTo(i2.getValue()));
		
		HashMap<Character,Integer>m=new HashMap<Character, Integer>();
		for(Map.Entry<Character, Integer>map:list)
		{
			System.out.println(map.getKey()+"::"+map.getValue());
		}
	}

}
