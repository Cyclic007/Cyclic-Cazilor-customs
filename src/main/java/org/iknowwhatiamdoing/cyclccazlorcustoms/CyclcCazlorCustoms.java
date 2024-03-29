package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
//todo whip
//todo make texture pack

/*    */
/*    */ public class CyclcCazlorCustoms extends JavaPlugin {
    /*    */
    public void onEnable() {
        /* 16 */
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new ProjectileEvents(), this);
        /* 26 */
        getServer().getPluginManager().registerEvents(new CharmEvents(), this);
        /* 27 */
        getServer().getPluginManager().registerEvents(new ShieldEvents(), this);
        /* 28 */
        getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
        getServer().getPluginManager().registerEvents(new MolotavThrowEvent(), this);
        getServer().getPluginManager().registerEvents(new ConsumeEvents(), this);
        getServer().getPluginManager().registerEvents(new PowderBombEvents(), this);
        getServer().getPluginManager().registerEvents(new AttackEvents(), this);
        getServer().getPluginManager().registerEvents(new InventoryEvents(), this);
        /* 29 */
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[CazilorCustoms]: Plugin is enabled!");
        /*    */

    }

    /*    */
    /*    */
    /*    */
    public void onDisable() {
        /* 34 */
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[CazilorCustoms]: Plugin is disabled!");
        /*    */
    }
    /*    */
}