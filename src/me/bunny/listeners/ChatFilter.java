package me.bunny.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.bunny.main.Main;
import me.bunny.prefix.Prefix;

public class ChatFilter implements Listener {

	Main plugin;

	public ChatFilter(Main main) {

	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e) {
		Player player = (Player) e.getPlayer();
		String mes = e.getMessage().toString().toLowerCase();
		String[] blocked = {"fuck", "shit", "pussy", "vagina", "dick", "cum", "ass", "asshole", "cunt", "motherfucker", "twat", "nigger", "nigga"};
		if(!player.hasPermission("creaturecraft.chatfilter.bypass")) {
			for(String block : blocked) {
				if(mes.contains("http://") || mes.contains("com") && mes.contains("www")) {
					e.setCancelled(true);
					player.sendMessage(Prefix.prefix + "§cDo not post links!");
					for(Player staff : Bukkit.getServer().getOnlinePlayers()) {
						if(staff.hasPermission("creaturecraft.chatfilter.notify")) {
							staff.sendMessage("§0[§cNotify§0] §4" + player.getName() + " §csaid §4" + mes);
						}
					}
				}else{
					if(mes.contains(block)) {
						
						e.getMessage().replace(block, "****");
						for(Player staff : Bukkit.getServer().getOnlinePlayers()) {
							if(staff.hasPermission("creaturecraft.chatfilter.notify")) {
								staff.sendMessage("§0[§cNotify§0] §4" + player.getName() + " §csaid §4" + mes);
							}
						}
					}
				}
			}
		}
	}
}

