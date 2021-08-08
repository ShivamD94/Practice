package arrays;

import java.util.Arrays;

public class MaxinArray {
	public static void main(String[] args) {
		
		int a[]={8,3,7,5,4,9,6};
	    int n=3;
	    int maxsum=0;
	    int tempsum=0;
	    for(int i=0;i<n;i++)
	    {
	      maxsum=maxsum+a[i];
	    }
	    tempsum=maxsum;
	    for(int i=n;i<a.length;i++)
	    {
	      tempsum=tempsum-a[i-n]+a[i];
	      maxsum=Math.max(tempsum,maxsum);
	    }System.out.println(maxsum);
	  }

}
