package me.bunny.effects;

import org.bukkit.entity.Player;

import de.slikey.effectlib.effect.HelixEffect;
import me.bunny.main.Main;

public class Helix {
	
	public static void HelixEff(Player player) {
		HelixEffect helixEffect = new HelixEffect(Main.effectManager);
		helixEffect.setEntity(player);
		helixEffect.iterations = 15 * 20;
		helixEffect.start();
	}

}
