/*
 * 計算每個樹種佔的比例
 * 解: 用map存樹種和出現次數
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class UVa10226_HardwoodSpecies {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		while(N-- > 0) 
		{
			TreeMap<String, Integer> map = new TreeMap<String, Integer>();
			double sum = 0; //共讀了幾棵樹
			while(sc.ready()) //sc.hasNext()
			{
				String str = sc.nextLine();
				if(str.equals("")) break;
				
				if(map.get(str) == null)
					map.put(str, 1);
				else
					map.put(str, map.get(str) + 1);
				sum++;
			}
			for(Map.Entry<String, Integer> entry : map.entrySet()) //循環樹種
				System.out.printf("%s %.4f\n",entry.getKey(), (double)entry.getValue()*100/sum);
			
			if(N != 0)
				System.out.println();
		}
	}
	static class Scanner //防止超時
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException {return Integer.parseInt(next());}

		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}

		public double nextDouble() throws IOException { return Double.parseDouble(next()); }

		public boolean ready() throws IOException {return br.ready();}
	}
}