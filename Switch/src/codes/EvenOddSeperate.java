package codes;
//Code to separate even no and odd no , even no comes first of all odd no
import java.util.*; 
	public class EvenOddSeperate{
	     public static void main(String []args)
	     {
	     int a[] = {1,1,0,1,1,0};
	        int j=-1,temp;
	        for (int i=0; i<a.length; i++)
	        {
	        if (a[i]%2==0)
	            {
	                j++;
	                temp=a[i];
	                a[i]=a[j];
	                a[j]=temp;
	            }
	         }
	  
	           System.out.println(Arrays.toString(a));
	        }
	}

