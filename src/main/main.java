package main;

import java.io.IOException;
import java.io.InputStream;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import constants.ImageHolder;
import scene.PlayMenuScene;
import scene.SceneHolder;
import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.*;
import gui.MenuItem;
import gui.MenuBox;
import gui.Title;
import gui.MainMenu;


public class main extends Application{
	
	 public static SceneHolder sceneHolder;

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		(this.sceneHolder = new SceneHolder(primaryStage)).initialize();
        primaryStage.setTitle("Art of Element");
        primaryStage.setResizable(false);
        primaryStage.show();
		
	}
	


	public static void main(String[] args) {
		
		launch(args);
	}
}