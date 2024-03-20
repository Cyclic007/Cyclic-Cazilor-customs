package org.wee.cycliccazilorcustons;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

public class ConsumeEvents implements Listener {
    @EventHandler
    public static void foobar(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        ItemStack item = event.getItem();

    }
}
