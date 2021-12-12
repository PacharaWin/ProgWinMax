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
    /*public Image nothing;
    public Image title;
    public Image characterSelect;
    public List<Image> monsterMelee;
    public List<Image> monsterGun;
    public List<Image> boss;
    public Image monsterMeleeDead;
    public Image monsterGunDead;
    public Image BossDead;
    public List<Image> floor;
    public List<Image> box;
    public List<Image> bush;
    public List<Image> stone;
    public Image pistol;
    public Image rifle;
    public Image sword;
    public Image staff;
    public Image spear;
    public Image dart;
    public Image gatlingGun;
    public Image bullet;
    public Image pistolBullet;
    public Image rifleBullet;
    public List<Image> meleeBullet;
    public Image staffBullet;
    public Image dartBullet;
    public Image bossBullet;
    public Image shopMenu;
    public Image pointer;
    public Image health;
    public Image mana;
    public Image coin;
    public List<Image> coinDrop;
    public Image heathPotion;
    public Image manaPotion;
    public List<Image> knightRun;
    public List<Image> paladinRun;
    public List<Image> priestRun;
    public Image knightStand;
    public Image paladinStand;
    public Image priestStand;
    public Image knightDead;
    public Image paladinDead;
    public Image priestDead;*/
    public Image emeraldDragon;
    
    static {
        instance = new ImageHolder();
    }
    
    public static ImageHolder getInstance() {
        return ImageHolder.instance;
    }
    
    public ImageHolder() {
        /*this.nothing = this.loadImage("nothing/nothing", "png");
        this.title = this.loadImage("overlay/title", "png");
        this.characterSelect = this.loadImage("overlay/character_selection_bg", "png");
        this.monsterMelee = this.loadImageList("monster/melee/melee_", "png", 4);
        this.monsterGun = this.loadImageList("monster/gun/gun_", "png", 4);
        this.boss = this.loadImageList("monster/boss/boss_", "png", 4);
        this.monsterMeleeDead = this.loadImage("monster/dead/hit_dead", "png");
        this.monsterGunDead = this.loadImage("monster/dead/shoot_dead", "png");
        this.BossDead = this.loadImage("monster/dead/boss_dead", "png");
        this.floor = this.loadImageList("floor/tile_", "png", 5);
        this.box = this.loadImageList("block/box/box_", "png", 2);
        this.bush = this.loadImageList("block/bush/bush_", "png", 2);
        this.stone = this.loadImageList("block/stone/stone_", "png", 2);
        this.pistol = this.loadImage("weapon/pistol", "png");
        this.rifle = this.loadImage("weapon/rifle", "png");
        this.sword = this.loadImage("weapon/sword", "png");
        this.staff = this.loadImage("weapon/staff", "png");
        this.spear = this.loadImage("weapon/spear", "png");
        this.dart = this.loadImage("weapon/dart", "png");
        this.gatlingGun = this.loadImage("weapon/gatling_gun", "png");
        this.bullet = this.loadImage("bullet/bullet", "png");
        this.pistolBullet = this.loadImage("bullet/bullet_pistol", "png");
        this.rifleBullet = this.loadImage("bullet/bullet_rifle", "png");
        this.meleeBullet = this.loadImageList("bullet/bullet_sword_", "png", 3);
        this.staffBullet = this.loadImage("bullet/bullet_staff", "png");
        this.dartBullet = this.loadImage("bullet/bullet_monster", "png");
        this.bossBullet = this.loadImage("bullet/bullet_boss", "png");
        this.shopMenu = this.loadImage("overlay/shopmenu", "png");
        this.pointer = this.loadImage("overlay/pointer", "png");
        this.health = this.loadImage("overlay/health", "png");
        this.mana = this.loadImage("overlay/mana", "png");
        this.coin = this.loadImage("overlay/coin", "png");
        this.coinDrop = this.loadImageList("loot/coin/coin_", "png", 4);
        this.heathPotion = this.loadImage("loot/health_potion", "png");
        this.manaPotion = this.loadImage("loot/mana_potion", "png");
        this.knightRun = this.loadImageList("player/knight/knight_", "png", 4);
        this.paladinRun = this.loadImageList("player/paladin/paladin_", "png", 4);
        this.priestRun = this.loadImageList("player/priest/priest_", "png", 4);
        this.knightStand = this.loadImage("player/standstill/knight_0", "png");
        this.paladinStand = this.loadImage("player/standstill/paladin_0", "png");
        this.priestStand = this.loadImage("player/standstill/priest_0", "png");
        this.knightDead = this.loadImage("player/dead/knight_dead", "png");
        this.paladinDead = this.loadImage("player/dead/paladin_dead", "png");
        this.priestDead = this.loadImage("player/dead/priest_dead", "png");*/
        this.emeraldDragon = this.loadImage("EmeraldDragon", "png");
    }
    
    public Image loadImage(final String prefixName, final String fileType) {
        return new Image(ClassLoader.getSystemResourceAsStream("image/" + prefixName + "." + fileType));
    }
    
    public List<Image> loadImageList(final String prefixName, final String fileType, final int number) {
        final List<Image> list = new ArrayList<Image>();
        for (int i = 1; i <= number; ++i) {
            list.add(this.loadImage(String.valueOf(prefixName) + i, fileType));
        }
        return list;
    }
}
