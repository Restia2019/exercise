import java.util.Arrays;

public class ErweiArraySort {

	public static void main(String[] args) {
		int[][] a = new int[5][8];
		int[] b = new int[40];
		int i, j;
		for (i = 0; i <= 4; i++)
			for (j = 0; j <= 7; j++)
				a[i][j] = (int) (Math.random() * 100);
		j = 0;
		for (i = 0; i <= 4; i++) {
			System.arraycopy(a[i], 0, b, j, 8);
			j = j + 8;
		}
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		j = 0;
		for (i = 0; i <= 4; i++) {
			System.arraycopy(b, j, a[i], 0, 8);
			j = j + 8;
		}
		System.out.println(Arrays.toString(a[0]));
	}

}
