package classZhuanhuan;

public class ClassChange {

	public static void main(String[] args) {

		AdHero ad1 = new AdHero();
		AdHero ad2 = new AdHero();
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		
		h1 = ad1;
		ad2 = (AdHero)h2;
		
	}

}
