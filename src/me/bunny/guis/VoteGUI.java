package me.bunny.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VoteGUI {
	
	public static void vote(Player player) {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "§b§lVoting Selector");
		
		ItemStack PMC = new ItemStack(Material.PAPER);
		ItemStack MCIndex = new ItemStack(Material.PAPER);
		ItemStack Vote = new ItemStack(Material.DIAMOND);
		ItemStack MineServers = new ItemStack(Material.PAPER);
		ItemStack MCMP = new ItemStack(Material.PAPER);
		
		ItemMeta PMCMeta = PMC.getItemMeta();
		ItemMeta MCIndexMeta = MCIndex.getItemMeta();
		ItemMeta VoteMeta = Vote.getItemMeta();
		ItemMeta MineServersMeta = MineServers.getItemMeta();
		ItemMeta MCMPMeta = MCMP.getItemMeta();
		
		PMCMeta.setDisplayName("§cPMC");
		MCIndexMeta.setDisplayName("§cMC-Index");
		VoteMeta.setDisplayName("§4§lVoting");
		MineServersMeta.setDisplayName("§cMine Servers");
		MCMPMeta.setDisplayName("§cMinecraft-MP");
		
		PMC.setItemMeta(PMCMeta);
		MCIndex.setItemMeta(MCIndexMeta);
		Vote.setItemMeta(VoteMeta);
		MineServers.setItemMeta(MineServersMeta);
		MCMP.setItemMeta(MCMPMeta);
		
		inv.setItem(2, PMC);
		inv.setItem(3, MCIndex);
		inv.setItem(4, Vote);
		inv.setItem(5, MineServers);
		inv.setItem(6, MCMP);
		
		player.openInventory(inv);
	}

}