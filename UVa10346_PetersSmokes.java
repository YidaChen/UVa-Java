/*
 * Peter有 n 支紙煙，他一支一支的抽並且把煙屁股留起來。
 * 當他有 k 支菸屁股（k>1）時他可以把它們捲成一支新的紙煙
 * 請問Peter共可以抽幾支紙煙？
 * */
import java.util.Scanner;

public class UVa10346_PetersSmokes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) 
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a = n, c;
			while(n >= k) 
			{
				c = n / k;
				a += c;
				n = c + n % k;
			}
			System.out.println(a);
		}
	}
}