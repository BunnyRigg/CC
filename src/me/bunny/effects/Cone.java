package me.bunny.effects;

import org.bukkit.entity.Player;

import de.slikey.effectlib.effect.ConeEffect;
import me.bunny.main.Main;

public class Cone {
	
	public static ConeEffect coneEffect = new ConeEffect(Main.effectManager);
	
	public static void ConeEff(Player player) {
		coneEffect.setEntity(player);
		coneEffect.iterations = 15 * 20;
		coneEffect.start();
	}

}
