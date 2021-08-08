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
		
		
	}

}
