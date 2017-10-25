import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UVa11849_CD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N == 0 && M == 0) break;
			
			int both = 0;
			Set<Integer> s = new HashSet<Integer>();
			
			while(N-- > 0)
				s.add(sc.nextInt());
			while(M-- > 0)
				if(s.contains(sc.nextInt()))
					both++;
			
			System.out.println(both);
		}
	}
}