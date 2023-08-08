package Java8;

@FunctionalInterface
interface Sayable {
	
 public String Say(String message);	
}
public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable s= (message)->{
			String str1=message;
			String str2="I have some good new";
			return str1+str2 ;
		};
		
		System.out.println(s.Say("Hello people , "));
	}

}
