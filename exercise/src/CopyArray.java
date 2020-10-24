
public class CopyArray {

	public static void main(String[] args) {
		int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);
        
        int[] b = new int[5];
        b[0] = (int) (Math.random() * 100);
        b[1] = (int) (Math.random() * 100);
        b[2] = (int) (Math.random() * 100);
        b[3] = (int) (Math.random() * 100);
        b[4] = (int) (Math.random() * 100);
        
        int[] c = new int[10];
        System.arraycopy(a, 0, c, 0, 5);
        System.arraycopy(b, 0, c, 5, 5);
        
        for(int each: a)
        	System.out.print(each+" ");
        System.out.println();
        
        for(int each: b)
        	System.out.print(each+" ");
        System.out.println();
        
        for(int each: c)
        	System.out.print(each+" ");
	}

}
