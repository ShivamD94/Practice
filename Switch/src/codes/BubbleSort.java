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
        	 for(int j=i+1;j<n;j++)
        	 {
        		 if(a[i]>a[j])
        		 {  temp=a[i];
        		    a[i]=a[j];
        		    a[j]=temp;
        		 }
        	 }
         }System.out.println(Arrays.toString(a));
	}

}
