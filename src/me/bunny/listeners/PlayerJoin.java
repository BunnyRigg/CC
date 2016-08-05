package me.bunny.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import me.bunny.main.Main;

public class PlayerJoin {
	
	Main plugin;
	
	public PlayerJoin(Main main) {
		
	}
	
    @SuppressWarnings("static-access")
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
            Main.tabapi.setPriority(plugin, e.getPlayer(), 2);
           
            Main.tabapi.setTabString(plugin, e.getPlayer(), 0, 0, ChatColor.GREEN + "Welcome to");
            Main.tabapi.setTabString(plugin, e.getPlayer(), 1, 0, ChatColor.GREEN + "my server!");
            Main.tabapi.setTabString(plugin, e.getPlayer(), 3, 3, ChatColor.GREEN + "youtube.com/pogostick29dev");
           
            Main.tabapi.updatePlayer(e.getPlayer());
    }
}
