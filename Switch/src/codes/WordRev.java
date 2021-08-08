package codes;

import java.util.Arrays;

public class WordRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="thy name kindomkom";
      String a[]=str.split(" ");
    //  System.out.println(Arrays.toString(a));
      String rev="";
      for(int i=a.length-1;i>=0;i--)
      {
    	  rev=rev+a[i]+" ";
      }
      String newRev="";
      for(int i=rev.length()-1;i>=0;i--)
      {
    	  newRev=newRev+rev.charAt(i);
      }
      System.out.println(newRev);
	}

}
