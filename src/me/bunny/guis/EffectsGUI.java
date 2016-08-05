package me.bunny.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EffectsGUI {
	
	public static void particle(Player player) {
		Inventory inv = Bukkit.getServer().createInventory(null, 27, "§c§lAdvanced Particle Selector");
		
		ItemStack vortex = new ItemStack(Material.PAPER);
		ItemStack helix = new ItemStack(Material.PAPER);
		ItemStack shield = new ItemStack(Material.PAPER);
		ItemStack Love = new ItemStack(Material.PAPER);
		ItemStack star = new ItemStack(Material.PAPER);
		ItemStack music = new ItemStack(Material.PAPER);
		
		ItemStack clear = new ItemStack(Material.REDSTONE_BLOCK);
		
		ItemMeta vortexMeta = vortex.getItemMeta();
		ItemMeta helixMeta = helix.getItemMeta();
		ItemMeta shieldMeta = shield.getItemMeta();
		ItemMeta LoveMeta = Love.getItemMeta();
		ItemMeta starMeta = star.getItemMeta();
		ItemMeta musicMeta = music.getItemMeta();
		
		ItemMeta clearMeta = clear.getItemMeta();
		
		vortexMeta.setDisplayName("§4§lVortex");
		helixMeta.setDisplayName("§4§lHelix");
		shieldMeta.setDisplayName("§4§lShield");
		LoveMeta.setDisplayName("§4§lLove");
		starMeta.setDisplayName("§4§lStar");
		musicMeta.setDisplayName("§4§lMusic");
		
		clearMeta.setDisplayName("§c§lClear all effects!");
		
		vortex.setItemMeta(vortexMeta);
		helix.setItemMeta(helixMeta);
		shield.setItemMeta(shieldMeta);
		Love.setItemMeta(LoveMeta);
		star.setItemMeta(starMeta);
		music.setItemMeta(musicMeta);
		
		clear.setItemMeta(clearMeta);
		
		inv.setItem(0, vortex);
		inv.setItem(1, helix);
		inv.setItem(2, shield);
		inv.setItem(3, Love);
		inv.setItem(4, star);
		inv.setItem(5, music);
		
		inv.setItem(26, clear);
		
		player.openInventory(inv);
	}

}
