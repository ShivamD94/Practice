package codes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestSortMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer>m=new HashMap<String, Integer>();
		m.put("Math", 101);
		m.put("Science", 104);
		m.put("English", 100);
		m.put("Geography", 102);
		m.put("Hindi", 106);
		
		HashMap<String,Integer>mp=SortValByambda.sortByVal(m);
		for(Map.Entry<String,Integer> map:mp.entrySet()) 
		{
			System.out.println(map.getKey()+":"+map.getValue());
		}
	}

}
