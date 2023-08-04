package collections.Sorting;

import java.awt.List;
//import java.security.PublicKey;
import java.util.*;

public class SortHMByVal {

	public static HashMap<String, Integer> sortByVal(HashMap<String, Integer> hm) {
		// conevrt hashmap to linkedlist
		LinkedList<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

		// sort the list using comparator
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() { //****** this is example of anonymous inner class implementing an Interface i.e Comparator interface
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		// put data to *Linked *hashmap
		LinkedHashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> m : list) {
			temp.put(m.getKey(), m.getValue());
		}
		return temp;
	}

}
