package codes;

public class Max3Sum {
	
		  
		  public static int maxSum(int a[])
		  {
		    int max1=Integer.MIN_VALUE;
		     int max2=Integer.MIN_VALUE;
		     int max3=Integer.MIN_VALUE;
		    for(int i=0;i<a.length;i++)
		    {
		      if(a[i]>max1)
		      { max3=max2;
		        max2=max1;
		        max1=a[i];}
		    }
		    return max1+max2+max3;
		    
		  }
		  public static void main(String[] args) {
		    
		    int a[]={1,3,4,2,6,8};
		    System.out.println(maxSum(a));
		    
		  }
		

}
