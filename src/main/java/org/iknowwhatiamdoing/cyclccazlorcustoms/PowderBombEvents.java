package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.projectiles.ProjectileSource;

public class PowderBombEvents implements Listener {
    @EventHandler
    public void letHimCook(ProjectileLaunchEvent event) {
        if (event.getEntity() instanceof ThrownPotion) {
            /*  60 */
            Entity source = (Entity) event.getEntity().getShooter();
            ProjectileSource projectileSource = event.getEntity().getShooter();
            /*  61 */
            assert source != null;
            if (source.getType() == EntityType.PLAYER) {
                Player player = (Player) source;
                /*  62 */
                ItemMeta itemMeta = player.getItemInHand().getItemMeta();
                /*  63 */
                if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("§6Light Powder Bag")) {
                    /*  64 */
                    event.getEntity().setMetadata("Explosive", new FixedMetadataValue((Plugin) this, Boolean.valueOf(true)));
                    /*     */
                }
                /*  66 */
                if (itemMeta != null && itemMeta.hasDisplayName() && itemMeta.getDisplayName().contains("§6Powder Bag")) {
                    /*  67 */
                    event.getEntity().setMetadata("Explosive2", new FixedMetadataValue((Plugin) this, Boolean.valueOf(true)));
                    /*     */
                }
                /*     */




                /*     */
            }

        }
    }

    @EventHandler
    public void bar(PotionSplashEvent event) {
        Entity entity = event.getEntity();
        ThrownPotion potion = event.getPotion();
        Location loc = potion.getLocation();
        if (potion.hasMetadata("Explosive") || potion.hasMetadata("Explosive2")) {
            if (potion.hasMetadata("Explosive")) {
                event.getEntity().getWorld().createExplosion(loc, 1.5f, false, true);
            } else {
                event.getEntity().getWorld().createExplosion(loc, 2.5f, false, true);
            }
        }

    }
}


