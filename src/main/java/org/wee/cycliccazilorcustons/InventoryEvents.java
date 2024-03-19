package org.wee.cycliccazilorcustons;
/*        */
/*    */

import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;

/*    */
/*    */ public class InventoryEvents
        /*    */ implements Listener
        /*    */ {
    /*    */
    @EventHandler
    /*    */ public void onClick(InventoryClickEvent e) {
        /* 12 */
        if (e.getClickedInventory() == null)
            /* 13 */ return;
        if (e.getClickedInventory().getHolder() instanceof CustomMenus)
            /* 14 */ e.setCancelled(true);
        /*    */
    }
    /*    */
}