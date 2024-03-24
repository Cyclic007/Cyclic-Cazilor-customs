package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

public class MolotavThrowEvent implements Listener {
    public static NamespacedKey key = new NamespacedKey("author","author");
    @EventHandler
    public static void WeDidntStartTheFire(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Location location = event.getPlayer().getLocation();
        World world = event.getPlayer().getWorld();
        Vector vector = player.getEyeLocation().getDirection();
        ItemStack item = player.getInventory().getItemInMainHand();
        ItemMeta itemMeta = item.getItemMeta();
        if(vector.getY()<=0){
            vector.add(new Vector(0,1,0));
        }
        if(event.getAction() == Action.LEFT_CLICK_AIR){
            if(itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("Jack Danals")){
                AbstractArrow arrow = world.spawnArrow(location,vector, 0.6F,20, Arrow.class);
                Bukkit.getLogger().info("the arrow has spawned");
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
            }
        }
    }
    public static Block block1;
    @EventHandler
    public static void steve(ProjectileHitEvent event){

        Projectile projectile = event.getEntity();
        if(projectile.getType() != EntityType.ARROW)return;
        AbstractArrow arrow = (AbstractArrow)projectile;
        Location location = projectile.getLocation();
        World world = projectile.getWorld();
        Block block = location.getBlock();
        if(arrow.getShooter() == null){
            int[][][] name = blockGrider.gridIt(block,5);
            int i, e;
            for (i=0; i<5;i++){
                for(e=0;e<5;e++){
                    while(true){
                        block1 = world.getBlockAt(name[e][i][0],name[e][i][1],name[e][i][2]);
                        if(block1.getType() == Material.AIR){
                            break;
                        }else {
                            name[e][i][2]++;
                        }
                    }
                    block1.setType(Material.FIRE);
                    if(block1.getLocation().add(0,-1,0).getBlock().getType() == Material.AIR){
                        block1.getLocation().add(0,-1,0).getBlock().setType(Material.FIRE);
                    }

                }
            }
            arrow.remove();

        }

    }
}

