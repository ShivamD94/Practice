package codes;

import java.util.ArrayList;
import java.util.List;

public class SubString {

	public static void subString(List<String> a,List<String> b)
	{ 
		
		 int Flag=0;
	    for(int i=0;i<a.size();i++)
	    {
	    	if(b.contains(a.get(i)))
	    		//System.out.println("YES");
	    	Flag=1;
	    }
	    if(Flag==1)
	    	System.out.println("YES");
	    else
	    	System.out.println("NO");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<String>();
		l1.add("aa");
		l1.add("ae");
		l1.add("ee");
		List<String> l2=new ArrayList<String>();
		l2.add("va");
		l2.add("ae");
		l2.add("xe");
		subString(l1, l2);
		
	}

}
