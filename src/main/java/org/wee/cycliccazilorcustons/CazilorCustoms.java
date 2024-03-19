package org.wee.cycliccazilorcustons;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/*    */
/*    */ public class CazilorCustoms extends JavaPlugin {
    /*    */
    public void onEnable() {
        /* 16 */
        ItemManager.init();
        /* 17 */
        getCommand("giveonerifle").setExecutor(new ItemCommands());
        /* 18 */
        getCommand("giveshotgun").setExecutor(new ItemCommands());
        /* 19 */
        getCommand("giveweakthrowbomb").setExecutor(new ItemCommands());
        /* 20 */
        getCommand("givethrowbomb").setExecutor(new ItemCommands());
        /* 21 */
        getCommand("givemermaidcharm").setExecutor(new ItemCommands());
        /* 22 */
        getCommand("givefloatcharm").setExecutor(new ItemCommands());
        /* 23 */
        getCommand("givefangshield").setExecutor(new ItemCommands());
        /* 24 */
        getCommand("cazilorcustomitems").setExecutor(new ItemCommands());
        /* 25 */
        getServer().getPluginManager().registerEvents(new ProjectileEvents(), this);
        /* 26 */
        getServer().getPluginManager().registerEvents(new CharmEvents(), this);
        /* 27 */
        getServer().getPluginManager().registerEvents(new ShieldEvents(), this);
        /* 28 */
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