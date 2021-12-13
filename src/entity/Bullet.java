package entity;

import constants.PriorityConstant;
import javafx.geometry.Point2D;
import object.base.GameObject;

public abstract class Bullet extends GameObject{
	protected double speed;
    protected int damage;
    protected double radius;
    protected Point2D direction;
    protected Elemental element;
    
	public Bullet() {
		super();
	}
	public Bullet(double speed, int damage, double radius, Point2D direction, Elemental element) {
		super();
		this.speed = speed;
		this.damage = damage;
		this.radius = radius;
		this.direction = direction;
		this.element = element;
		this.z = PriorityConstant.getInstance().bullet;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Point2D getDirection() {
		return direction;
	}
	public void setDirection(Point2D direction) {
		this.direction = direction;
	}
    
    
}
