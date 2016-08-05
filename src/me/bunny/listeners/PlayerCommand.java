package me.bunny.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import me.bunny.main.Main;

public class PlayerCommand implements Listener {
	
	Main plugin;
	
	public PlayerCommand(Main main) {
		
	}
	
	@EventHandler
	public void onPlayerCommand(PlayerCommandPreprocessEvent e) {
		Player player = (Player) e.getPlayer();
		if(e.getMessage().equalsIgnoreCase("/team save")) {
			if(player.isOp()) {
				
			}else{
				e.setCancelled(true);
				player.sendMessage("§0§l<<§4§lCreature§b§lCraft§0§l>> §cYou do not have permission for this!");
			}
		}
		if(e.getMessage().equalsIgnoreCase("/?")) {
			if(player.isOp()) {
				
			}else{
				e.setCancelled(true);
				player.sendMessage("§0§l<<§4§lCreature§b§lCraft§0§l>> §cYou do not have permission for this!");
			}
		}
	}

}