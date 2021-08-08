package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Character, String> hm=new HashMap<Character , String>();
     System.out.println(hm.isEmpty());
     hm.put('e', "polo");
     hm.put('d', "golf");
     hm.put('c', "soccer");
     hm.put('a', "gillidanda");
     hm.putIfAbsent('b', "Cricket");
     System.out.println(hm.keySet());
    // Collections.sort((List<T>) hm);
     
     for(Map.Entry m:hm.entrySet())
     {
    	 System.out.println("Key:"+m.getKey()+" "+"Value:"+m.getValue());
     }
     hm.remove(3);
	}

}
