package morenfangfa;

public class AdApHero implements AD,AP{

	public void attack(){
		System.out.println("同时进行物理和法术攻击");
	}
	
	public void magicAttack() {
		
	}

	public void physicAttack() {
	
	}

	static public void main(String args[]){
		AdApHero a = new AdApHero();
		a.attack();
	}
	
	


}
