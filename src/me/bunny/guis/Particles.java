package me.bunny.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Particles {
	
	public static void particle(Player player) {
		Inventory inv = Bukkit.getServer().createInventory(null, 27, "§c§lBasic Particle Selector");
		
		ItemStack firefly = new ItemStack(Material.GLOWSTONE_DUST);
		ItemStack blood = new ItemStack(Material.REDSTONE);
		ItemStack smoke = new ItemStack(Material.SULPHUR);
		
		ItemMeta fireflyMeta = firefly.getItemMeta();
		ItemMeta bloodMeta = blood.getItemMeta();
		ItemMeta smokeMeta = smoke.getItemMeta();
		
		fireflyMeta.setDisplayName("§6FireFly");
		bloodMeta.setDisplayName("§4Blood");
		smokeMeta.setDisplayName("§7Smoke");
		
		firefly.setItemMeta(fireflyMeta);
		blood.setItemMeta(bloodMeta);
		smoke.setItemMeta(smokeMeta);
		
		inv.setItem(12, firefly);
		inv.setItem(13, blood);
		inv.setItem(14, smoke);
		
		player.openInventory(inv);
	}

}
