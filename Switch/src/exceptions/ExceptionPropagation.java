package exceptions;

import java.io.IOException;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		try {
			methodA();
		} catch (Exception e) {
			
			System.out.println("division by zero not allowed");		}
		
	}

	public static void methodA() throws Exception// throws ArithmeticException
	{  
		System.out.println("methodA");
		methodB();
	}
	
	public static void methodB() throws Exception 
	{
		System.out.println("methodB");
		int a =5 , b=0;
		if(b==0)
		{throw new java.io.IOException("io failed");}
		else {
		int c=a/b;
		System.out.println(c);}
		
	}
}
