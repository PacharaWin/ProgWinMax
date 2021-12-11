// 
// Decompiled by Procyon v0.5.36
// 

package constants;

import javafx.scene.media.AudioClip;

public class SoundHolder
{
    private static final String WAV = "wav";
    private static final SoundHolder instance;
    public AudioClip battleBGM;
    public AudioClip boxDestroyed;
    public AudioClip btn;
    public AudioClip buyBtn;
    public AudioClip dart;
    public AudioClip error;
    public AudioClip mainMenuBGM;
    public AudioClip mouseEnter;
    public AudioClip pistol;
    public AudioClip pistolReload;
    public AudioClip resultLoop;
    public AudioClip rifle;
    public AudioClip rifleReload;
    public AudioClip spear;
    public AudioClip staff;
    public AudioClip startBtn;
    public AudioClip switchWeapon;
    public AudioClip sword;
    public AudioClip pickUpCoin;
    public AudioClip pickUpItem;
    public AudioClip getHit;
    public AudioClip showUp;
    
    static {
        instance = new SoundHolder();
    }
    
    public static SoundHolder getInstance() {
        return SoundHolder.instance;
    }
    
    public SoundHolder() {
        this.btn = this.loadSound("sfx/btn", "wav");
        this.buyBtn = this.loadSound("sfx/buy_btn", "wav");
        this.boxDestroyed = this.loadSound("sfx/box_destroy", "wav");
        this.dart = this.loadSound("sfx/dart", "wav");
        this.error = this.loadSound("sfx/error", "wav");
        this.mouseEnter = this.loadSound("sfx/mouse_enter", "wav");
        this.pickUpCoin = this.loadSound("sfx/pick_up_coin", "wav");
        this.pickUpItem = this.loadSound("sfx/pick_up_item", "wav");
        this.pistol = this.loadSound("sfx/pistol", "wav");
        this.pistolReload = this.loadSound("sfx/pistol_reload", "wav");
        this.rifle = this.loadSound("sfx/rifle", "wav");
        this.rifleReload = this.loadSound("sfx/rifle_reload", "wav");
        this.staff = this.loadSound("sfx/fx_magic1", "wav");
        this.spear = this.loadSound("sfx/spear", "wav");
        this.startBtn = this.loadSound("sfx/start_btn", "wav");
        this.sword = this.loadSound("sfx/sword", "wav");
        this.switchWeapon = this.loadSound("sfx/switch_weapon", "wav");
        this.getHit = this.loadSound("sfx/fx_hit", "wav");
        this.showUp = this.loadSound("sfx/fx_show_up", "wav");
        this.battleBGM = this.loadSound("bgm/battle_bgm", "wav");
        this.mainMenuBGM = this.loadSound("bgm/main_bgm", "wav");
        this.resultLoop = this.loadSound("bgm/result_loop", "wav");
    }
    
    public AudioClip loadSound(final String prefixName, final String fileType) {
        return new AudioClip(ClassLoader.getSystemResource("sound/" + prefixName + '.' + fileType).toString());
    }
}
