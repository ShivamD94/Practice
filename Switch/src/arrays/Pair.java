package arrays;

import java.util.Arrays;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,3,6,2,1,9,10,0,7,4,10,-1,11};
		int low=0 , count=0;
		int high=a.length-1;
		int b[] = new int [a.length];
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		 while (low < high) {
	            if (a[low] + a[high] == 10) {
					/*
					 * System.out.println("The pair is : (" + a[low] + ", " + a[high] + ")");
					 */
	            	b[count++]=a[low];
	            	b[count++]=a[high];
	            	//count++;
	            	
	            }
	            if (a[low] + a[high] > 10) {
	                high--;
	            }
	            else {
	                low++;
	            }
	        }System.out.println(Arrays.toString(b));
	    }
}
