package me.bunny.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.bunny.main.Main;

public class RightClick implements Listener {

	Main plugin;

	public RightClick(Main main) {

	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerUse(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if(!player.hasPermission("creaturecraft.fireballblocker.bypass")) {
			if(player.getItemInHand().getType().equals(Material.GOLD_SWORD) || player.getItemInHand().getType().equals(Material.GOLD_AXE)) {
				if(player.getItemInHand().getItemMeta().getDisplayName().contains("§6Bloodaxe of") || (player.getItemInHand().getItemMeta().getDisplayName().contains("§6Bloodsword of"))) {
					player.getInventory().setItemInHand(null);
					player.updateInventory();
					player.sendMessage("§0§l<<§4§lCreature§b§lCraft§0§l>> §cThat item is banned!");
				}
			}
		}else{
			
		}
	}

}
