package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void count(int a[])
	{ 
		int[] freq=new int[a.length];
		int counts=0;
		for(int i=0;i<a.length;i++)
		{   
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&a[j]!=0)
				{
					freq[i]++;
					a[j]=0;
				}
			}
		}for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
			{
				System.out.println(a[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {5,6,5,2,4,6,5,6};
		
     Test.count(arr);
		
	}

}
