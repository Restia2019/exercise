package lambda;

public class Hero {
	String name; // 姓名
	float hp; // 血量
	float damage; // 护甲

	public Hero()
	{
		
	}
	
	public Hero(String name, float hp, float damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]";
	}

}
