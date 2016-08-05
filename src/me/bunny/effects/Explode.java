package me.bunny.effects;

import org.bukkit.entity.Player;

import de.slikey.effectlib.effect.ExplodeEffect;
import me.bunny.main.Main;

public class Explode {
	
	public static ExplodeEffect explodeEffect = new ExplodeEffect(Main.effectManager);
	
	public static void ExplodeEff(Player player) {
		explodeEffect.setEntity(player);
		explodeEffect.iterations = 15 * 20;
		explodeEffect.start();
	}

}
