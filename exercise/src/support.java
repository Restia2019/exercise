
public class support extends hero{

	public void heal(hero a, int b ) {
			System.out.println(name + "治疗了 " + a.name + b + "点血量");

	}
	
	public static void main(String[] args) {
        support sh = new support();
        sh.name = "赏金猎人";
 
        hero h1 = new hero();
        h1.name = "盖伦";
        hero h2 = new hero();
        h2.name = "提莫";
 
        sh.heal(h1, 50);

 
    }
	

}
