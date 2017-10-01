/*
���w���u�W�X���I,��X���u�W�Y�I���C�@�I���̤p���Z���M
��:�Ƨ��I,��X�����,�`���֥[�Z���t
*/
import java.util.Scanner;
import java.util.Arrays;

class UVa10041 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int totalCase = input.nextInt();
		while (totalCase-- > 0) 
		{
			int r = input.nextInt();
			int[] s = new int[r];

			for (int i = 0; i < s.length; ++i)
				s[i] = input.nextInt();

			Arrays.sort(s);

			int median = s[r / 2];
			int distanceSum = 0;
			for (int i = 0; i < s.length; ++i)
				distanceSum += Math.abs(median - s[i]);

			System.out.println(distanceSum);
		}
	}
}
