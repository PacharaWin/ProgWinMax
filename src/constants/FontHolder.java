// 
// Decompiled by Procyon v0.5.36
// 

package constants;

import javafx.scene.text.Font;

public class FontHolder
{
    private static final String TTF = "ttf";
    private static final FontHolder instance;
    public Font font12;
    public Font font18;
    public Font font24;
    public Font font28;
    public Font font36;
    public Font font48;
    public Font font64;
    
    static {
        instance = new FontHolder();
    }
    
    public static FontHolder getInstance() {
        return FontHolder.instance;
    }
    
    public FontHolder() {
        this.font12 = this.loadFont("VCR_OSD_MONO_1.001", "ttf", 12.0);
        this.font18 = this.loadFont("VCR_OSD_MONO_1.001", "ttf", 18.0);
        this.font24 = this.loadFont("VCR_OSD_MONO_1.001", "ttf", 24.0);
        this.font28 = this.loadFont("VCR_OSD_MONO_1.001", "ttf", 28.0);
        this.font36 = this.loadFont("VCR_OSD_MONO_1.001", "ttf", 36.0);
        this.font48 = this.loadFont("VCR_OSD_MONO_1.001", "ttf", 48.0);
        this.font64 = this.loadFont("VCR_OSD_MONO_1.001", "ttf", 64.0);
    }
    
    public Font loadFont(final String name, final String fontType, final double size) {
        return Font.loadFont(ClassLoader.getSystemResourceAsStream("font/" + name + "." + fontType), size);
    }
}
