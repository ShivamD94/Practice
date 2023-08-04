package codes;

import java.util.Arrays;

public class FreqByArray {

	public static void freqCount(int arr[] )
	{
		int count=0; int max=arr[0];
		int n=arr.length;
		boolean [] visited=new boolean[n];
		Arrays.fill(visited, false);
    for(int i=0;i<n;i++)
    {
    	  if(visited[i]==true)
    	   continue;
    	  else
    	  count=1;
    	  for(int j=i+1;j<n;j++)
    	  {
    		  if(arr[i]==arr[j])
    		  {  visited[j]=true;
    		    count++;}
    	  }
    	 
    	  System.out.println(arr[i]+"::"+count);
    	  max=Math.max(max, count);
    	 
    } System.out.println(max);
      System.out.println(Arrays.toString(visited));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,3,4}; // {2,3,4,5,5,6,7,3,4,5,8,9,7,6,5};
		freqCount(a);

	}

}
