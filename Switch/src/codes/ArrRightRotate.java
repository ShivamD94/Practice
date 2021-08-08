package codes;

import java.util.Arrays;

public class ArrRightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {2,3,4,5,6};
        int n=2;
        for(int i=0;i<n;i++)
        {
        	int last=a[a.length-1];
        	for(int j=a.length-1;j>0;j--)
        	{
        		a[j]=a[j-1];
        	} a[0]=last;
        }
        System.out.println(Arrays.toString(a));
	}

}
