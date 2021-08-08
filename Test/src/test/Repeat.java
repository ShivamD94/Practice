package test;

import java.util.Collections;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Repeat {
 

 
 public static void main(String[] args) {
         String str="better butter folly goes lame now you see";
         char s[]=str.toCharArray();
        
         int count=0;
         for(int i=0;i<s.length;i++)
         {
        	 count=1;
        	 for(int j=i+1;j<s.length;j++)
        	 {
        		 if(s[i]==s[j]&&s[i]!='0')
        		 {	 count++;
        		 s[j]='0';}
        	 }if(count>1&&s[i]!='0')
        		 System.out.println(s[i]);
         }
 }
 
}