package threading;


import java.util.Date;
import java.sql.Timestamp;

public class Thread2 {

	public void run() throws InterruptedException
	{
		Timestamp ts=new  Timestamp(System.currentTimeMillis());
  	  System.out.println("=========="+ts);
		
//      for(int i=0;i<5;i++)
//      {
//    	  Timestamp ts=new  Timestamp(System.currentTimeMillis());
//    	  System.out.println(i+"=========="+ts);
//    	 // System.out.println(i);
//      }
     
		
		}
	public static void main(String[] args) {

Thread2 t1=new Thread2();
Thread2 t2=new Thread2();
try {
	t1.run();
	t2.run();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
}
