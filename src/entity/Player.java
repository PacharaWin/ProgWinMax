package entity;

import java.util.ArrayList;
import java.util.List;

import constants.GameConstant;
import constants.ImageHolder;
import constants.PriorityConstant;
import gui.GameCanvas;
import input.InputUtility;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import object.base.GameObject;

public class Player extends GameObject{
	protected String name;
    protected String description;
    protected int health;
    protected int maxHealth;
    protected int attack;
    protected double defense;
    protected int speed;
    protected Point2D center;
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
    	this.health = 1000;
    	this.maxHealth = 1000;
    	this.attack = 50;
    	this.defense = 10;
    	this.speed = 10;
    	this.center = new Point2D(500,300);
    	this.isLeft = false;
    	this.isMoving = false;
    	this.sprite = ImageHolder.getInstance().players.get(0);
    	heroImage = ImageHolder.getInstance().players.get(0);
	    hero = new ImageView(heroImage);
	    
    }
    public Player(Point2D pos) { 
    	this();
    	this.setPosition(pos);
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
		this.center = center;
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
            System.out.println(x);
        
        
    }
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void update() {
		ArrayList<KeyCode> keyPressed = GameConstant.keyPressed;
		/*if (InputUtility.getKeyPressed(KeyCode.W)) {
			this.setCenter(center.subtract(0, -1));
		}
		if (InputUtility.getKeyPressed(KeyCode.A)) {
			this.setCenter(center.subtract(1, 0));
		} else if (InputUtility.getKeyPressed(KeyCode.D)) {
			this.setCenter(center.subtract(-1, 0));
		}
		if (InputUtility.getKeyPressed(KeyCode.S)) {
			this.setCenter(center.subtract(0, 1));
		}
		if (InputUtility.isLeftClickTriggered()) {
			//this.x = InputUtility.mouseX;
			//this.y = InputUtility.mouseY;
		}*/
		System.out.println("Test");
		if (keyPressed.contains(KeyCode.A) && this.getPosition().getX()>-20) {
			this.setPosition(new Point2D(this.getPosition().getX()-4, this.getPosition().getY()));
        }
        if (keyPressed.contains(KeyCode.S) && this.getPosition().getY()<520) {
        	this.setPosition(new Point2D(this.getPosition().getX(), this.getPosition().getY()+4));
        }
        if (keyPressed.contains(KeyCode.W) && this.getPosition().getY()>300) {
        	this.setPosition(new Point2D(this.getPosition().getX(), this.getPosition().getY()-4));
        }
        if (keyPressed.contains(KeyCode.D)&& this.getPosition().getX()<980) {
        	this.setPosition(new Point2D(this.getPosition().getX()+4, this.getPosition().getY()));
        }
        
	}
	private void shoot() {
		
	}
	private void moveHeroBy(int dx, int dy) {
        if (dx == 0 && dy == 0) return;

        final double cx = hero.getBoundsInLocal().getWidth()  / 2;
        final double cy = hero.getBoundsInLocal().getHeight() / 2;

        double x = cx + hero.getLayoutX() + dx;
        double y = cy + hero.getLayoutY() + dy;

        moveHeroTo(x, y);
    }

    private void moveHeroTo(double x, double y) {
        final double cx = hero.getBoundsInLocal().getWidth()  / 2;
        final double cy = hero.getBoundsInLocal().getHeight() / 2;

        if (x - cx >= 0 &&
            x + cx <= W &&
            y - cy >= 0 &&
            y + cy <= H) {
            hero.relocate(x - cx, y - cy);
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
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMaxHealth() {
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
	public Point2D getCenter() {
		return center;
	}
	public void setCenter(Point2D center) {
		this.center = center;
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
