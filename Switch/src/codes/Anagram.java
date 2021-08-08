package codes;

import java.util.Arrays;

public class Anagram {
	
	public static void checkAnagram(String s1,String s2)
	{
		char[]str1=s1.toCharArray();
		char[]str2=s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		if(Arrays.equals(str1, str2))
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="lips are hard";
		String s2="lisp rea ardh";
		
		checkAnagram(s1, s2);
		

	}

}
