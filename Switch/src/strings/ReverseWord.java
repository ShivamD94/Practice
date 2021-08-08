package strings;

public class ReverseWord {
	
	public void reverseStringWord(String str)
	{
     String[] words=str.split(" ");
     String reverse="";
    // System.out.println(words[0]+words[1]+words[2]);
     for(int i=words.length-1;i>=0;i--)
     {
    	 reverse=reverse+words[i]+" ";
     }
     System.out.println(reverse);
     String reverseString="";
     for(int i=reverse.length()-1;i>=0;i--)
     { reverseString=reverseString+reverse.charAt(i);
     }
     System.out.println(reverseString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ReverseWord p1=new ReverseWord();
    p1.reverseStringWord("this is new");
	}

}
