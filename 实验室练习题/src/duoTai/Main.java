package duoTai;

public class Main {

	public static void main(String[] args) {
		
		AdHero h1 = new AdHero();
		ApHero h2 = new ApHero();
		AdApHero h3 = new AdApHero();
		
		h1.name = "盖伦1";
		h2.name = "盖伦2";
		h3.name = "盖伦3";
		
		h1.die();
		h2.die();
		h3.die();
		
		Hero h4 = new Hero();
		h4.kill(h1);
		h4.kill(h2);
		h4.kill(h3);
		
	}

}
