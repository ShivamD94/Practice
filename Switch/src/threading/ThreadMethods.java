package threading;

public class ThreadMethods extends Thread {

	public void run()
	{
		//System.out.println("thread is running");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ThreadMethods tm1=new ThreadMethods();
		ThreadMethods tm2=new ThreadMethods();
		
		System.out.println("name of thread1"+":"+tm1.getName());
		System.out.println("name of thread2"+":"+tm2.getName());
		System.out.println("idof thread 1"+":"+tm1.getId());
		
		tm1.start();
		tm2.start();
		
		tm1.setName("apna thread");
		System.out.println("name of thread1 after change"+":"+tm1.getName());
		
		
	}

}
