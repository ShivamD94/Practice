package codes;

public class Max2sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {2,5,6,3,9,-8};
       int high=a.length-1;
       int low=0;
       int max=Integer.MIN_VALUE;
       while(low<high)
       {    int curr=a[high]+a[low];
            if(curr>max)
            {max=curr;}
            if(a[high]<a[low])
            	high--;
            else
            	low++;
    	   
       }
     //  System.out.println(max);
       
       int b[]={1,3,6,2,1,0,10};
       int temp;
       int max1=Integer.MIN_VALUE;
   	for(int i=0;i<a.length;i++)
       {
           for (int j=i+1;j<a.length;j++)
           {
               int sum=a[i]+a[j];
                  max1=Math.max(max1,sum);
           }
       }
       System.out.println(max1);
     
	}

}
