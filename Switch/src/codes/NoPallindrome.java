package codes;

public class NoPallindrome {
public static void noPallindorme(int no)
{
	int rev=0;
	int temp=no;
	String c=Integer.toString(rev);
	while(no>0)
	{
		rev=(rev*10)+no%10;
		no=no/10;
	}
	System.out.println(rev);
	if(rev==temp)
		System.out.println("no is pallindrome");
	else
		System.out.println("not pallindrome".toUpperCase());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		noPallindorme(549);
	}

}
