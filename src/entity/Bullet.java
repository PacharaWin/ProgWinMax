package entity;

import java.util.List;

import constants.PriorityConstant;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import object.base.GameObject;

public abstract class Bullet extends GameObject{
	protected double speed;
    protected int damage;
    protected double radius;
    protected Point2D direction;
    protected List<Image> currentImage;
    public Elemental getElement() {
		return element;
	}
	public void setElement(Elemental element) {
		this.element = element;
	}
	protected Elemental element;
    
    
	public Bullet() {
		super();
		this.radius = 5;
		this.damage = 5;
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
	public Point2D getCenter() {
		return new Point2D(this.getPosition().getX() + this.getRadius(), this.getPosition().getY() + this.getRadius());
    }
	protected boolean collideWith(GameObject other){
		return Math.hypot(this.getCenter().getX()-other.getCenter().getX(), this.getCenter().getY()-other.getCenter().getY()) <= this.radius+other.getRadius();
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
	public void setDirectionToTarget(final Point2D target) {

        double angle = Math.atan2(target.getX() - this.getPosition().getX(), target.getY() - this.getPosition().getY());
        angle += 1.5707963267948966;
        final double x = Math.cos(angle) * -1.0;
        final double y = Math.sin(angle);
        double dy = this.speed;
        double dx = (dy/y)*x;
        this.direction = new Point2D(dx, dy);
    }

    
    
}
