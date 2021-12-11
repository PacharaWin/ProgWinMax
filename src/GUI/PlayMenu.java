package GUI;

import constants.FontHolder;
import constants.SoundHolder;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Effect;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class PlayMenu extends BorderPane{
	private Pane backgroundVideoPane;
    private HBox titleBox;
    private HBox bottomMenu;
    private BorderPane menuBorderPane;
    //private CharacterUI characterUI;
    private static MediaPlayer mediaPlayer1;
    private static MediaPlayer mediaPlayer2;
    
    public PlayMenu() {
    	this.setPrefSize(1050, 600);
    	final Media media2 = new Media(ClassLoader.getSystemResource("sound/bgm/setting.wav").toString());
    	PlayMenu.mediaPlayer2 = new MediaPlayer(media2);
    	final MediaView mediaView2 = new MediaView(PlayMenu.mediaPlayer2);
    	PlayMenu.mediaPlayer2.setAutoPlay(true);
        PlayMenu.mediaPlayer2.setCycleCount(-1);
        
        this.bottomMenu = new HBox();
        final Button backBtn = new Button("Back");
        final Button playBtn = new Button("Let's go!!");
        playBtn.setFont(FontHolder.getInstance().font48);
        backBtn.setFont(FontHolder.getInstance().font48);
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
        this.bottomMenu.getChildren().addAll(playBtn, backBtn );
        this.bottomMenu.setAlignment(Pos.BOTTOM_CENTER);
        this.bottomMenu.setSpacing(30.0);
        this.bottomMenu.setPadding(new Insets(80.0));
        
    }
}
