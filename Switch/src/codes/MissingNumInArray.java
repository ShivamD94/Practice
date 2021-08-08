package codes;

public class MissingNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5,6,7,8,9,10};
		int n=a.length+1;
		int sum=n*(n+1)/2;
		int  result=0;
		int tempsum=0;
		for(int i=0 ;i<a.length;i++)
		{
			tempsum=tempsum+a[i];
		}
		result=sum-tempsum;
		System.out.println(n);
		System.out.println(sum);
		System.out.println(tempsum);
		System.out.println("the missing number is  :"+result);
	}

}
