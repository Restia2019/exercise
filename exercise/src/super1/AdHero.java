package super1;

public class AdHero extends Hero{
	  
     
    public AdHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }
     
    public static void main(String[] args) {
        new AdHero("德莱文");
    }
}
