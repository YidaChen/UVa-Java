/*
 * https://zerojudge.tw/ShowProblem?problemid=a131
 * */
import java.util.Scanner;

public class UVa739_SoundexIndexing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[] soundex = {0,1,2,3,0,1,2,0,0,2,2,4,5,5,0,1,2,6,2,3,0,1,0,2,0,2};

		System.out.println("         NAME                     SOUNDEX CODE");
		while(sc.hasNext()) 
		{
			String name = sc.next();
			char[] code = {name.charAt(0), '0', '0', '0'};
			
			for(int i = 1, c = 1; i < name.length() && c < 4; ++i) 
			{
				int cur = soundex[name.charAt(i)-65];
				if(cur == 0) continue;
				if(cur == soundex[name.charAt(i-1)-65]) continue;
				code[c] = Integer.toString(cur).charAt(0);
				++c;
			}
			System.out.printf("         %s",name);
			for(int i = name.length(); i < 25; ++i)
				System.out.print(" ");
			System.out.println(code);
		}
		System.out.println("                   END OF OUTPUT");
	}
}