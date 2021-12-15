package entity;

import constants.ImageHolder;
import constants.SoundHolder;
import gui.GameCanvas;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import object.base.GameObject;

public class BulletDefault extends Bullet {

	private static int cnt = 0;
	public BulletDefault() {
		this.currentImage = ImageHolder.getInstance().bullet;
		this.sprite = ImageHolder.getInstance().bullet.get(cnt%4);
		cnt++;
	}
	public BulletDefault(Point2D pos) {
		this();
		this.position = pos;
		this.damage = 100;
	}
	public BulletDefault(double speed, int damage, double radius, Point2D direction, Elemental element) {
		super(speed, damage, radius, direction, element);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(GraphicsContext gc) {
		final double x = this.getPosition().getX();
        final double y = this.getPosition().getY();
        
        
        final double imgX = this.sprite.getWidth();
            final double imgY = sprite.getHeight();
            gc.drawImage(this.getSprite(), x, y, imgX, imgY);
            //System.out.println(x);
		
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		this.setPosition(new Point2D(this.getPosition().getX(), this.getPosition().getY()-5));
		for(GameObject obj: GameCanvas.gameObjects) {
			//System.out.println(obj.getClass());
			if(collideWith(obj) && obj instanceof Boss ) {
				//Boss hp decrease
				//System.out.println("hit");
				((Boss) obj).setHealth(((Boss) obj).getHealth() - this.damage);
				GameCanvas.toBeErase(this);
			}
		}
		if(this.getPosition().getY() < 0) {
			GameCanvas.toBeErase(this);
			System.out.println("erase");
		}
		
	}

	@Override
	public void positionValueCorrection() {
		// TODO Auto-generated method stub
		
	}


}
