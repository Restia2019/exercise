package junit;

import org.junit.Test;

import junit.framework.Assert;

public class JunitTest2 {

	
	public static void main(String[] args) {
        System.out.println(SumUtil.sum1(1, 2));
    }

	@Test
	public void testSum1() {
		int result = SumUtil.sum1(1, 2);
		Assert.assertEquals(result,3);
	}

	@Test
	public void testSum2() {
		int result = SumUtil.sum1(1, 2);
		Assert.assertEquals(result,5);

	}
	
	
}
