package collections;

import java.util.ArrayList;
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
     hm.putIfAbsent('b', "soccer");
     hm.putIfAbsent('b', "soccer");
     hm.putIfAbsent('b', "soccer");
     hm.putIfAbsent('b', "soccer");
     System.out.println(hm.keySet());
     
     ArrayList<Map.Entry<Character, String>> li=new ArrayList<Map.Entry<Character,String>>(hm.entrySet());
   // Collections.sort(li ,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
	
    
     for(Map.Entry m:li)
     {
    	// System.out.println("Key:"+m.getKey()+" "+"Value:"+m.getValue());
     }
    hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(s->System.out.println("Key:"+s.getKey()+" "+"Value:"+s.getValue()));
	}

}
