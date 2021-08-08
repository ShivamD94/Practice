package finalKeyword;

public class FinalVar {
       final int x=100;
       public void prints()
       {
    	   final int y=200;
    	   System.out.println(y);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 FinalVar v1=new FinalVar();
 FinalVar v2=new FinalVar();

 System.out.println(v1.x);
 System.out.println(v2.x);
 v1.prints();
 System.out.println(v2);
 }
	   final void play()
	 { System.out.println("this is parent class");}
	 
}
