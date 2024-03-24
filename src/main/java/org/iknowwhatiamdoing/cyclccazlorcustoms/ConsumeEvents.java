package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

//done do not touch
public class ConsumeEvents implements Listener, Plugin {
    @EventHandler
    public static void foobar(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        ItemStack item = event.getItem();
        ItemMeta itemMeta = item.getItemMeta();

        if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("Jack Danals")) {
            if (player.hasPotionEffect(PotionEffectType.CONFUSION)) {
                if (player.hasPotionEffect(PotionEffectType.SLOW)) {
                    if (player.hasPotionEffect(PotionEffectType.DARKNESS)) {
                        if (player.hasPotionEffect(PotionEffectType.POISON)) {
                            if (player.hasPotionEffect(PotionEffectType.HUNGER)) {
                                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 225, 20));
                            }
                        } else {
                            player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 2000, 1));
                        }
                    } else {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS, 2000, 6));
                    }
                } else {
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 6000, 3));
                }
            } else {
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 6000, 2));
            }
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 3000, 1));
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
