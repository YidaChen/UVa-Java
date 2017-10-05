/*
 * 替換文章內的",第奇數個打印``,第偶數個打印''
 * */
import java.util.Scanner;

class UVa272_TEXQuotes {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolean isOdd = true;
		
		while(sc.hasNext()) 
		{
			String line = sc.nextLine();
			
			for(int i = 0; i < line.length(); ++i) 
			{
				if(line.charAt(i) == '"') 
				{
					if(isOdd)
						System.out.print("``");
					else
						System.out.print("''");
					isOdd = !isOdd;
				} 
				else
					System.out.print(line.charAt(i));
			}
			System.out.println();
		}
	}
}