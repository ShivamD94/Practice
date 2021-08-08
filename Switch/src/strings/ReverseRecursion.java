package strings;

public class ReverseRecursion {
	
	public static String reverse(String input) {
        if (input.isEmpty()) {  
            System.out.println("String is empty now");
            //System.out.println("lol");
            return input;
        }
        
       // System.out.println( input.substring(1) + input.charAt(0));
        return reverse(input.substring(1)) + input.charAt(0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is it";
		
      System.out.println(reverse("lambock"));
    //  System.out.println(str.substring(3));
      //System.out.println(str);
	}

}
