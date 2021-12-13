package entity;

import constants.PriorityConstant;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import object.base.GameObject;

public abstract class Itemdrop extends GameObject{
    protected Point2D position;
    protected boolean isStatic;
    protected boolean isDestroy;
    protected boolean isVisible;
    protected Image sprite;
    protected int z;
    protected Elemental element;
    
    
	public Itemdrop(Point2D position, boolean isStatic, boolean isDestroy, boolean isVisible, Image sprite, int z, Elemental element) {
		super();
		this.position = position;
		this.isStatic = isStatic;
		this.isDestroy = isDestroy;
		this.isVisible = isVisible;
		this.sprite = sprite;
		this.z = z;
		this.element = element;
		this.z = PriorityConstant.getInstance().potion;
	}
	public Point2D getPosition() {
		return position;
	}
	public void setPosition(Point2D position) {
		this.position = position;
	}
	public boolean isStatic() {
		return isStatic;
	}
	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}
	public boolean isDestroy() {
		return isDestroy;
	}
	public void setDestroy(boolean isDestroy) {
		this.isDestroy = isDestroy;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public Image getSprite() {
		return sprite;
	}
	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
    
    
}
