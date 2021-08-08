package strings;

public class SBuffer1 {
	public static void stringConcat()
	{  String t="Java";
	    for(int i=0;i<1000;i++)
	    {
	    	t=t+" Java";
	    }
		}
	public static void stringBufferConcat()
	{  StringBuffer t=new StringBuffer("Java");
	    for(int i=0;i<1000;i++)
	    {
	    	t=t.append("Java");
	    } 
		}
	public static void stringBuilderConcat()
	{  StringBuilder t=new StringBuilder("Java");
	    for(int i=0;i<1000;i++)
	    {
	    	t=t.append("Java");
	    } 
		}
	
	public static void main(String args[])
	{
		long time=System.currentTimeMillis();
		stringConcat();
		System.out.println("time taken by string concat :="+(System.currentTimeMillis()-time)+"ms");
		time=System.currentTimeMillis();
		stringBufferConcat();
		System.out.println("time taken by string buffer concat :="+(System.currentTimeMillis()-time)+"ms");
		time=System.currentTimeMillis();
		stringBuilderConcat();
		System.out.println("time taken by string builder concat :="+(System.currentTimeMillis()-time)+"ms");
		
	}
}
