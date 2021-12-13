// 
// Decompiled by Procyon v0.5.36
// 

package constants;

import javafx.scene.media.AudioClip;

public class SoundHolder
{
    private static final String WAV = "wav";
    private static final SoundHolder instance;
    
    public AudioClip bgmMainMenu;
    public AudioClip bgmFight1;
    public AudioClip bgmFight2;
    public AudioClip bgmFight3;
    
    static {
        instance = new SoundHolder();
    }
    
    public static SoundHolder getInstance() {
        return SoundHolder.instance;
    }
    
    public SoundHolder() {
       
        this.bgmMainMenu = this.loadSound("bgmMainMenu", "mp3");
        this.bgmFight1 = this.loadSound("bgmFight1", "mp3");
        this.bgmFight2 = this.loadSound("bgmFight2", "mp3");
        this.bgmFight3 = this.loadSound("bgmFight3", "mp3");
        
    }
    
    public AudioClip loadSound(final String prefixName, final String fileType) {
        return new AudioClip(ClassLoader.getSystemResource(prefixName + '.' + fileType).toString());
    }
}
