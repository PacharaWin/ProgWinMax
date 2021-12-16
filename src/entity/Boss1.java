package entity;

import constants.ImageHolder;
import constants.SoundHolder;
import gui.GameCanvas;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class Boss1 extends Boss {
	private int cnt = 70;

	public Boss1() {
		super();
		this.speed = 5;
		this.maxHealth = 3500;
		this.health = 3500;
		this.setCurrentImage(ImageHolder.getInstance().wizards);
		this.sprite = ImageHolder.getInstance().wizards.get(2);
		this.radius = 30;
		this.element = Elemental.FIRE;

	}

	public Boss1(Point2D id) {
		this();
		this.position = id;
		this.radius = 100;
	}

	@Override
	public void draw(GraphicsContext gc) {
		final double x = this.getPosition().getX();
		final double y = this.getPosition().getY();

		final double imgX = sprite.getWidth();
		final double imgY = sprite.getHeight();
		gc.drawImage(this.getSprite(), x, y, imgX, imgY);
		// System.out.println(x);
	}

	@Override
	public void update() {
		// System.out.println("Boss");
		if (this.getPosition().getX() >= 950)
			isLeft = true;
		if (this.getPosition().getX() <= 0)
			isLeft = false;
		if (isLeft) {
			this.setPosition(new Point2D(this.getPosition().getX() - this.speed, this.getPosition().getY()));
		}
		if (!isLeft) {
			this.setPosition(new Point2D(this.getPosition().getX() + this.speed, this.getPosition().getY()));
		}
		shoot(this.getCenter(), GameCanvas.getPlayer().getCenter());

	}

	public void shoot(Point2D pos1, Point2D pos2) {
		cnt--;
		if (cnt > 0)
			return;
		BulletBoss1 bul = new BulletBoss1(pos1, pos2);
		SoundHolder.getInstance().shootSound2.stop();
		SoundHolder.getInstance().shootSound2.play(0.7);
		GameCanvas.toBeAdd(bul);
		cnt = 70;
	}

	@Override
	public void Draw() {

	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub

	}

}
