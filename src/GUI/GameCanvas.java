package gui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import constants.ImageHolder;
import constants.RenderableHolder;
import entity.Boss;
import entity.Boss1;
import entity.Boss2;
import entity.Boss3;
import entity.Player;
import interfaces.IRenderable;
import javafx.animation.AnimationTimer;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import object.base.GameObject;


public class GameCanvas extends Canvas{
	public static final int PIXEL_CELLSIZE = 16;
    private GraphicsContext gc;
    private List<GameObject> gameObjects;
    private AnimationTimer gameLoop;
    
    public GameCanvas() {
        this.setup();
//        this.buildGame();
        this.loop();
//        this.wave();
    }
    
    public void setup() {
        this.gc = this.getGraphicsContext2D();
        this.gameObjects = new ArrayList<GameObject>();
        this.setWidth(1050.0);
        this.setHeight(600.0);
        Boss3 boss = new Boss3(new Point2D(500, 500));
        Player player = new Player(new Point2D(525, 500));
        RenderableHolder.getInstance().add(player);
        RenderableHolder.getInstance().add(boss);
        
    }

    public void loop() {
        (this.gameLoop = new AnimationTimer() {
            public void handle(final long now) {
               GameCanvas.this.drawGameObject();
               GameCanvas.this.update();
               }
           
        }).start();
    }
    private void update() {
        if(RenderableHolder.getInstance().getEntities()!=null) {
            for(IRenderable obj: RenderableHolder.getInstance().getEntities()) {
                obj.update();
            }
        }
    }
    public void drawGameObject() {
    	gc.drawImage(ImageHolder.getInstance().gameBg3, 0, 0);
    	 for ( IRenderable go : RenderableHolder.getInstance().getEntities()) {
    		 go.draw(this.gc);
    		 
             
         }
//        for (final GameObject go : this.gameObjects) {
//            if (go.isVisible()) {
//                go.draw(this.gc);
//            }
//        }
    }
}
