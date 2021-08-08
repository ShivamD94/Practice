package test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="weather is good today is good";
  String a[]=str.split(" ");
  HashMap<String , Integer> hm=new HashMap<String, Integer>();
  
  for(int i=0;i<a.length;i++)
  {   if(hm.containsKey(a[i])&& a[i]!=" ")
      { hm.put(a[i], hm.get(a[i])+1);
	  }
  else
	  hm.put(a[i], 1);
  }
  
  for(Map.Entry<String , Integer>m:hm.entrySet())
  {
	  if(m.getValue()>1)
	  {
		  System.out.println(m.getKey());
	  }
  }

}
	
}
