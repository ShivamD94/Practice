package exceptions;

public class ThrowsEx {
	
		  void m()  {
		    throw new ArithmeticException("device error");//unchecked exception
		  }
		  void n()  {
		    m();
		  }
		  void p() {
		//   try{
		    n();
		   //}catch(Exception e){System.out.println("exception handeled");}
		  }
		  public static void main(String args[]) throws Exception {
			  ThrowsEx obj=new ThrowsEx();
		   obj.p();
		   System.out.println("normal flow");
		  }
		


}
