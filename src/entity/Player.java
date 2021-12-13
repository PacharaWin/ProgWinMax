package entity;

import java.util.List;

import constants.ImageHolder;
import constants.PriorityConstant;
import gui.GameCanvas;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
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
	}
	@Override
	public void draw(final GraphicsContext gc) {
		final double x = this.getPosition().getX();
        final double y = this.getPosition().getY();
        
        if (!this.isMoving() || this.getHealth() == 0) {
            final double imgX = sprite.getWidth();
            final double imgY = sprite.getHeight();
            gc.drawImage(this.getSprite(), x, y, imgX, imgY);
        }
    }
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void update() {
		//final GameEvent ge = SystemCache.getInstance().gameEvent;
//        final int hdir = ge.getHorizontal();
//        final int vdir = ge.getVertical();
        double dx = 0.0;
        double dy = 0.0;
        //final GameCanvas gameCanvas = SystemCache.getInstance().gameCanvas;
        final double minY;
        final double minX;
//        final double cellSize = minX = (minY = 16.0 * SystemCache.getInstance().gameCanvas.getFactor());
//        final double maxY = 768.0 - cellSize;
//        final double maxX = 1024.0 - cellSize;
        final Image image = this.getCurrentImage().get(this.getIdx());
//        final double imgX = image.getWidth() * SystemCache.getInstance().gameCanvas.getFactor();
//        if (this.getPosition().getX() + imgX + this.speed * 0.03 < maxX && this.getPosition().getX() - this.speed * 0.03 > minX) {
//            if (hdir > 0) {
//                this.goRight();
//                dx = this.speed * 0.03;
//            }
//            else if (hdir < 0) {
//                this.goLeft();
//                dx = -(this.speed * 0.03);
//            }
//        }
//        if (this.getPosition().getX() + imgX + this.speed * 0.03 > maxX && hdir < 0) {
//            this.goLeft();
//            dx = -(this.speed * 0.03);
//        }
//        if (this.getPosition().getX() - this.speed * 0.03 < minX && hdir > 0) {
//            this.goRight();
//            dx = this.speed * 0.03;
//        }
//        if (this.getCenter().getY() + this.speed * 0.03 < maxY && this.getCenter().getY() - this.speed * 0.03 > minY) {
//            if (vdir > 0) {
//                dy = this.speed * 0.03;
//            }
//            else if (vdir < 0) {
//                dy = -(this.speed * 0.03);
//            }
//        }
//        if (this.getCenter().getY() + this.speed * 0.03 > maxY && vdir < 0) {
//            dy = -(this.speed * 0.03);
//        }
//        if (this.getCenter().getY() - this.speed * 0.03 < minY && vdir > 0) {
//            dy = this.speed * 0.03;
//        }
//        final List<GameObject> list = SystemCache.getInstance().gameCanvas.getGameObjects();
//        for (final GameObject go : list) {
//            if (go instanceof ICollectable && Utility.isCollide(this, go)) {
//                ((ICollectable)go).pick(this);
//            }
//        }
        this.setPosition(new Point2D(this.getPosition().getX() + dx, this.getPosition().getY() + dy));
//        if (vdir == 0 && hdir == 0) {
//            this.setMoving(false);
//        }
//        else {
//            this.setMoving(true);
//        }
		
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
