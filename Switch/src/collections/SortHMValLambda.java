package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortHMValLambda {

	public static LinkedHashMap<String, Integer> sortByVal(HashMap<String, Integer> hm) { // Convert hashmap to list
																							// type
		ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());

		// Sort the list using lambda
		Collections.sort(al, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

		// Put the sorted values in a *Linked* HashMAp
		LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> m : al) {
			hm1.put(m.getKey(), m.getValue());
		}
		return hm1;

	}
}
