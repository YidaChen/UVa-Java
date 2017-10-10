/*
 * 給平行四邊形三點,求第四點
 * 解: 對角線兩點座標相加 = 另一對角線兩點座標相加
 * */
import java.util.Scanner;

public class UVa10242_FourthPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) 
		{
			Coordinate a = new Coordinate(sc.nextDouble(), sc.nextDouble());
			Coordinate b = new Coordinate(sc.nextDouble(), sc.nextDouble());
			Coordinate c = new Coordinate(sc.nextDouble(), sc.nextDouble());
			Coordinate d = new Coordinate(sc.nextDouble(), sc.nextDouble());
			Coordinate e = new Coordinate();
			
			if(a.x == c.x && a.y == c.y) 
			{
				e.x = b.x + d.x - a.x;
				e.y = b.y + d.y - a.y;
			} 
			else if(a.x == d.x && a.y == d.y) 
			{
				e.x = b.x + c.x - a.x;
				e.y = b.y + c.y - a.y;
			}
			else if(c.x == b.x && c.y == b.y) 
			{
				e.x = a.x + d.x - b.x;
				e.y = a.y + d.y - b.y;
			}
			else if(d.x == b.x && d.y == b.y) 
			{
				e.x = a.x + c.x - b.x;
				e.y = a.y + c.y - b.y;
			}
			System.out.printf("%.3f %.3f\n",e.x, e.y);
		}
	}
	static class Coordinate{
		public double x;
		public double y;
		
		public Coordinate(double a, double b) {
			x = a;
			y = b;
		}
		public Coordinate() {
			
		}
	}
}