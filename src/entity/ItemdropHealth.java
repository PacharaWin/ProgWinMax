package entity;

import constants.ImageHolder;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ItemdropHealth extends Itemdrop{

	public ItemdropHealth(Point2D position, boolean isStatic, boolean isDestroy, boolean isVisible, Image sprite, int z, Elemental element) {
		super(position, isStatic, isDestroy, isVisible, sprite, z, Elemental.DEFAULT);
		this.sprite = ImageHolder.getInstance().potionGreen;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(GraphicsContext p0) {
		// TODO Auto-generated method stub
		
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
