
public class UVa136_UglyNumbers {

	public static void main(String[] args) {
		int[] ugly = new int[1500];
		ugly[0] = 1;
		int i2 = 0, i3 = 0, i5 = 0;
		
		for(int i = 1; i < 1500; ++i) 
		{
			while(ugly[i2] * 2 <= ugly[i-1]) ++i2;
			while(ugly[i3] * 3 <= ugly[i-1]) ++i3;
			while(ugly[i5] * 5 <= ugly[i-1]) ++i5;
			
			ugly[i] = Math.min(ugly[i2] * 2, Math.min(ugly[i3] * 3, ugly[i5] * 5));
		}
		System.out.printf("The 1500'th ugly number is %d.\n", ugly[1499]);
	}
}