package jieKou;

public class SupportHero extends Hero implements Heal {

	@Override
    public void heal() {
        System.out.println("进行治疗");
    }
 
}
