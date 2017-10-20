import java.util.Scanner;

public class UVa12250_LanguageDetection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; true; ++i) 
		{
			String str = sc.next();
			String lang;
			if(str.equals("HELLO")) lang = "ENGLISH";
			else if(str.equals("HOLA")) lang = "SPANISH";
			else if(str.equals("HALLO")) lang = "GERMAN";
			else if(str.equals("BONJOUR")) lang = "FRENCH";
			else if(str.equals("CIAO")) lang = "ITALIAN";
			else if(str.equals("ZDRAVSTVUJTE")) lang = "RUSSIAN";
			else if(str.equals("#")) break;
			else lang = "UNKNOWN";
			
			System.out.printf("Case %d: %s\n", i, lang);
		}
	}
}