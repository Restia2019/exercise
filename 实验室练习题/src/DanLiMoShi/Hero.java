package DanLiMoShi;

//饿汉式单例模式

public class Hero {
     
    private Hero() {}
    private static Hero hero =new Hero();
     
    public static Hero getInstance() 
    {
        return hero;
    }
}