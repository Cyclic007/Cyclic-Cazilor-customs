package org.wee.cycliccazilorcustons;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;
//TODO make entity to detect and damage mobs from the vectors

public class AttackEvents implements Listener {
    @EventHandler
    public static void attackEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        Vector face = player.getFacing().getDirection();
        ItemStack item = player.getItemInUse();
        Location loc = face.toLocation(player.getWorld());

        if (item == ItemManager.whip && player.isHandRaised()) {
            face.multiply(5);
            Vector left = face.clone();
            Vector right = face.clone();
        }
    }
}
