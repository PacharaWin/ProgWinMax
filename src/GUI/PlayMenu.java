package gui;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import constants.FontHolder;
import constants.ImageHolder;
import constants.SoundHolder;
import entity.Boss;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import constants.ImageHolder;
import entity.Boss1;
import entity.Boss2;

public class PlayMenu extends BorderPane{
	private Pane backgroundVideoPane;
	private VBox nextBox;
	private VBox prevBox;
    private HBox titleBox;
    private HBox bottomMenu;
    private BorderPane menuBorderPane;
    //private CharacterUI characterUI;
    private static MediaPlayer mediaPlayer1;
    private static MediaPlayer mediaPlayer2;
    private ArrayList<Boss> bossList;
    public PlayMenu() {
    	bossList = new ArrayList<Boss>();
    	bossList.add(new Boss1());
    	bossList.add(new Boss2());

    	this.setPrefSize(1050, 600);
    	/*final Media media2 = new Media(ClassLoader.getSystemResource("sound/bgm/setting.wav").toString());
    	PlayMenu.mediaPlayer2 = new MediaPlayer(media2);
    	final MediaView mediaView2 = new MediaView(PlayMenu.mediaPlayer2);
    	PlayMenu.mediaPlayer2.setAutoPlay(true);
        PlayMenu.mediaPlayer2.setCycleCount(-1);*/
    	try(InputStream is = Files.newInputStream(Paths.get("res/HillsMenu.png"))){
			ImageView img = new ImageView(new Image(is));
			img.setFitWidth(1050);
			img.setFitHeight(600);
			this.getChildren().add(img);
		}
		catch(IOException e) {
			System.out.println("Couldn't load image");
		}
        this.bottomMenu = new HBox();
        final Button backBtn = new Button("Back");
        final Button playBtn = new Button("Let's go!!");
        playBtn.setFont(Font.font("Consolas", FontWeight.SEMI_BOLD, 50));
        backBtn.setFont(Font.font("Consolas", FontWeight.SEMI_BOLD, 50));
        playBtn.setOnMouseClicked(e -> {
            /*GameStats.reset();
            SoundHolder.getInstance().btn.play();
            this.characterUI.show();
            final BoxBlur boxBlur = new BoxBlur();
            boxBlur.setHeight(10.0);
            boxBlur.setWidth(10.0);
            boxBlur.setIterations(3);
            mediaView1.setEffect((Effect)boxBlur);
            title.setEffect((Effect)boxBlur);
            playBtn.setEffect((Effect)boxBlur);
            exitBtn.setEffect((Effect)boxBlur);*/
        });
        backBtn.setOnMouseClicked(e -> System.exit(0));
        this.bottomMenu.getChildren().addAll(backBtn, playBtn );
        this.bottomMenu.setAlignment(Pos.BOTTOM_CENTER);
        this.bottomMenu.setSpacing(400.0);
        this.bottomMenu.setPadding(new Insets(50.0));
        this.setBottom(bottomMenu);
        
        InputStream is;
		try {
			is = Files.newInputStream(Paths.get("res/EmeraldDragon.png"));
			ImageView image = new ImageView(new Image(is));
			image.setFitWidth(300);
			image.setFitHeight(300);
			this.setCenter(image);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.nextBox = new VBox();
		this.prevBox = new VBox();
		final Button nextBtn = new Button(">");
        final Button prevBtn = new Button("<");
        nextBox.getChildren().add(nextBtn);
        prevBox.getChildren().add(prevBtn);
        this.nextBox.setAlignment(Pos.CENTER);
        this.nextBox.setSpacing(400.0);
        this.nextBox.setPadding(new Insets(50.0));
        this.prevBox.setAlignment(Pos.CENTER);
        this.prevBox.setSpacing(400.0);
        this.prevBox.setPadding(new Insets(50.0));
        nextBtn.setFont(Font.font("Consolas", FontWeight.SEMI_BOLD, 50));
        prevBtn.setFont(Font.font("Consolas", FontWeight.SEMI_BOLD, 50));
        this.setLeft(prevBox);
        this.setRight(nextBox);
        nextBtn.setOnMouseClicked(e -> {
        	
        });
        
    }
}
