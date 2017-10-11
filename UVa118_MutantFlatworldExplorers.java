/*
 * 給矩形土地的右上角座標，再依序給定每個機器人的初始座標(x,y)和面向(N,E,S,W)
 * 及一連串的指令集(R:右轉,L:左轉,F:往前一格)，求出每個機器人最後的位置,面向
 * 若機器人超出邊界印出LOST,並標記最後的座標,往後的機器人在此座標將忽略會超出邊界的指令
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class UVa118_MutantFlatworldExplorers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		upperRight = new Coord(sc.nextInt(), sc.nextInt());
		
		while(sc.hasNext()) 
		{
			Coord coord = new Coord(sc.nextInt(), sc.nextInt());
			Robot robot = new Robot(coord, sc.next());
			
			String instruction = sc.next();
			for(int i = 0; i < instruction.length(); ++i) //執行指令集
				robot.instruct(instruction.charAt(i));
			
			System.out.println(robot); //印出機器人最後的位置,面向
		}
	}
	static Coord upperRight; //右上方邊界座標
	static enum Direction  //方位
	{
		N, E, S, W;
		private static Direction[] vals = values(); //防止每次next,prev複製新對象
		public Direction next() //右轉
	    {
	        return vals[(this.ordinal()+1) % vals.length];
	    }
		public Direction prev() //左轉
	    {
	        return vals[(this.ordinal()+3) % vals.length];
	    }
	}
	static class Robot //機器人
	{
		Coord coord; //當前座標
		Direction orientation; //當前面向
		boolean lost = false; //是否掉落
		static ArrayList<Coord> lostCoord = new ArrayList<Coord>(); //掉落的座標
		
		Robot(Coord coord, String orientation)
		{
			this.coord = coord;
			this.orientation = Direction.valueOf(orientation);
		}
		void instruct(char instruction) //執行指令
		{
			if(lost) return;
			
			if(instruction == 'R') 
				orientation = orientation.next();
			
			else if(instruction == 'L') 
				orientation = orientation.prev();
			
			else if(instruction == 'F') 
			{
				if(orientation == Direction.N && coord.y < upperRight.y)
					coord.y++;
				else if(orientation == Direction.S && coord.y > 0)
					coord.y--;
				else if(orientation == Direction.E && coord.x < upperRight.x)
					coord.x++;
				else if(orientation == Direction.W && coord.x > 0)
					coord.x--;
				else 
				{
					for(Coord lostC : lostCoord)
						if(coord.x == lostC.x && coord.y == lostC.y)
							return;
					lost = true;
					lostCoord.add(coord);
				}
			}
		}
		@Override
		public String toString() 
		{
			if(lost)
				return coord.x + " " + coord.y + " " + orientation + " LOST";
			return coord.x + " " + coord.y + " " + orientation;
		}
	}
	static class Coord //座標
	{
		int x;
		int y;
		Coord(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
}