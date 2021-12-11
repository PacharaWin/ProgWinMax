package object.base;

import constants.ImageHolder;
import interfaces.IBehaviour;
import interfaces.IRenderable;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
/*import logic.SystemCache;*/

public abstract class GameObject implements IRenderable, IBehaviour {
	protected Point2D position;
	protected boolean isDestroy;
	protected Image sprite;
	protected int z;

	public GameObject() {
		this.position = new Point2D(0.0, 0.0);
		this.sprite = ImageHolder.getInstance().nothing;
		this.isDestroy = false;
	}

	public Point2D getPosition() {
		return this.position;
	}

	public void setPosition(final Point2D position) {
		this.position = position;
	}

	@Override
	public boolean isDestroy() {
		return this.isDestroy;
	}

	public void destroy() {
		this.isDestroy = true;
	}

	public Image getSprite() {
		return this.sprite;
	}

	public void setSprite(final Image sprite) {
		this.sprite = sprite;
	}

	@Override
	public int getZ() {
		return this.z;
	}

	public void setZ(final int z) {
		this.z = z;
	}

	/*public double getWidth() {
		return this.getSprite().getWidth() * SystemCache.getInstance().gameCanvas.getFactor();
	}

	public double getHeight() {
		return this.getSprite().getHeight() * SystemCache.getInstance().gameCanvas.getFactor();
	}*/
}
