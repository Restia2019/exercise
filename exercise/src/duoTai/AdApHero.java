package duoTai;

public class AdApHero extends Hero implements Mortal{
	protected int adattack;
	protected int APadattack;
	public void die()
	{
		System.out.print("双修英雄死了！");
	}
}
