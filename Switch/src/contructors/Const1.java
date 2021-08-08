package contructors;

public class Const1 {

	int i ;
	String name;
	float f;
	Const1(int i,  String n)
	{
		this.i=i;
		this.name=n;
		System.out.println(i+" "+name);
	}
	Const1(int i, String n, float f)
	{  this.i=i;
	   this.name=n;
	   this.f=f;
	   System.out.println(i+" "+name+" "+f);
	   }

		 Const1(String n ,float f) {
		  
		  this.name=n; this.f=f; 
		  System.out.println("this is third contructor");
		  System.out.println(name+" "+f);
		  }
		 
	public static void main(String[] args) {
		
       Const1 s=new Const1("kalan",101);
       System.out.println(s);
	}

}
