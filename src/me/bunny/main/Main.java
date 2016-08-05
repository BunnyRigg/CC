package me.bunny.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcsg.double0negative.tabapi.TabAPI;

import de.slikey.effectlib.EffectManager;
import me.bunny.cmds.EffectsCmd;
import me.bunny.cmds.FireballCmd;
import me.bunny.cmds.ParticleCmd;
import me.bunny.cmds.VoteCmd;
import me.bunny.listeners.ChatFilter;
import me.bunny.listeners.EntityExplosion;
import me.bunny.listeners.InvClick;
import me.bunny.listeners.PlayerCommand;
import me.bunny.listeners.PlayerJoin;
import me.bunny.listeners.PlayerMove;
import me.bunny.listeners.RightClick;

public class Main extends JavaPlugin {

	public static EffectManager effectManager;
	public static TabAPI tabapi;

	public void onEnable() {
		effectManager = new EffectManager(this);
		getCommand("fireball").setExecutor(new FireballCmd(this));
		getCommand("particle").setExecutor(new ParticleCmd(this));
		getCommand("effects").setExecutor(new EffectsCmd(this));
		getCommand("vote").setExecutor(new VoteCmd(this));
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerCommand(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new EntityExplosion(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new RightClick(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerMove(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new InvClick(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new ChatFilter(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	public void onDisable() {
		effectManager.dispose();
	}
}
