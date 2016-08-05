package me.bunny.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.bunny.guis.EffectsGUI;
import me.bunny.main.Main;
import me.bunny.prefix.Prefix;

public class EffectsCmd implements CommandExecutor {

	Main plugin;

	public EffectsCmd(Main main) {

	}


	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("creaturecraft.particles.advanced")) {
			EffectsGUI.particle(player);
		}else{
			player.sendMessage(Prefix.prefix + "§cYou do not have permission to this!");
		}
		return true;
	}

}
