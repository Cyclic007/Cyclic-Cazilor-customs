package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
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
        Vector face = player.getFacing().getDirection();
        ItemStack item = player.getItemInUse();
        Location loc = face.toLocation(player.getWorld());

        if (item == ItemManager.whip && player.isHandRaised()) {
            

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
}
