package duoTai;

public class AdHero extends Hero implements Mortal{

    protected int adattack;
    public void die()
	{
		System.out.print("物理英雄死了！");
	}
}
