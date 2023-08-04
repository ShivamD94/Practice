package collections.Sorting;

import java.util.*;


public class SortHMValLambda {

	public static LinkedHashMap<String, Integer> sortByVal(HashMap<String, Integer> hm) { // Convert hashmap to list
																							// type
		ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());

		// Sort the list using lambda
		Collections.sort(al, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
		//Collections.sort(al,(i1,i2)->i1.getKey().compareTo(i2.getKey()));

		// Put the sorted values in a *Linked* HashMAp
		LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> m : al) {
			hm1.put(m.getKey(), m.getValue());
		}
		return hm1;

	}
}
