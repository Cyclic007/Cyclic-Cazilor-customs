package org.wee.cycliccazilorcustons;

import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.MetadataValue;
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
            /*  59 */
            if (event.getEntity() instanceof ThrownPotion) {
                /*  60 */
                Player player = (Player) event.getEntity().getShooter();
                /*  61 */
                if (player.getItemInHand() != null) {
                    /*  62 */
                    ItemMeta itemMeta = player.getItemInHand().getItemMeta();
                    /*  63 */
                    if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("§6Light Powder Bag")) {
                        /*  64 */
                        event.getEntity().setMetadata("Explosive", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*     */
                    }
                    /*  66 */
                    if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("§6Powder Bag")) {
                        /*  67 */
                        event.getEntity().setMetadata("Explosive2", new FixedMetadataValue(this, Boolean.valueOf(true)));
                        /*     */
                    }
                    /*     */
                }
                /*     */
            }
            /*     */
        }
        /*     */
    }

    /*     */
    /*     */
    @EventHandler
    /*     */ public void onHit(EntityDamageByEntityEvent event) {
        /*  76 */
        Entity damager = event.getDamager();
        /*  77 */
        if (!(damager instanceof org.bukkit.entity.Arrow))
            /*  78 */ return;
        if (damager.hasMetadata("TaneArrow")) {
            /*  79 */
            event.setDamage(30.0D);
            /*     */
        }
        /*  81 */
        if (damager.hasMetadata("BlunderArrow")) {
            /*  82 */
            event.setDamage(3.5D);
            /*     */
        }
        /*     */
    }

    /*     */
    /*     */
    @EventHandler
    /*     */ public void onBlockHit(ProjectileHitEvent event) {
        /*  88 */
        Projectile p = event.getEntity();
        /*  89 */
        if (p instanceof org.bukkit.entity.Arrow &&
                /*  90 */       p.hasMetadata("BlunderArrow")) {
            /*  91 */
            p.remove();
            /*     */
        }
        /*     */
    }

    /*     */
    /*     */
    /*     */
    @EventHandler
    /*     */ public void onPotionSplash(PotionSplashEvent event) {
        /*  98 */
        ThrownPotion potion = event.getEntity();
        /*  99 */
        if (potion.hasMetadata("Explosive")) {
            /* 100 */
            Location potionLocation = event.getEntity().getLocation();
            /* 101 */
            event.getEntity().getWorld().createExplosion(potionLocation.getX(), potionLocation.getY(), potionLocation.getZ(), 1.5F, false, true);
            /*     */
        }
        /* 103 */
        if (potion.hasMetadata("Explosive2")) {
            /* 104 */
            Location potionLocation = event.getEntity().getLocation();
            /* 105 */
            event.getEntity().getWorld().createExplosion(potionLocation.getX(), potionLocation.getY(), potionLocation.getZ(), 2.5F, false, true);
            /*     */
        }
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public File getDataFolder() {
        /* 111 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public PluginDescriptionFile getDescription() {
        /* 116 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public FileConfiguration getConfig() {
        /* 121 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public InputStream getResource(String s) {
        /* 126 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public void saveConfig() {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public void saveDefaultConfig() {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public void saveResource(String s, boolean b) {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    public void reloadConfig() {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    public PluginLoader getPluginLoader() {
        /* 151 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public Server getServer() {
        /* 156 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public boolean isEnabled() {
        /* 161 */
        return false;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public void onDisable() {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    /*     */
    public void onLoad() {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    public void onEnable() {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    public boolean isNaggable() {
        /* 181 */
        return false;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    public void setNaggable(boolean b) {
    }

    /*     */
    /*     */
    /*     */
    /*     */
    public ChunkGenerator getDefaultWorldGenerator(String s, String s1) {
        /* 191 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public BiomeProvider getDefaultBiomeProvider(String s, String s1) {
        /* 196 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public Logger getLogger() {
        /* 201 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public String getName() {
        /* 206 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        /* 211 */
        return false;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        /* 216 */
        return null;
        /*     */
    }
    /*     */
}
