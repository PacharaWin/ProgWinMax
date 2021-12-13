// 
// Decompiled by Procyon v0.5.36
// 

package constants;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.Image;

public class ImageHolder
{
    private static final String PNG = "png";
    private static final ImageHolder instance;
    public List<Image> grims;
    public List<Image> golems;
    public List<Image> players;
    public Image potionBlue;
    public Image potionRed;
    public Image potionPurple;
    public Image potionGreen;
    public Image gameBg1;
    public Image gameBg2;
    public Image gameBg3;
    public Image gameBg4;
    public Image emeraldDragon;
    public List<Image> wizards;
    
    static {
        instance = new ImageHolder();
    }
    
    public static ImageHolder getInstance() {
        return ImageHolder.instance;
    }
    
    public ImageHolder() {
        this.emeraldDragon = this.loadImage("EmeraldDragon", "png");
        this.grims = this.loadImageList("grim", PNG, 5);
        this.golems = this.loadImageList("golems", PNG, 4);
        this.wizards = this.loadImageList("rogue", PNG, 8);
        this.players = this.loadImageList("player", PNG, 5);
        this.gameBg1 = this.loadImage("GameBg1", "jpg");
        this.gameBg2 = this.loadImage("GameBg2", "jpg");
        this.gameBg3 = this.loadImage("GameBg3", "jpg");
        this.gameBg4 = this.loadImage("GameBg4", "jpg");
        this.potionBlue = this.loadImage("blue1", "png");
        this.potionRed = this.loadImage("red1", "png");
        this.potionPurple = this.loadImage("purple1", "png");
        this.potionGreen = this.loadImage("green1", "png");
        }
    
    private Image loadImage(String name, String fileType) {
        String path =  name + "." + fileType;
        return new Image(ClassLoader.getSystemResource(path).toString());
    }
    
    public List<Image> loadImageList(final String prefixName, final String fileType, final int number) {
        final List<Image> list = new ArrayList<Image>();
        for (int i = 1; i <= number; ++i) {
            list.add(this.loadImage(String.valueOf(prefixName) + i, fileType));
        }
        return list;
    }
}
