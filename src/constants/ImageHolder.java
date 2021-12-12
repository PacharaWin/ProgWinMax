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
    public Image emeraldDragon = new Image(ClassLoader.getSystemResource("EmeraldDragon.png").toString());;
    
    static {
        instance = new ImageHolder();
    }
    
    public static ImageHolder getInstance() {
        return ImageHolder.instance;
    }
    
    public ImageHolder() {
        super();
        //this.grims = this.loadImageList("grim", PNG, 5);
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
