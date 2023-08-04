package strings;

public class ReverseWrd {

	public void revWord(String str)
	{   
		String newString="";
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
		  newString=newString+words[i]+" ";
		}
		String reverseWords="";
		for(int i=newString.length()-1;i>=0;i--) // temp is a string hence length() and charAt()
		{
			reverseWords=reverseWords+newString.charAt(i);
		}
		System.out.println(reverseWords);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="give me some sunshine";
         ReverseWrd obj=new ReverseWrd();
         obj.revWord(str);
	}

}
