package entity;

import java.util.List;

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
	@Override
	public void draw(GraphicsContext p0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void positionValueCorrection() {
		// TODO Auto-generated method stub
		
	}
    
    
}
