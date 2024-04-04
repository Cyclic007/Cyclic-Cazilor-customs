package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

//TODO make entity to detect and damage mobs from the vectors

public class AttackEvents implements Listener {
    @EventHandler
    public static void attackEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        Vector face = player.getLocation().getDirection();
        ItemStack item = player.getInventory().getItemInMainHand();
        Location loc = player.getEyeLocation();
        Entity[] hits = new Entity[30];
        LivingEntity temp ;
        Vector faceNoY = new Vector(face.getX(),0,face.getY());
        Vector theprintedVector;
        int i;
        for(i=0; i<15;i++){
            theprintedVector = rotate(faceNoY,new Vector(0,1,0),45.0/30.0*i).setY(face.getY());
            Bukkit.getLogger().info(theprintedVector.toString());
            hits[i] = (Entity) world.rayTraceEntities(loc,theprintedVector,5);
            assert hits[i] != null;
            Bukkit.getLogger().info(hits[i].toString());
            if (hits[i].isDead()){
                break;
            }
            temp = (LivingEntity) hits[i];
            temp.damage(4);
        }
        for(i=0; i<15;i++){
            theprintedVector = rotate(faceNoY,new Vector(0,1,0),45.0/30.0*-i).setY(face.getY());
            Bukkit.getLogger().info(theprintedVector.toString());
            hits[i] = (Entity) world.rayTraceEntities(loc,theprintedVector,5);
            assert hits[i] != null;
            Bukkit.getLogger().info(hits[i].toString());
            if (hits[i].isDead()){
                break;
            }
            temp = (LivingEntity) hits[i];
            temp.damage(4);
        }

    }
    public static Vector rotate(Vector toRotate, Vector around, double angle) {
        if (angle == 0)
            return toRotate;

        /*
        v = around;

        x1 = x * ((vx * vx) * (1 - cos a) + cos a) + y * ((vx * vy) * (1 - cos a) - vz * sin a) + ((vx * vz) * (1 - cos a) + vy * sin a)
        x2 = x * (())

         */

        double vx = around.getZ(), vy = around.getY(), vz = around.getX();
        double x = toRotate.getX(), y = toRotate.getY(), z = toRotate.getZ();
        double sinA = Math.sin(Math.toRadians(angle)), cosA = Math.cos(Math.toRadians(angle));

        double x1 = x * ((vx * vx) * (1 - cosA) + cosA) + y * ((vx * vy) * (1 - cosA) - vz * sinA) + z * ((vx * vz) * (1 - cosA) + vy * sinA);
        double y1 = x * ((vy * vx) * (1 - cosA) + vz * sinA) + y * ((vy * vy) * (1 - cosA) + cosA) + z * ((vy * vz) * (1 - cosA) - vx * sinA);
        double z1 = x * ((vz * vx) * (1 - cosA) - vy * sinA) + y * ((vz * vy) * (1 - cosA) + vx * sinA) + z * ((vz * vz) * (1 - cosA) + cosA);

        return new Vector(x1, y1, z1);
    }
}
