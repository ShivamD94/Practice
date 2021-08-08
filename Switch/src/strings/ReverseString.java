package strings;

public class ReverseString {

	public String reverse(String str )
	{
		 if(str.isEmpty())
		 { System.out.println("the string is now empty");
		 return str;
		 }
		return reverse(str.substring(1))+str.charAt(0);
			
	}
	public static void main(String[] args) {
	
		ReverseString s1=new ReverseString();
		String s2="names";
		String rev="";
		
		System.out.println(s1.reverse(s2));

	}

}
