package org.iknowwhatiamdoing.cyclccazlorcustoms;

/*    */

import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.EntityType;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;

/*    */
/*    */ public class ShieldEvents
        /*    */ implements Listener
        /*    */ {
    /*    */
    @EventHandler
    /*    */ public static void onPlayerClick(PlayerInteractEvent event) {
        /* 18 */
        if (event.getAction() == Action.LEFT_CLICK_AIR) {
            /* 19 */
            Player p = event.getPlayer();
            /* 20 */
            ItemStack item = p.getItemInHand();
            /* 21 */
            if (item.getType() == Material.SHIELD && item.getItemMeta().getLore() != null &&
                    /* 22 */         item.getItemMeta().getLore().contains("§7to summon Evoker fangs as")) {
                /* 23 */
                Location loc = p.getLocation().add(p.getLocation().getDirection().multiply(2));
                /* 24 */
                p.getWorld().spawnEntity(loc, EntityType.EVOKER_FANGS);
                /*    */
            }
            /*    */
        }
        /*    */
    }
    /*    */
}