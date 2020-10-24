package tostring;

public class Hero {
	public String name; 
    public float hp;
      
    public String toString(){
        return name;
    }
      
    public static void main(String[] args) {
         
        Hero h = new Hero();
        h.name = "盖伦";
        h.hp = 5;
        System.out.println(h.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(h);
    }
}
