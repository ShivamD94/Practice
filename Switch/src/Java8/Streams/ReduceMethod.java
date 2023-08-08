package Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {

	public static void main(String[] args) {
		
		// Reduce method is used for reducing a stream of inputs to a single output result like min , max , avg , sum
		
		
		List<Integer> li= Arrays.asList(12,11,8,18,15);
		
		int sum=li.stream().reduce(0,(e1 ,e2)->e1+e2); //producing sum of all integers in a stream
		int max= li.stream().reduce(0,Integer::max);
		Optional<Integer> max2=li.stream().min(Comparator.naturalOrder());
		int min= li.stream().reduce(0,Integer::min);
		System.out.println(sum +"::"+max2+"::"+min);

		 List<String> words = Arrays.asList("GFG", "Geeks", "for",
                 "GeeksQuiz", "GeeksforGeeks");
		 
		 Optional<String> String_combine = words.stream()
                 .reduce((str1, str2)
                 -> str1 + "-" + str2);
	}

}
