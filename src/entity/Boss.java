package entity;

import java.util.List;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import object.base.GameObject;

public abstract class Boss extends GameObject {
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
	private ProgressBar healthBar;
	protected Elemental element;
	protected boolean isLeft;

	public abstract void Draw();

	public abstract void Update();

	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	public Boss() {
		this.name = "Boss";
		this.radius = 100;
	}

	public abstract void shoot(Point2D pos1, Point2D pos2);

	public abstract void draw(final GraphicsContext gc);

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

	public void setHealth(double health) {
		this.health = health;
	}

	public double getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(double maxHealth) {
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
