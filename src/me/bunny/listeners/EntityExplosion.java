package me.bunny.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;

import me.bunny.main.Main;

public class EntityExplosion implements Listener {

	Main plugin;

	public EntityExplosion(Main main) {

	}
	
	@EventHandler
	public void onEntityExplode(EntityExplodeEvent event) {
		Entity ent = event.getEntity();
	    if (ent instanceof Fireball) {
	    	((Fireball) ent).setIsIncendiary(false);
	        event.setCancelled(true);
	    }
	}
	@EventHandler
	public void onExplosionPrime(ExplosionPrimeEvent event) {
	    event.setFire(false);
	    Entity ent = event.getEntity();
	    if (ent instanceof Fireball)
	        event.setCancelled(true);
	}
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent event) {
		Entity ent = event.getDamager();
		if(ent instanceof Fireball) {
			event.setCancelled(true);
		}
	}

}
