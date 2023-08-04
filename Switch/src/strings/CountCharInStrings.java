package strings;

public class CountCharInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
		String str= "Thus comes the world to the end";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}System.out.println("the no characters are::"+count);
		
		
		// Count words in string
		String arr[]=str.split(" ");
		int j=arr.length;
		System.out.println("The no of words are "+ j);
	}

}
