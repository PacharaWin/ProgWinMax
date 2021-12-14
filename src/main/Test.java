package main;

import javafx.application.Application;
import javafx.stage.Stage;
import scene.PlayMenuScene;
import scene.WinScene;
import scene.GameCanvasScene;
import scene.LoseScene;

public class Test extends Application{
	public static void main(String[] args) {
	
	launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		arg0.setScene( new WinScene());
		arg0.show();
		// TODO Auto-generated method stub
		
	}
}
