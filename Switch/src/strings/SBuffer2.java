package strings;

public class SBuffer2 {

	public static void main(String[] args) {
		System.out.println("hashcode of string");
		String str="hello";
		System.out.println(str.hashCode());
		str=str+" java";
		System.out.println(str.hashCode());
		
		System.out.println("==========================");
		System.out.println("hashcode of stringbufffer");
		StringBuffer str1=new StringBuffer("hello");
		System.out.println(str1.hashCode());
		str1=str1.append(" java");
		System.out.println(str1.hashCode());
		
		System.out.println("==========================");
		System.out.println("hashcode of stringbuilder");
		StringBuilder str2=new StringBuilder("hello");
		System.out.println(str2.hashCode());
		str2=str2.append(" java");
		System.out.println(str2.hashCode());
		

	}

}
