package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.projectiles.ProjectileSource;
import org.bukkit.util.Vector;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MolotavThrowEvent implements Listener {
    @EventHandler
    public static void WeDidntStartTheFire(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Location location = event.getPlayer().getLocation();
        World world = event.getPlayer().getWorld();
        Vector vector = player.getFacing().getDirection();
        ItemStack item = player.getItemInHand();
        ItemMeta itemMeta = item.getItemMeta();
        if(event.getAction() == Action.LEFT_CLICK_AIR){
            if(itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("Jack Danals")){
                Arrow arrow = world.spawnArrow(location,vector, 0.6F,20);
                arrow.setMetadata("author", new MetadataValue() {
                    @Override
                    public Object value() {
                        return null;
                    }

                    @Override
                    public int asInt() {
                        return 0;
                    }

                    @Override
                    public float asFloat() {
                        return 0;
                    }

                    @Override
                    public double asDouble() {
                        return 0;
                    }

                    @Override
                    public long asLong() {
                        return 0;
                    }

                    @Override
                    public short asShort() {
                        return 0;
                    }

                    @Override
                    public byte asByte() {
                        return 0;
                    }

                    @Override
                    public boolean asBoolean() {
                        return true;
                    }

                    @Override
                    public String asString() {
                        return null;
                    }

                    @Override
                    public Plugin getOwningPlugin() {
                        return null;
                    }

                    @Override
                    public void invalidate() {

                    }
                });
            }
        }
    }
    @EventHandler
    public static void steve(ProjectileHitEvent event){
        Projectile projectile = event.getEntity();
        Location location = projectile.getLocation();
        World world = projectile.getWorld();
        Block block = location.getBlock();
        if(projectile.hasMetadata("author")){
            int[][][] name = {{
                    {},{},{},{},{}
            },{
                    {},{},{},{},{}
            },{
                    {},{},{},{},{}
            },{
                    {},{},{},{},{}
            },{
                    {},{},{},{},{}
            }
            };
        }

    }
}

