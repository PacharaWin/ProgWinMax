// 
// Decompiled by Procyon v0.5.36
// 

package scene;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneHolder
{
    private Stage bindStage;
    public MainMenuScene mainMenuScene;
    
    public SceneHolder(final Stage bindStage) {
        this.bindStage = bindStage;
    }
    
    public void initialize() {
        this.switchScene(this.mainMenuScene = new MainMenuScene());
    }
    
    public void switchScene(final Scene nextScene) {
        this.bindStage.setResizable(false);
        this.bindStage.setScene(nextScene);
        this.bindStage.sizeToScene();
    }
}
