package exceptions;

import java.io.IOException;

public class TestThrowAndThrows  
{  
    // defining a user-defined method  
    // which throws ArithmeticException  
    static void method() throws IOException  
    {  
        System.out.println("Inside the method()");  
        throw new java.io.IOException("throwing ArithmeticException");  
    }  
    //main method  
    public static void main(String args[])  
    {  
        try  
        {  
            method();  
        }  
        catch(IOException e)  
        {  
            System.out.println("caught in main() method");  
        }  
    }  
}  