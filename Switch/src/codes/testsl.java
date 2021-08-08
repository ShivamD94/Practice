package codes;

public class testsl {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,2,3,4};
		int y[]=x;
		x=new int[2];
		for(int i=0;i<x.length;i++)
		{System.out.println(y[i]+" ");}
		
		String temp[]={"j" ,"a"};
		System.out.println(Math.ceil(-4.7));
		
		boolean a =false;
		if(a=true)
		System.out.println("helo");
		else
			System.out.println("bye");
		
		String str="match";
		str.toUpperCase();
		str+="forCatch";
		String string=str.substring(2,13);
		string=string+str.charAt(4);
		System.out.println(string);
		
		
	
	}
}
