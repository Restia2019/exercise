package duoTai;

public class ApHero extends Hero implements Mortal{
	
	protected int APadattack;
	public void die()
	{
		System.out.print("魔法英雄死了！");
	}
}
