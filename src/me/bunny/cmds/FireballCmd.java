package me.bunny.cmds;

import me.bunny.main.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;

public class FireballCmd implements CommandExecutor {
	
	Main plugin;
	
	public FireballCmd(Main main) {
		
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player)sender;
		if (player.hasPermission("creaturecraft.fireball")) {
			player.launchProjectile(Fireball.class);
		} else {
			player.sendMessage("§0§l<<§4§lCreature§b§lCraft§0§l>> §cYou do not have permission for this!");
		}
		return true;
	}
}

