package collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FreqCountInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="this game is not allowed anymore now";
		Character[] str1= str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		List<Character> list=Arrays.asList(str1);
		
		Set<Character>s1=new HashSet<Character>(list);
		Collections.sort(list);
		for(Character s:s1)
		{System.out.println(s+":"+Collections.frequency(list, s));}
		
		
	}

}
