package codes;

import java.util.Arrays;

public class StoreRepeatingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,3,4};
		int b[]=new int[a.length];
		int index=0;
		for(int i=1;i<a.length;i++)
		{
			for(int j=i-1;j<a.length-2;j++)
			{
				if(a[i]==a[j]||i!=j)
					b[index++]=a[j];
				    a[j]= 0;
					
			}
		}System.out.println(Arrays.toString(b));
		
		
		
	}

}
