package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemCommands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }
        Player player = (Player) sender;
        if (player.isOp()) {
            if (cmd.getName().equalsIgnoreCase("giveonerifle")) {
                player.getInventory().addItem(ItemManager.one_rifle);
            }
            if (cmd.getName().equalsIgnoreCase("giveshotgun")) {
                player.getInventory().addItem(ItemManager.shotgun);
            }
            if (cmd.getName().equalsIgnoreCase("giveweakthrowbomb")) {
                player.getInventory().addItem(ItemManager.weak_throw_bomb);
            }
            if (cmd.getName().equalsIgnoreCase("givethrowbomb")) {
                player.getInventory().addItem(ItemManager.throw_bomb);
            }
            if (cmd.getName().equalsIgnoreCase("givemermaidcharm")) {
                player.getInventory().addItem(ItemManager.mermaid_charm);
            }
            if (cmd.getName().equalsIgnoreCase("givefloatcharm")) {
                player.getInventory().addItem(ItemManager.float_charm);
            }
            if (cmd.getName().equalsIgnoreCase("givefangshield")) {
                player.getInventory().addItem(ItemManager.fang_shield);
            }
        }
        if (cmd.getName().equalsIgnoreCase("cazilorcustomitems")) {
            CustomMenus gui = new CustomMenus();
            player.openInventory(gui.getInventory());
        }
        return true;
    }
}

