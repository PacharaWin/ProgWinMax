package main;

import java.io.IOException;
import java.io.InputStream;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import scene.PlayMenuScene;
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


public class main extends Application{
	private Stage primaryStage;
	private Parent createContent() {
		Pane root = new Pane();
		
		root.setPrefSize(1050, 600);
		
		try(InputStream is = Files.newInputStream(Paths.get("res/HillsMenu.png"))){
			ImageView img = new ImageView(new Image(is));
			img.setFitWidth(1050);
			img.setFitHeight(600);
			root.getChildren().add(img);
		}
		catch(IOException e) {
			System.out.println("Couldn't load image");
		}
		
		Title title = new Title ("Art  of  Element");
		title.setTranslateX(287.5);
		title.setTranslateY(200);
		MenuItem play = new MenuItem("Play");
		MenuItem help = new MenuItem("Help");
		MenuItem credit = new MenuItem("Credit");
		MenuItem exit = new MenuItem("Exit");
		MenuBox vbox = new MenuBox(
				play,
				help,
				credit,
				exit);
		vbox.setTranslateX(425);
		vbox.setTranslateY(300);
		play.setOnMousePressed(event -> {
			Scene forPlay = new PlayMenuScene();
			this.primaryStage.setScene(forPlay);
			this.primaryStage.show();
		});
		help.setOnMousePressed(event -> {
			
		});
		credit.setOnMousePressed(event -> {
			
		});
		exit.setOnMousePressed(event -> {
			System.exit(0);
		});
		
		
		root.getChildren().addAll(title,vbox);
		
		return root;
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception{
		this.primaryStage = primaryStage;
		Scene scene = new Scene(createContent());
		primaryStage.setTitle("ArtOfElement");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private static class Title extends StackPane{
		public Title(String name) {
			Rectangle bg = new Rectangle(475, 60);
			bg.setStroke(Color.BLACK);
			bg.setStrokeWidth(2);
			bg.setFill(null);
			
			Text text = new Text(name);
			text.setFill(Color.BLACK);
			text.setFont(Font.font("Consolas", FontWeight.SEMI_BOLD, 50));
			
			setAlignment(Pos.CENTER);
			getChildren().addAll(bg,text);
		}
	}
	
	/*private static class MenuBox extends VBox{
		public MenuBox(MenuItem...items) {
			getChildren().add(createSeperator());
			
			for(MenuItem item : items) {
				getChildren().addAll(item, createSeperator());
			}
		}
		
		private Line createSeperator() {
			Line sep = new Line();
			sep.setEndX(210);
			sep.setStroke(Color.DARKGREY);
			return sep;
		}
		
	}*/
	

	
	
	

	public static void main(String[] args) {
		
		launch(args);
	}
}