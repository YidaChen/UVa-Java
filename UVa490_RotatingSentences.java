/*
 * 將輸入的所有句子做順時針90度旋轉,打印
 * 解:將每行分別存至陣列
 * 使用雙層迴圈:外層(row,最大句子長度),內層(column,倒循環陣列)
 * */
import java.util.Scanner;

class UVa490_RotatingSentences {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String[] strArr = new String[100];
		int sentences = 0;
		
		while(sc.hasNext()) 
			strArr[sentences++] = sc.nextLine();
		
		for(int i = 0; i < 100; ++i) 
		{
			boolean isPrint = false;
			
			for(int j = sentences - 1; j >= 0; --j) 
			{
				if(i < strArr[j].length()) 
				{
					isPrint = true;
					break;
				}
			}
			if(!isPrint) break;
			
			for(int j = sentences - 1; j >= 0; --j) 
			{
				if(i < strArr[j].length())
					System.out.print(strArr[j].charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}