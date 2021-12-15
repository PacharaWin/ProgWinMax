package main;
import scene.SceneHolder;
import javafx.application.*;
import javafx.stage.*;

public class Main extends Application{
	
	 public static SceneHolder sceneHolder;

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		(sceneHolder = new SceneHolder(primaryStage)).initialize();
        primaryStage.setTitle("Art of Element");
        primaryStage.setResizable(false);
        primaryStage.show();
		
	}
	


	public static void main(String[] args) {
		
		launch(args);
	}
}