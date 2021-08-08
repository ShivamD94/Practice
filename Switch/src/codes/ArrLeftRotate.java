package codes;

import java.util.Arrays;

public class ArrLeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a[]= {1,2,3,4,5};
            for(int i=0;i<3;i++)
            {
            	int first=a[0];
            	for(int j=1;j<a.length;j++)
            	{
            		a[j-1]=a[j];
            	}a[a.length-1]=first;
            }System.out.println(Arrays.toString(a));
	}

}
