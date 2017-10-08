import java.util.Scanner;

public class UVa10931_Parity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) 
		{
			int I = sc.nextInt();
			if(I == 0) break;
			
			String B = Integer.toBinaryString(I);
			int P = Integer.bitCount(I);
			
			System.out.printf("The parity of %s is %d (mod 2).\n", B, P);
		}
	}
}