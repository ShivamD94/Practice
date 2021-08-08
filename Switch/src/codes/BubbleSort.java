package codes;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {2,4,6,7,2,8,9,5};
         int temp;
         int n=a.length;
         for(int i=0;i<n;i++)
         {
        	 for(int j=1;j<n;j++)
        	 {
        		 if(a[j-1]>a[j])
        		 {  temp=a[j-1];
        		    a[j-1]=a[j];
        		    a[j]=temp;
        		 }
        	 }
         }System.out.println(Arrays.toString(a));
	}

}
