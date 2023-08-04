package codes;

public class PrimeNo {
	public static void primeNo(int n)
	{
	for(int i=2;i<=n;i++) {   
		 boolean isPrime = true;
		for(int j=2;j<i;j++)
		{
		   if(i%j==0)
		   isPrime=false;
		}
		if(isPrime)
		{ System.out.println(i);
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PrimeNo.primeNo(19);
	}

}
