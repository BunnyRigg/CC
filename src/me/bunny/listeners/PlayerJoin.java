package me.bunny.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.bunny.main.Main;

public class PlayerJoin implements Listener {
	
	Main plugin;
	
	public PlayerJoin(Main main) {
		
	}
	
    @SuppressWarnings({ "static-access", "deprecation" })
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
            Main.tabapi.setPriority(plugin, e.getPlayer(), 2);
           
            Main.tabapi.setTabString(plugin, e.getPlayer(), 0, 1, "§4=============================");
            Main.tabapi.setTabString(plugin, e.getPlayer(), 1, 1, " §4CreatureCraft");
            Main.tabapi.setTabString(plugin, e.getPlayer(), 2, 1, "§4=============================");
            Main.tabapi.setTabString(plugin, e.getPlayer(), 0, 0, "§6Players");
            Main.tabapi.setTabString(plugin, e.getPlayer(), 1, 0, "§6" + Bukkit.getOnlinePlayers().length + "/200");
            
           
            Main.tabapi.updatePlayer(e.getPlayer());
    }
}
