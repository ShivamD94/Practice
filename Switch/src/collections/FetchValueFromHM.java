package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FetchValueFromHM {

	//private static Object Stud;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stud s;
		HashMap< Integer,Stud> hm= new HashMap< Integer,Stud>();
		hm.put(103,new Stud(121,"ram","sks"));
		hm.put(102,new Stud(124,"shyam","sks"));
		hm.put(101,new Stud(123,"kabeer","sks"));
		
		List<HashMap< Integer,Stud>>list=new ArrayList<HashMap< Integer,Stud>>();
		list.add(hm);
		       
		
		for(Map< Integer,Stud> m:list)
		{
			if(m.containsKey(102))
				{Stud s=m.get(102);
				//System.out.println(s.name);
				}
		}
       
		
		
		list.stream()
		             .flatMap(map->map.entrySet().stream())
		             .filter(map->map.getKey()==102)
		             .map(e->e.getValue())
		             .forEach(s->System.out.println(s.name));
	}

}
