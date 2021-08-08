package threading;

public class Thread1 extends Thread{

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
		t1.start();
		t2.run();
		
	
	}

 
}
