package threading;
//Joins in threading

public class Thread3 {

	public void run() 
	{
		 for(int i=0;i<5;i++)
	     {	 try {
	    		 Thread.sleep(500);
	    	 }catch (Exception e) {
	    		 System.out.println(e);
	    		 
			}
	    	 System.out.println(i);}
		
	}

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		Thread1 t3=new Thread1();
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		t2.start();
		t3.start();
	
	}

 
}
