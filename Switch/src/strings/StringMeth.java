package strings;

import java.util.Arrays;

public class StringMeth {

	public static void main(String[] args) {
	
		String s1="This is a billboard SHIT";
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.charAt(9));
		System.out.println(s1.startsWith("This"));
		System.out.println(s1.length());
		
		//String concatnation using append , join , format 
      StringBuilder s2= new StringBuilder("Die");
      StringBuilder s3= new StringBuilder("Hard");
      s2.append(s3);
System.out.println(s2);
String s = String.format("%s %s",s1,s2);  
String s4 = String.join(" ",s1,s2);
System.out.println(s4);
       
        //Substrings
       System.out.println(s1.substring(4));
       String str[]=s1.split("\\.");
       System.out.println(Arrays.toString(str));
   
	}

}
