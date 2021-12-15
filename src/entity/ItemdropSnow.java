package entity;

import constants.ImageHolder;
import constants.SoundHolder;
import gui.GameCanvas;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import object.base.GameObject;

public class ItemdropSnow extends Itemdrop{

	public ItemdropSnow(Point2D position, boolean isStatic, boolean isDestroy, boolean isVisible, Image sprite, int z, Elemental element) {
		super(position, isStatic, isDestroy, isVisible, sprite, z, Elemental.SNOW);
		this.sprite = ImageHolder.getInstance().potionPurple;
		// TODO Auto-generated constructor stub
	}
	public ItemdropSnow() {
		super();
		this.sprite = ImageHolder.getInstance().potionPurple;
		this.element = Elemental.SNOW;
	}
	public ItemdropSnow(Point2D id) {
		this();
		this.position = id;

	}

	@Override
	public void draw(GraphicsContext gc) {
		final double x = this.getPosition().getX();
        final double y = this.getPosition().getY();
        
        
        final double imgX = sprite.getWidth();
        final double imgY = sprite.getHeight();
        gc.drawImage(this.getSprite(), x, y, imgX, imgY);
		
	}

	@Override
	public void update() {
		for(GameObject obj: GameCanvas.gameObjects) {
			//System.out.println(obj.getClass());
			if(collideWith(obj) && obj instanceof Player ) {
				SoundHolder.getInstance().pickItemBgm.play();
				//System.out.println("hit");
				((Player) obj).setElement(this.element);
				GameCanvas.toBeErase(this);
			}
		}
		
	}

	@Override
	public void positionValueCorrection() {
		// TODO Auto-generated method stub
		
	}

}
