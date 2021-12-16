
package scene;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneHolder {
	private Stage bindStage;
	public MainMenuScene mainMenuScene;

	// public PlayMenuScene playMenuScene;
	public SceneHolder(final Stage bindStage) {
		this.bindStage = bindStage;
	}

	public void initialize() {
		this.switchScene(this.mainMenuScene = new MainMenuScene());
		// this.switchScene(this.playMenuScene = new PlayMenuScene());
	}

	public void switchScene(final Scene nextScene) {
		this.bindStage.setResizable(false);
		this.bindStage.setScene(nextScene);
		this.bindStage.sizeToScene();
	}

}
