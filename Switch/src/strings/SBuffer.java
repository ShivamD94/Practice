package strings;

public class SBuffer {

	public static void main(String[] args) {

StringBuffer sb= new StringBuffer("hallucination");
System.out.println(sb.capacity());
System.out.println(sb.append(" hun"));
System.out.println(sb.insert(6, "kyun"));
System.out.println(sb.replace(6, 10, ""));
System.out.println(sb.delete(7, 13));
System.out.println(sb.reverse());
System.out.println(sb.capacity());
	

	}

}
