package entity;

import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import object.base.GameObject;

public abstract class Boss extends GameObject {
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
    private ProgressBar healthBar;
    protected Elemental element;
    
    
	public Boss(String name, String description, int health, int maxHealth, int attack, double defense, int speed,
			Point2D center, int idx, List<Image> currentImage, Image dead, ProgressBar healthBar, Elemental element) {
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
		this.healthBar = healthBar;
		this.element = element;
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
	public ProgressBar getHealthBar() {
		return healthBar;
	}
	public void setHealthBar(ProgressBar healthBar) {
		this.healthBar = healthBar;
	}
	public Elemental getElement() {
		return element;
	}
	public void setElement(Elemental element) {
		this.element = element;
	}
    
    
}
