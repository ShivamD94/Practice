package strings;

import java.util.Arrays;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,3,6,2,1,9,10,0,7,4,10,-1,11};
		int temp , j ,i;
		for(i=0 ;i<a.length;i++) 
		{ 
			for(j=1;j<a.length;j++) {
			if(a[i]+a[j]==10)
			{
				temp=a[j];
				a[i+1]=temp;
				a[j]=a[i+1];
				
			}j++;}
			
			
		}System.out.println(Arrays.toString(a));
	}

}
