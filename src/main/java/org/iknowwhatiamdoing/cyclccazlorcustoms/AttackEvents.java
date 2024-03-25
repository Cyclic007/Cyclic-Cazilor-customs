package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.util.Vector;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

//TODO make entity to detect and damage mobs from the vectors

public class AttackEvents implements Listener, Plugin {
    @EventHandler
    public static void attackEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        Vector face = player.getLocation().getDirection();
        ItemStack item = player.getInventory().getItemInMainHand();
        Location loc = player.getEyeLocation();
        Entity[] hits = new Entity[30];

        ItemMeta itemMeta = item.getItemMeta();
        int i;
        LivingEntity tempEntity;
        Bukkit.getLogger().info("the vars are ready");

        if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("whip")) {
            Vector[] senders =giveMeTheRays(30 , 30F,face);
            for(i=0; i<30;i++) {
                Bukkit.getLogger().info("the death ray has been fired");
                hits[i] = (Entity) world.rayTraceEntities(loc, senders[i], 5);
                assert hits[i] != null;
                Bukkit.getLogger().info(hits[i].getName());
            }
            for(i=0; i<hits.length;i++){
                tempEntity =(LivingEntity) hits[i];
                assert tempEntity != null;
                tempEntity.damage(8);
            }
        }
    }

    @Override
    public File getDataFolder() {
        return null;
    }

    @Override
    public PluginDescriptionFile getDescription() {
        return null;
    }

    @Override
    public FileConfiguration getConfig() {
        return null;
    }

    @Override
    public InputStream getResource(String filename) {
        return null;
    }

    @Override
    public void saveConfig() {

    }

    @Override
    public void saveDefaultConfig() {

    }

    @Override
    public void saveResource(String resourcePath, boolean replace) {

    }

    @Override
    public void reloadConfig() {

    }

    @Override
    public PluginLoader getPluginLoader() {
        return null;
    }

    @Override
    public Server getServer() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {

    }

    @Override
    public boolean isNaggable() {
        return false;
    }

    @Override
    public void setNaggable(boolean canNag) {

    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return null;
    }

    @Override
    public BiomeProvider getDefaultBiomeProvider(String worldName, String id) {
        return null;
    }

    @Override
    public Logger getLogger() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return null;
    }
    public static Vector[] giveMeTheRays(int numberOut, Float range,Vector direction){
        Bukkit.getLogger().info("stage1");
        Vector[] vectors = new Vector[numberOut+2];
        Vector[] vectors1 = new Vector[numberOut/2+1];
        vectors[0] = direction;
        vectors1[0] =direction;
        int iterations;
        Bukkit.getLogger().info("stage1");
        for(iterations = 1; iterations<=numberOut-1;iterations++) {
            Bukkit.getLogger().info(String.valueOf(iterations));
            if (iterations < numberOut / 2) {
                vectors[iterations] = vectors[iterations - 1].rotateAroundY((range*(Math.PI/180)) / numberOut);
            } else if (iterations > numberOut / 2) {
                vectors1[iterations-15] = vectors1[iterations - 16].rotateAroundY(-(range*(Math.PI/180)) / numberOut);
            } else if (iterations == numberOut / 2) {
                vectors[iterations] = direction;
            } else {
                Bukkit.getLogger().warning("this is not good");
            }

        }
        for(iterations =0; iterations<= vectors1.length;iterations++){
            try {
                vectors[iterations + vectors1.length] = vectors1[iterations];
                Bukkit.getLogger().info(String.valueOf(iterations));
            }catch (Exception exception){
                break;
            }
        }
        Bukkit.getLogger().info("loop has finished");
        return  vectors;



    }
}
