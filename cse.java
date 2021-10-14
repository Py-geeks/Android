import java.util.Arrays;

public class primalityTest {
	
	public static boolean[] sieveOfEratosthenes(int n)
	{
		boolean isPrime[]= new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		
		for(int i=2; i*i<=n; i++)
		{
			for(int j=i*i; j<=n; j+=i)
				isPrime[j]=false;
		}
		
		return isPrime;
	}

	public static void main(String[] args) {
		boolean isPrime[] = sieveOfEratosthenes(50);
		System.out.println(13+" "+isPrime[13]);
	}
    
}
