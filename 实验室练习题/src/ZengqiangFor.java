

public class ZengqiangFor {

	public static void main(String[] args) {
		int values[] = new int[] {10,50,40,20,30,60};
		int max = 0;
		for(int each:values)
			if(each > max)
				max = each;
		System.out.println(max);
			
	}

}
