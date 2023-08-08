package codes;

import java.util.Arrays;

class Demo {
  public static void main(String[] args) {
    
	  String str ="this is string";
	  String s[]=str.split(" ");
	  String temp="";
	  for(int i=s.length-1;i>=0;i--)
	  {
		  temp=temp+s[i]+" ";
	  }
		String rev="";
		for(int i=temp.length()-1;i>=0;i--)
		{
			rev=rev+temp.charAt(i);
		}
		System.out.println(rev);
	  
  }	     
}
