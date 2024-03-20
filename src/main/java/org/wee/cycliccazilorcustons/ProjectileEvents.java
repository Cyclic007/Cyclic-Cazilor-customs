package org.wee.cycliccazilorcustons;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.util.Vector;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

/*     */
/*     */ public class ProjectileEvents implements Listener, Plugin {
    /*     */
    @EventHandler
    /*     */ public void onProjectileLaunch(ProjectileLaunchEvent event) {
        /*  35 */
        if (event.getEntity().getShooter() instanceof Player) {
            /*  36 */
            if (event.getEntity() instanceof org.bukkit.entity.Arrow) {
                /*  37 */
                Projectile projectile = event.getEntity();
                /*  38 */
                Player player = (Player) event.getEntity().getShooter();
                /*  39 */
                if (player.getItemInHand() != null) {
                    /*  40 */
                    ItemMeta itemMeta = player.getItemInHand().getItemMeta();
                    /*  41 */
                    if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("§4Tanegashima")) {
                        /*  42 */
                        event.getEntity().setMetadata("TaneArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*     */
                    }
                    /*  44 */
                    if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("§4Blunderbuss")) {
                        /*  45 */
                        Vector v = projectile.getVelocity();
                        /*  46 */
                        float spd = 2.0F;
                        /*  47 */
                        float spa = 12.0F;
                        /*  48 */
                        player.getWorld().spawnArrow(player.getEyeLocation(), v, spd, spa).setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*  49 */
                        player.getWorld().spawnArrow(player.getEyeLocation(), v, spd, spa).setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*  50 */
                        player.getWorld().spawnArrow(player.getEyeLocation(), v, spd, spa).setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*  51 */
                        player.getWorld().spawnArrow(player.getEyeLocation(), v, spd, spa).setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*  52 */
                        player.getWorld().spawnArrow(player.getEyeLocation(), v, spd, spa).setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*  53 */
                        player.getWorld().spawnArrow(player.getEyeLocation(), v, spd, spa).setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*  54 */
                        player.getWorld().spawnArrow(player.getEyeLocation(), v, spd, spa).setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*  55 */
                        event.getEntity().setMetadata("BlunderArrow", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*     */
                    }
                    /*     */
                }
                /*     */
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
    public InputStream getResource(String s) {
        return null;
    }

    @Override
    public void saveConfig() {

    }

    @Override
    public void saveDefaultConfig() {

    }

    @Override
    public void saveResource(String s, boolean b) {

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
    public void setNaggable(boolean b) {

    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String s, String s1) {
        return null;
    }

    @Override
    public BiomeProvider getDefaultBiomeProvider(String s, String s1) {
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
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
