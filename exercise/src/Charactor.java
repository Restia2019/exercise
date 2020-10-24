
public class Charactor {
    public String name;
    protected float hp; 
    static String copyright;
     
    public static void main(String[] args) {
           Charactor garen =  new Charactor();
           garen.name = "盖伦";
            
           Charactor.copyright = "版权由Riot Games公司所有";
            
           System.out.println(garen.name);
           System.out.println(garen.copyright);
            
           Charactor.copyright =  "Blizzard Entertainment Enterprise";
           
           Charactor teemo =  new Charactor();
           teemo.name = "提莫";
           System.out.println(teemo.name);     
           System.out.println(teemo.copyright);
         
    }
     
}

