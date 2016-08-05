package me.bunny.packeteffects;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_7_R4.PacketPlayOutWorldParticles;

public class Helix {

	public static void createHelix(Player player) {
		Location loc = player.getLocation();
		int radius = 2;
		for(double y = 0; y <= 50; y+=0.05) {
			double x = radius * Math.cos(y);
			double z = radius * Math.sin(y);
			PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles("fireworksSpark", (float) (loc.getX() + x), (float) (loc.getY() + y), (float) (loc.getZ() + z), 0, 0, 0, 0, 1);
			((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
		}
	}

}
