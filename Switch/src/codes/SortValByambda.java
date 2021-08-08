package codes;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortValByambda {
	
	public static HashMap<String , Integer> sortByVal(HashMap<String, Integer> hm)
	{ 
	//Convert hashmap to linkedlist
		ArrayList<Map.Entry<String,Integer>> al=new ArrayList<Map.Entry<String,Integer>>(hm.entrySet());
	//Sort the collection using lambda and compareTo
		
	Collections.sort(al, (i1,i2)->i1.getValue().compareTo(i2.getValue()));
	
	//Put the values in LinkedHash map
	LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
	for(Map.Entry<String, Integer>m:al)
	{   map.put(m.getKey(), m.getValue());
	}
	return map;
	}

}
