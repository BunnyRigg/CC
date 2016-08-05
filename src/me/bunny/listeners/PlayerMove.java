package me.bunny.listeners;

import me.bunny.arraylist.Blood;
import me.bunny.arraylist.Firefly;
import me.bunny.arraylist.Smoke;
import me.bunny.main.Main;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

	Main plugin;

	public PlayerMove(Main main) {

	}

	@EventHandler
	public void onPlayerMoveEvent(PlayerMoveEvent e) {
		Player player = (Player) e.getPlayer();
		if(Firefly.fireflylist.contains(player.getName())) {
			player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 0);
		}else{
			if(Blood.bloodlist.contains(player.getName())) {
				player.getWorld().playEffect(player.getLocation(), Effect.STEP_SOUND, 152);
			}else{
				if(Smoke.smokelist.contains(player.getName())) {
					player.getWorld().playEffect(player.getLocation(), Effect.SMOKE, 0);
				}
			}
		}
	}

}
