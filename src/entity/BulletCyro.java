package entity;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class BulletCyro extends Bullet{

	public BulletCyro(double speed, int damage, double radius, Point2D direction, Elemental element) {
		super(speed, damage, radius, direction, element);
		// TODO Auto-generated constructor stub
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
