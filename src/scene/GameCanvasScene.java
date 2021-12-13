package scene;

import gui.GameCanvas;
import gui.MainMenu;
import gui.PlayMenu;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameCanvasScene extends Scene
{
    private StackPane stackPane;
    private GameCanvasScene(final Parent root) {
        super(root);
    }
    
    public GameCanvasScene() {
    	
        this((Parent)new StackPane());
        this.initialize();
     
    }
    
    private void initialize() {
        //this.setCursor(Cursor.NONE);
        this.setRoot((Parent)(this.stackPane = new StackPane()));
        this.stackPane.setPrefSize(1050, 600);
        this.stackPane.getChildren().add(new GameCanvas());
    }
}
