package me.bunny.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.slikey.effectlib.effect.HelixEffect;
import de.slikey.effectlib.effect.ShieldEffect;
import de.slikey.effectlib.effect.StarEffect;
import de.slikey.effectlib.effect.VortexEffect;
import de.slikey.effectlib.effect.LoveEffect;
import de.slikey.effectlib.effect.MusicEffect;
import me.bunny.arraylist.Blood;
import me.bunny.arraylist.Firefly;
import me.bunny.arraylist.Smoke;
import me.bunny.main.Main;
import me.bunny.prefix.Prefix;

public class InvClick implements Listener {

	Main plugin;

	public InvClick(Main main) {

	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Player player = (Player) e.getWhoClicked();
		if(e.getInventory().getTitle().equalsIgnoreCase("§b§lVoting Selector")) {
			if(e.getCurrentItem().getType().equals(Material.DIAMOND)) {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lVoting")) {
					player.closeInventory();
					player.sendMessage("§6http://minecraft-mp.com/server/23087/vote/");
					player.sendMessage("§6http://www.planetminecraft.com/server/creaturecraft-2461021/vote/");
					player.sendMessage("§6http://www.minecraft-index.com/15762-creaturecraft/vote");
					player.sendMessage("§6https://mineservers.com/server/0K1wus52/vote");
				}
			}else{
				if(e.getCurrentItem().getType().equals(Material.PAPER)) {
					if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cPMC")) {
						player.closeInventory();
						player.sendMessage("§6http://www.planetminecraft.com/server/creaturecraft-2461021/vote/");
					}else{
						if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cMC-Index")) {
							player.closeInventory();
							player.sendMessage("§6http://www.minecraft-index.com/15762-creaturecraft/vote");
						}else{
							if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cMine Servers")) {
								player.closeInventory();
								player.sendMessage("§6https://mineservers.com/server/0K1wus52/vote");
							}else{
								if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cMinecraft-Mp")) {
									player.closeInventory();
									player.sendMessage("§6http://minecraft-mp.com/server/23087/vote/");
								}
							}
						}
					}
				}
			}
		}
		if(e.getInventory().getTitle().equalsIgnoreCase("§c§lAdvanced Particle Selector")) {
			if(e.getCurrentItem().getType().equals(Material.REDSTONE_BLOCK)) {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lClear all effects!")) {
					Main.effectManager.cancel(true);
					player.closeInventory();
					player.sendMessage(Prefix.prefix + "§aAll effects have been cleared!");
				}
			}else{
				if(e.getCurrentItem().getType().equals(Material.PAPER)) {
					if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lVortex")) {
						if(player.hasPermission("creaturecraft.particles.advanced.vortex")) {
							Firefly.fireflylist.remove(player.getName());
							Smoke.smokelist.remove(player.getName());
							Blood.bloodlist.remove(player.getName());
							VortexEffect vortexeff = new VortexEffect(Main.effectManager);
							vortexeff.setEntity(player);
							vortexeff.iterations = 10 * 6;
							vortexeff.start();
							player.closeInventory();
							player.sendMessage(Prefix.prefix + "§aVortex effect started!");
						}
					}else{
						if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lHelix")) {
							if(player.hasPermission("creaturecraft.particles.advanced.helix")) {
								Firefly.fireflylist.remove(player.getName());
								Smoke.smokelist.remove(player.getName());
								Blood.bloodlist.remove(player.getName());
								HelixEffect helix = new HelixEffect(Main.effectManager);
								helix.setEntity(player);
								helix.iterations = 10 * 6;
								helix.radius = 2;
								helix.start();
								player.closeInventory();
								player.sendMessage(Prefix.prefix + "§aHelix effect started!");
							}
						}else{
							if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lShield")) {
								if(player.hasPermission("creaturecraft.particles.advanced.shield")) {
									Firefly.fireflylist.remove(player.getName());
									Smoke.smokelist.remove(player.getName());
									Blood.bloodlist.remove(player.getName());
									ShieldEffect shield = new ShieldEffect(Main.effectManager);
									shield.setEntity(player);
									shield.iterations = 10 * 6;
									shield.start();
									player.closeInventory();
									player.sendMessage(Prefix.prefix + "§aShield effect started!");
								}
							}else{
								if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lLove")) {
									if(player.hasPermission("creaturecraft.particles.advanced.love")) {
										Firefly.fireflylist.remove(player.getName());
										Smoke.smokelist.remove(player.getName());
										Blood.bloodlist.remove(player.getName());
										LoveEffect Love = new LoveEffect(Main.effectManager);
										Love.setEntity(player);
										Love.iterations = 10 * 6;
										Love.start();
										player.closeInventory();
										player.sendMessage(Prefix.prefix + "§aLove effect started!");
									}
								}else{
									if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lStar")) {
										if(player.hasPermission("creaturecraft.particles.advanced.love")) {
											Firefly.fireflylist.remove(player.getName());
											Smoke.smokelist.remove(player.getName());
											Blood.bloodlist.remove(player.getName());
											StarEffect star = new StarEffect(Main.effectManager);
											star.setEntity(player);
											star.iterations = 10 * 6;
											star.start();
											player.closeInventory();
											player.sendMessage(Prefix.prefix + "§aStar effect started!");
										}
									}else{
										if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4§lMusic")) {
											if(player.hasPermission("creaturecraft.particles.advanced.music")) {
												Firefly.fireflylist.remove(player.getName());
												Smoke.smokelist.remove(player.getName());
												Blood.bloodlist.remove(player.getName());
												MusicEffect music = new MusicEffect(Main.effectManager);
												music.setEntity(player);
												music.iterations = 10 * 6;
												music.start();
												player.closeInventory();
												player.sendMessage(Prefix.prefix + "§aMusic effect started!");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if(e.getInventory().getTitle().equalsIgnoreCase("§c§lBasic Particle Selector")) {
			if(e.getCurrentItem().getType().equals(Material.GLOWSTONE_DUST)) {
				if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Firefly")) {
					if(player.hasPermission("creaturecraft.particles.firefly")) {
						if(Firefly.fireflylist.contains(player.getName())) {
							Firefly.fireflylist.remove(player.getName());
							Smoke.smokelist.remove(player.getName());
							Blood.bloodlist.remove(player.getName());
							player.sendMessage(Prefix.prefix + "§bYou have §cdisabled §bthe firefly effect!");
							player.closeInventory();
						}else{
							Firefly.fireflylist.add(player.getName());
							Smoke.smokelist.remove(player.getName());
							Blood.bloodlist.remove(player.getName());
							Main.effectManager.cancel(true);
							player.sendMessage(Prefix.prefix + "§bYou have §aenabled §bthe firefly effect!");
							player.closeInventory();
						}
					}else{
						player.sendMessage(Prefix.prefix + "§cYou do not have permission for the firefly effect!");
						player.closeInventory();
					}
				}else{

				}
			}else{
				if(e.getCurrentItem().getType().equals(Material.REDSTONE)) {
					if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4Blood")) {
						if(player.hasPermission("creaturecraft.particles.blood")) {
							if(Blood.bloodlist.contains(player.getName())) {
								Firefly.fireflylist.remove(player.getName());
								Smoke.smokelist.remove(player.getName());
								Blood.bloodlist.remove(player.getName());
								player.sendMessage(Prefix.prefix + "§bYou have §cdisabled §bthe blood effect!");
								player.closeInventory();
							}else{
								Firefly.fireflylist.remove(player.getName());
								Smoke.smokelist.remove(player.getName());
								Blood.bloodlist.add(player.getName());
								Main.effectManager.cancel(true);
								player.sendMessage(Prefix.prefix + "§bYou have §aenabled §bthe blood effect!");
								player.closeInventory();
							}
						}else{
							player.sendMessage(Prefix.prefix + "§cYou do not have permission for the blood effect!");
							player.closeInventory();
						}
					}else{

					}
				}else{
					if(e.getCurrentItem().getType().equals(Material.SULPHUR)) {
						if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Smoke")) {
							if(player.hasPermission("creaturecraft.particles.smoke")) {
								if(Smoke.smokelist.contains(player.getName())) {
									Firefly.fireflylist.remove(player.getName());
									Blood.bloodlist.remove(player.getName());
									Smoke.smokelist.remove(player.getName());
									player.sendMessage(Prefix.prefix + "§bYou have §cdisabled §bthe Smoke effect!");
									player.closeInventory();
								}else{
									Firefly.fireflylist.remove(player.getName());
									Blood.bloodlist.remove(player.getName());
									Smoke.smokelist.add(player.getName());
									Main.effectManager.cancel(true);
									player.sendMessage(Prefix.prefix + "§bYou have §aenabled §bthe Smoke effect!");
									player.closeInventory();
								}
							}else{
								player.sendMessage(Prefix.prefix + "§cYou do not have permission for the smoke effect!");
								player.closeInventory();
							}
						}else{

						}
					}
				}
			}
		}
	}
}