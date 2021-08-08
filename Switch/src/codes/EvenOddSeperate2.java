package codes;
//Code to separate even no and odd no , even no comes first of all odd no
import java.util.*; 
	public class EvenOddSeperate2{
	     public static void main(String []args)
	     {
	     int a[]= {1,1,1,0,0,0};
	     int temp ,j=-1;
	     for(int i=0;i<a.length;i++)
	     {  if(a[i]%2==0)
	     { j++;
	        temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
	     }
	    	 
	     }
	     System.out.println(Arrays.toString(a));
	     }
	}

