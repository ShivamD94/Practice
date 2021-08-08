package codes;

import java.util.Arrays;

public class BinarSearch {

	public static void main(String[] args) {
	
		int a[]= {20,10,30,50,80,60,90,79};
		Arrays.sort(a);
		int last=a.length-1;
		int first=0; int key=90;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(a[mid]<key)
			{
				first=mid+1;
			}else if(a[mid]==key)
			{
				System.out.println("element found at "+mid);
				break;
			}else
			{last=mid-1;}
			mid=(first+last)/2;
		}

	}

}
