package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SecondHighestInArr {

	public static int secondHighestUsingArray(int a[])
	{      int temp;
	       for(int i=0;i<a.length;i++)
	       {
	    	   for(int j=i+1;j<a.length;j++)
	    	   {
	    		   if(a[i]>a[j])
	    		   {
	    			   temp=a[i];
	    			   a[i]=a[j];
	    			   a[j]=temp;
	    		   }
	    	   }
	       } 
	       System.out.println(Arrays.toString(a));
	       return a[a.length-2];
	}
	
	public static Integer secHighestUsingCollections(Integer a[])
	{ 
		// Can't fetch from set using index so we need to use arraylist instead
	   List<Integer> li= Arrays.asList(a);	
	   TreeSet<Integer> set=new TreeSet<Integer>(li);
	   List<Integer> li2= new ArrayList<Integer>(set);
	   return li2.get(li2.size()-2);
	  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {2,4,1,5,9,6,10};
  Integer b[]= {2,4,1,5,9,6,10};
  System.out.println(secondHighestUsingArray(a));
  System.out.println(secHighestUsingCollections(b));
	}

}
