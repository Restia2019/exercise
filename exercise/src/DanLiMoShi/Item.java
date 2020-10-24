package DanLiMoShi;

//懒汉式单例模式

public class Item {
    
    private Item() {}
     
    private static Item item;
     
    public static Item getIntacne() {
        if(null==item) {
            return new Item();
        }
        return item;
    }
}   
