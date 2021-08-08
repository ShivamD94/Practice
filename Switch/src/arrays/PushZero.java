package arrays;

import java.util.Arrays;

public class PushZero {

	
	public void pushzero(int arr[], int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}while(count<n)
			arr[count++]=0;
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PushZero p=new PushZero();
		int arr[]= {0,1,1,0};
		int n=arr.length;
		p.pushzero(arr, n);

	}

}
