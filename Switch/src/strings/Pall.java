package strings;

public class Pall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String original ="ravi", reverse="";
		int length = original.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		if(original.equals(reverse))
			System.out.println("pallindrom");
		else
			System.out.println("non pallindrome");
	}

}
