package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

//done do not touch
public class ConsumeEvents implements Listener {
    @EventHandler
    public static void foobar(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        ItemStack item = event.getItem();

        if (item == ItemManager.JackDanals) {
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
}
