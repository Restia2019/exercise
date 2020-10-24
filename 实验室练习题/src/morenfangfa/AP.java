package morenfangfa;

public interface AP {

	public void magicAttack();

	default public void attack() {
		System.out.println("进行魔法攻击");
	}
}
