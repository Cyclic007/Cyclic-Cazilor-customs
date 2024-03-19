package org.wee.cycliccazilorcustons;
/*    */

import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerMoveEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.potion.PotionEffect;
/*    */ import org.bukkit.potion.PotionEffectType;

/*    */
/*    */
/*    */
/*    */
/*    */ public class CharmEvents
        /*    */ implements Listener
        /*    */ {
    /*    */
    @EventHandler
    /*    */ public static void onPlayerMoveHold(PlayerMoveEvent event) {
        /* 20 */
        Player p = event.getPlayer();
        /* 21 */
        ItemStack item = p.getItemInHand();
        /* 22 */
        if (item.getType() == Material.HEART_OF_THE_SEA && item.getItemMeta().getLore() != null &&
                /* 23 */       item.getItemMeta().getLore().contains("§flets the user harness the power of the sea")) {
            /* 24 */
            PotionEffect wbI = new PotionEffect(PotionEffectType.WATER_BREATHING, 40, 1, false);
            /* 25 */
            PotionEffect dgI = new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 40, 1, false);
            /* 26 */
            p.addPotionEffect(wbI);
            /* 27 */
            p.addPotionEffect(dgI);
            /*    */
        }
        /*    */
        /* 30 */
        if (item.getType() == Material.POPPED_CHORUS_FRUIT && item.getItemMeta().getLore() != null &&
                /* 31 */       item.getItemMeta().getLore().contains("§fwhen held grants user levitation")) {
            /* 32 */
            PotionEffect lvI = new PotionEffect(PotionEffectType.LEVITATION, 40, 1, false);
            /* 33 */
            p.addPotionEffect(lvI);
            /*    */
        }
        /*    */
    }
    /*    */
}

