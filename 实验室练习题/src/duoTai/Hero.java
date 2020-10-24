package duoTai;

public class Hero {
	public String name; 
    protected float hp;
    public void kill(Mortal m)
    {
    	m.die();
    }
}
