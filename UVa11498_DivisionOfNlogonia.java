import java.util.Scanner;

public class UVa11498_DivisionOfNlogonia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) 
		{
			int K = sc.nextInt();
			if(K == 0) break;
			Coord divPoint = new Coord(sc.nextInt(), sc.nextInt());
			Coord[] point = new Coord[K];
			for(int i = 0; i < K; ++i)
				point[i] = new Coord(sc.nextInt(), sc.nextInt());
			
			for(int i = 0; i < K; ++i) 
			{
				if(point[i].x > divPoint.x && point[i].y > divPoint.y)
					System.out.println("NE");
				else if(point[i].x > divPoint.x && point[i].y < divPoint.y)
					System.out.println("SE");
				else if(point[i].x < divPoint.x && point[i].y < divPoint.y)
					System.out.println("SO");
				else if(point[i].x < divPoint.x && point[i].y > divPoint.y)
					System.out.println("NO");
				else 
					System.out.println("divisa");
			}
		}
	}
	static class Coord 
	{
		int x;
		int y;
		public Coord(int x, int y) 
		{
			this.x = x;
			this.y = y;
		}
	}
}