package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateVal {

	public static void main(String args[]) {
	//Write a program to print only common key value pair, Eg Output here is 2,Vishnu
	HashMap<Integer,String> map1=new HashMap<Integer, String>();
	map1.put(1, "ABC");
	map1.put(2,"Shivam");

	 

	HashMap<Integer,String> map2=new HashMap<Integer,String>();
	map2.put(2,"Shivam");
	map2.put(3,"Vishnu");




	ArrayList<HashMap<Integer,String>> li=new ArrayList<HashMap<Integer,String>>();
	li.add(map1);
	li.add(map2);
	
	Set<Map.Entry<Integer,String>> items = new HashSet<>();

	 Set<Map.Entry<Integer,String>> result = li.stream().flatMap(m->m.entrySet().stream()).filter(i->!items.add(i)).collect(Collectors.toSet());
	System.out.println(result);
	

	
    for(Map.Entry m1:map1.entrySet())
    {
    	for(Map.Entry m2:map2.entrySet())
    	{
    		//if(m1.getKey()==m2.getKey())
    			//System.out.println(m1.getKey()+":"+m1.getValue());
    	}
    }
	
}
}
