import java.util.Scanner;

public class UVa10082_WERTYU {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = "`1234567890-=QWERTYUIOP[]\\\\ASDFGHJKL;'ZXCVBNM,./";
		while(sc.hasNext()) 
		{
			String str = sc.nextLine();
			for(int i = 0; i < str.length(); ++i) 
			{
				if(str.charAt(i) == ' ') 
				{
					System.out.print(' ');
					continue;
				}
				int j = 0;
				while(str.charAt(i) != k.charAt(j))
					j++;
				System.out.print(k.charAt(j-1));
			}
			System.out.println();
		}
	}
}