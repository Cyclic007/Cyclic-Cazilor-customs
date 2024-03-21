package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class MolotavThrowEvent implements Listener {
    @EventHandler
    public static void WeDidntStartTheFire(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Location location = event.getPlayer().getLocation();
        World world = event.getPlayer().getWorld();
        Vector faceing = player.getFacing().getDirection();
    }
}
