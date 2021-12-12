package logic;

import entity.Boss;
import entity.Bullet;
import entity.Player;


public class CalDamage {
	public static void calculateDamage(Bullet b, Player e) {
		int newHealth = Math.max(e.getHealth() - b.getDamage(), 0);
		System.out.println(newHealth);
		e.setHealth(newHealth);
	}
	
	public static void calculateDamage(Bullet b, Boss e) {
		int newHealth = Math.max(e.getHealth() - b.getDamage(), 0);
		System.out.println(newHealth);
		e.setHealth(newHealth);
	}
		
	public static void calculateDamage(int damage, Player e) {
		int newHealth = Math.max(e.getHealth() - damage, 0);
		System.out.println(newHealth);
		e.setHealth(newHealth);
	}
	
	/*public int getElementalAdvantage(Player target) {
		Player eTarget = (Player) (FighterPenguin) target;
		if (this.getType().equals(PenguinType.FIRE) && eTarget.getType().equals(PenguinType.SNOW)) {
			return 1;
		} else if (this.getType().equals(PenguinType.SNOW) && eTarget.getType().equals(PenguinType.WATER)) {
			return 1;
		} else if (this.getType().equals(PenguinType.WATER) && eTarget.getType().equals(PenguinType.FIRE)) {
			return 1;
		} else if (this.getType().equals(PenguinType.SNOW) && eTarget.getType().equals(PenguinType.FIRE)) {
			return -1;
		} else if (this.getType().equals(PenguinType.WATER) && eTarget.getType().equals(PenguinType.SNOW)) {
			return -1;
		} else if (this.getType().equals(PenguinType.FIRE) && eTarget.getType().equals(PenguinType.WATER)) {
			return -1;
		}
		return 0;
	}*/
}
