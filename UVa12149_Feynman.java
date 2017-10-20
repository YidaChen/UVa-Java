/*
 * 在一個 N × N 的方格中含有幾個不同的正方形？
 * 1^2+2^2+3^2+...+n^2 = n(n+1)(2n+1)/6
 * */
import java.util.Scanner;

public class UVa12149_Feynman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) 
		{
			int N = sc.nextInt();
			if(N == 0) break;
			
			int sum = N * (N+1) * (2*N+1) / 6;
			System.out.println(sum);
		}
	}

}
