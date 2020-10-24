package morenfangfa;

public interface AD {
		
	public void physicAttack();
	
	default public void attack() {
		System.out.println("进行物理攻击");
	}
}
