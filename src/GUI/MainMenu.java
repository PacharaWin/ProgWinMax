package gui;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import main.main;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import scene.PlayMenuScene;

public class MainMenu extends Pane{
	private static Stage primaryStage;
	public MainMenu() {
		
		this.setPrefSize(1050, 600);
		
		try(InputStream is = Files.newInputStream(Paths.get("res/HillsMenu.png"))){
			ImageView img = new ImageView(new Image(is));
			img.setFitWidth(1050);
			img.setFitHeight(600);
			this.getChildren().add(img);
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
			main.sceneHolder.switchScene(forPlay);
		});
		help.setOnMousePressed(event -> {
			
		});
		credit.setOnMousePressed(event -> {
			
		});
		exit.setOnMousePressed(event -> {
			System.exit(0);
		});
		
		
		this.getChildren().addAll(title,vbox);
		
	}
}