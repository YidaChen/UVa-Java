/*
 * 將10進位與16進位轉換成2進位,計算有幾個1
 * */
import java.util.Scanner;

public class UVa10019_FunnyEncryptionMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		while(N-- > 0) 
		{
			String M = sc.next();
			
			int b1 = Integer.bitCount(Integer.parseInt(M+"", 10));
			int b2 = Integer.bitCount(Integer.parseInt(M+"", 16));
			
			System.out.println(b1 + " " + b2);
		}
	}
}