package strings;

public class Concat {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2= s1.concat(" Tendulkar");
		System.out.println(s2);
		System.out.println(s2.substring(6));
		System.out.println(s2.substring(0, 8));
		String s = 20+30+"Sachin"+40+40;
		System.out.println(s);
		String s3= (new StringBuilder().append("Saching").append("Tendulkar")).toString();
		System.out.println(s3);
        String str = "This is a spaced out string" ;
        String ar[]= str.split(" ");
        String strNew ="";
        for ( int i=ar.length-1 ; i>=0 ; i--)
        {
        	
        	strNew=strNew+ar[i]+" ";
        }
        String rev = "";
        for( int i=strNew.length()-1; i>=0;i--)
        {
        	rev=rev+strNew.charAt(i);
        }
        System.out.println(rev);
	}

}
