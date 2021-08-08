package Searching;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = new int[] {12 , 34 , 23, 42 ,14 ,78 ,37 };
		System.out.println(BinarySearch.binarySearch(14 , arr));
		
		
	}

	
	static int binarySearch(int x , int arr[]) {
		
		int p =0 ;
		int r= arr.length-1 ;
		int q=(p+r)/2;
		
		while(p<=r)
		{
			if(x==arr[q])
			{return arr[q];}
			
			else
			if(x>arr[q])
			{
			  p=q+1;
			  
			}
			else
				r=q-1;
		}
		return 0;
	}
}
