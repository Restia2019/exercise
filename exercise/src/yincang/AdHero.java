package yincang;

public class AdHero extends Hero{
	public static void battleWin(){
        System.out.println("ad hero battle win");
    }    
     
    public static void main(String[] args) {
    	Hero.battleWin();
        AdHero.battleWin();
        Hero h = new Hero();
    }
}
