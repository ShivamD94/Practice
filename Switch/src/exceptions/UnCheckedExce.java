/**
 * 
 */
package exceptions;

/**
 *Unchecked exceptions
 *
 */
public class UnCheckedExce extends Exception{

	
	public static void main(String[] args ) throws UnCheckedExce {
		// TODO Auto-generated method stub
try {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int sum=a+b;
	System.out.println(sum);
	throw new UnCheckedExce();
} catch (ArrayIndexOutOfBoundsException e) {
	
	e.printStackTrace();
}
	}

}
