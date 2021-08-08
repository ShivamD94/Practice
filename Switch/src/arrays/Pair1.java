package arrays;

import java.util.Arrays;

public class Pair1 {
	public void separate(int a[] , int sum)
	{
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int low=0,count=0;
		int high=a.length-1;
		int b[]=new int[a.length];
		
		while(low < high)
		{
			if(a[low] + a[high]==sum)
			{
				b[count++]=a[low];
				b[count++]=a[high];
			}
			if(a[low]+a[high]>sum)
			{ high--;}
			else {
				low++;}
		}System.out.println(Arrays.toString(b));
		}

	public static void main(String[] args) {
		Pair1 p=new Pair1();
		int arr[]= {-1,10,11,9,0,1,7,4,3,6,2,8};
		p.separate(arr, 10);
	}
}
