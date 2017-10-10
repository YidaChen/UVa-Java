import java.util.Scanner;

public class UVa10235_SimplyEmirp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int N = sc.nextInt();
			
			if(!isPrime(N)) 
			{
				System.out.printf("%d is not prime.\n", N);
				continue;
			}
			int reverseN = reverseInt(N);
			if(N != reverseN && isPrime(reverseN))
				System.out.printf("%d is emirp.\n", N);
			else 
				System.out.printf("%d is prime.\n", N);
		}
	}
	static boolean isPrime(int n) //判斷質數
	{
		if(n <= 1) return false;
		int sqrtN = (int) Math.sqrt(n);
		
		for(int i = 2; i <= sqrtN; ++i) 
			if(n % i == 0)
				return false;
		
		return true;
	}
	static int reverseInt(int n) //反轉數字
	{
		int r = 0;
		for(; n != 0; n/=10)
			r = r * 10 + n % 10;
		return r;
	}
}