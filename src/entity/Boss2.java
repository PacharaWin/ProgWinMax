package entity;

import java.util.List;

import constants.ImageHolder;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;

public class Boss2 extends Boss{

	public Boss2() {
		super();
		this.setCurrentImage(ImageHolder.getInstance().grims);
	}
	public Boss2(String name, String description, int health, int maxHealth, int attack, double defense, int speed,
			Point2D center, int idx, List<Image> currentImage, Image dead, ProgressBar healthBar, Elemental element) {
		super("Grim Reaper", "Reaper king from hell", 5000, 5000, 50, 50, 10, center, idx, currentImage, dead, healthBar,
				element);
		this.setCurrentImage(ImageHolder.getInstance().grims);
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