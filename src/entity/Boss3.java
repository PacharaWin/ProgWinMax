package entity;

import java.util.List;

import constants.ImageHolder;
import constants.SoundHolder;
import gui.GameCanvas;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;

public class Boss3 extends Boss{

	private int cnt = 70;
	public Boss3() {
		super();
		this.maxHealth = 1000;
		this.health = 1000;
		this.setCurrentImage(ImageHolder.getInstance().golems);
		this.sprite = ImageHolder.getInstance().golems.get(0);
	}
	public Boss3(Point2D id) {
		this();
		this.position = id;
		this.sprite = ImageHolder.getInstance().golems.get(0);
	}
	public Boss3(String name, String description, int health, int maxHealth, int attack, double defense, int speed,
			Point2D center, int idx, List<Image> currentImage, Image dead, ProgressBar healthBar, Elemental element) {
		super(name, description, health, maxHealth, attack, defense, speed, center, idx, currentImage, dead, healthBar,
				element);
		
		this.setCurrentImage(ImageHolder.getInstance().golems);
		this.sprite = ImageHolder.getInstance().golems.get(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(GraphicsContext gc) {
		final double x = this.getPosition().getX();
        final double y = this.getPosition().getY();
        
        
        final double imgX = sprite.getWidth();
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
		// TODO Auto-generated method stub
		//System.out.println("Boss");
		if(this.getPosition().getX() >= 950) isLeft = true;
		if(this.getPosition().getX() <= 0) isLeft = false;
		if(isLeft) {
			this.setPosition(new Point2D(this.getPosition().getX()-3, this.getPosition().getY()));
		}
		if(!isLeft) {
			this.setPosition(new Point2D(this.getPosition().getX()+3, this.getPosition().getY()));
		} 
		shoot(this.getCenter(), GameCanvas.getPlayer().getCenter());
	}

	@Override
	public void positionValueCorrection() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void shoot(Point2D pos1, Point2D pos2) {
		cnt--;
		if(cnt > 0) return;
		BulletBoss3 bul = new BulletBoss3(pos1, pos2);
		SoundHolder.getInstance().shootSound2.stop();
		SoundHolder.getInstance().shootSound2.play(0.7);
		GameCanvas.toBeAdd(bul);
		cnt=70;
		
	}

	

}
