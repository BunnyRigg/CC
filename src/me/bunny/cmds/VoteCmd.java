package me.bunny.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.bunny.guis.VoteGUI;
import me.bunny.main.Main;

public class VoteCmd implements CommandExecutor {
	
	Main plugin;
	
	public VoteCmd(Main main) {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		VoteGUI.vote(player);
		return true;
	}

}
