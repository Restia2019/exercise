
public class Xiaoxuesuanshu {
	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			int j = 8 - i;
			int k = 14 - i;
			int l = k - 6;
			if (j + l == 10) {
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(l);
			}
		}
	}
}
