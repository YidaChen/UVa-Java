import java.util.Scanner;

public class UVa10018_ReverseAndAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-- > 0) 
		{
			long P = sc.nextInt();
			long r = reverseInt(P);
			int count = 0;
			while(P != r) 
			{
				P += r;
				r = reverseInt(P);
				count++;
			}
			System.out.println(count + " " + P);
		}
	}
	static long reverseInt(long n) //反轉數字
	{
		long r = 0;
		while(n != 0) 
		{
			long lastDigit = n % 10;
			r = r * 10 + lastDigit;
			n /= 10;
		}
		return r;
	}
}