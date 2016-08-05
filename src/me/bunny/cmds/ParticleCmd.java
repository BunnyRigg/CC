package me.bunny.cmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.slikey.effectlib.effect.HelixEffect;
import me.bunny.guis.Particles;
import me.bunny.main.Main;
import me.bunny.prefix.Prefix;

public class ParticleCmd implements CommandExecutor {
	
	Main plugin;
	
	public ParticleCmd(Main main) {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if(player.hasPermission("creaturecraft.particles.open")) {
			Particles.particle(player);
			HelixEffect helixEffect = new HelixEffect(Main.effectManager);
			helixEffect.setEntity(player);
		}else{
			player.sendMessage(Prefix.prefix + "§cYou do not have permission for particle effects!");
		}
		return true;
	}

}
