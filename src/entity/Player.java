package entity;

import java.util.ArrayList;
import java.util.List;

import constants.GameConstant;
import constants.ImageHolder;
import constants.PriorityConstant;
import constants.SoundHolder;
import gui.GameCanvas;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import object.base.GameObject;

public class Player extends GameObject{
	protected String name;
    protected String description;
    protected double health;
    protected double maxHealth;
    protected int attack;
    protected double defense;
    protected int speed;
    protected int idx;
    protected List<Image> currentImage;
    protected Image dead;
    protected boolean isLeft;
    private boolean isMoving;
    private boolean isSkillActive;
    private double interval;
    private double cooldown;
    private int skillManaUse;
    protected Elemental element;
    private static final double W = 600, H = 400;
    private Image heroImage;
    private Node  hero;
    boolean running, goNorth, goSouth, goEast, goWest;
    
    public Player() {
    	this.name = "witch";
    	this.health = 100;
    	this.maxHealth = 100;
    	this.attack = 50;
    	this.defense = 10;
    	this.speed = 10;
    	this.isLeft = false;
    	this.isMoving = false;
    	this.sprite = ImageHolder.getInstance().players.get(0 );
    	heroImage = ImageHolder.getInstance().players.get(0);
	    hero = new ImageView(heroImage);
	    this.element = Elemental.DEFAULT;
	    
    }
    
    public Elemental getElement() {
		return element;
	}

	public void setElement(Elemental element) {
		this.element = element;
	}

	public Player(Point2D pos) { 
    	this();
    	this.setPosition(pos);
    	this.radius = 40;
    	this.speed = 5;
    }
    
	public Player(String name, String description, int health, int maxHealth, int attack, double defense, int speed,
			Point2D center, int idx, List<Image> currentImage, Image dead, boolean isLeft, boolean isMoving,
			boolean isSkillActive, double interval, double cooldown, int skillManaUse) {
		super();
		this.name = name;
		this.description = description;
		this.health = health;
		this.maxHealth = maxHealth;
		this.attack = attack;
		this.defense = defense;
		this.speed = speed;
		this.idx = idx;
		this.currentImage = currentImage;
		this.dead = dead;
		this.isLeft = isLeft;
		this.isMoving = isMoving;
		this.isSkillActive = isSkillActive;
		this.interval = interval;
		this.cooldown = cooldown;
		this.skillManaUse = skillManaUse;
		this.z = PriorityConstant.getInstance().player;
		this.sprite = ImageHolder.getInstance().players.get(0);
		heroImage = ImageHolder.getInstance().players.get(0);
	    hero = new ImageView(heroImage);
	}
	@Override
	public void draw(final GraphicsContext gc) {
		final double x = this.getPosition().getX();
        final double y = this.getPosition().getY();
        
        
        final double imgX = sprite.getWidth();
            final double imgY = sprite.getHeight();
            gc.drawImage(this.getSprite(), x, y, imgX, imgY);
            //System.out.println(x);

    }
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void update() {
		ArrayList<KeyCode> keyPressed = GameConstant.keyPressed;
		//System.out.println("Test");
		if (keyPressed.contains(KeyCode.A) && this.getPosition().getX()>-20) {
			this.setPosition(new Point2D(this.getPosition().getX()-this.speed, this.getPosition().getY()));
        }
        if (keyPressed.contains(KeyCode.S) && this.getPosition().getY()<520) {
        	this.setPosition(new Point2D(this.getPosition().getX(), this.getPosition().getY()+this.speed));
        }
        if (keyPressed.contains(KeyCode.W) && this.getPosition().getY()>300) {
        	this.setPosition(new Point2D(this.getPosition().getX(), this.getPosition().getY()-this.speed));
        }
        if (keyPressed.contains(KeyCode.D)&& this.getPosition().getX()<980) {
        	this.setPosition(new Point2D(this.getPosition().getX()+this.speed, this.getPosition().getY()));
        }
        if(keyPressed.contains(KeyCode.SPACE)) {
			shoot();
			
		}
        
	}
	private int cnt = 28;
	private void shoot() {
		cnt--;
		if(cnt > 0) return;
		if(this.element.equals(Elemental.DEFAULT)) {
			BulletDefault bul = new BulletDefault(this.getPosition(), Elemental.DEFAULT);
			SoundHolder.getInstance().shootSound1.stop();
			SoundHolder.getInstance().shootSound1.play(0.7);
			GameCanvas.toBeAdd(bul);
			cnt=28;
			System.out.println("de");
		} else if(this.element.equals(Elemental.FIRE)) {
			BulletDefault bul = new BulletDefault(this.getPosition(), Elemental.FIRE);
			SoundHolder.getInstance().shootSound1.stop();
			SoundHolder.getInstance().shootSound1.play(0.7);
			GameCanvas.toBeAdd(bul);
			System.out.println("fi");
			cnt=28;
		} else if(this.element.equals(Elemental.WATER)) {
			BulletDefault bul = new BulletDefault(this.getPosition(), Elemental.WATER);
			SoundHolder.getInstance().shootSound1.stop();
			SoundHolder.getInstance().shootSound1.play(0.7);
			GameCanvas.toBeAdd(bul);
			System.out.println("wa");
			cnt=28;
		} else if(this.element.equals(Elemental.SNOW)) {
			BulletDefault bul = new BulletDefault(this.getPosition(), Elemental.SNOW);
			SoundHolder.getInstance().shootSound1.stop();
			SoundHolder.getInstance().shootSound1.play(0.7);
			GameCanvas.toBeAdd(bul);
			System.out.println("sno");
			cnt=28;
		}
		
	}
	@Override
	public void positionValueCorrection() {
		// TODO Auto-generated method stub
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double d) {
		if(d >= this.maxHealth) {
			this.health = maxHealth;
		} else {
			this.health = d;
		}
		
	}
	public double getMaxHealth() {
		return maxHealth;
	}
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public double getDefense() {
		return defense;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public List<Image> getCurrentImage() {
		return currentImage;
	}
	public void setCurrentImage(List<Image> currentImage) {
		this.currentImage = currentImage;
	}
	public Image getDead() {
		return dead;
	}
	public void setDead(Image dead) {
		this.dead = dead;
	}
	public boolean isLeft() {
		return isLeft;
	}
	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}
	public boolean isMoving() {
		return isMoving;
	}
	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}
	public boolean isSkillActive() {
		return isSkillActive;
	}
	public void setSkillActive(boolean isSkillActive) {
		this.isSkillActive = isSkillActive;
	}
	public double getInterval() {
		return interval;
	}
	public void setInterval(double interval) {
		this.interval = interval;
	}
	public double getCooldown() {
		return cooldown;
	}
	public void setCooldown(double cooldown) {
		this.cooldown = cooldown;
	}
	public int getSkillManaUse() {
		return skillManaUse;
	}
	public void setSkillManaUse(int skillManaUse) {
		this.skillManaUse = skillManaUse;
	}
	
    
    
}
