package constants;

public class PriorityConstant {
	public int boss;
	public int player;
	public int bullet;
	public int potion;
	private static final PriorityConstant instance;
	
	static {
        instance = new PriorityConstant();
    }
    
    public static PriorityConstant getInstance() {
        return PriorityConstant.instance;
    }
    
    public PriorityConstant() {
       
        this.boss = 5;
        this.player = 4;
        this.bullet = 1;
        this.potion = 3;
        
    }
}
