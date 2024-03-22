package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getLogger;

public class ItemManager{
    public static ItemStack one_rifle;
    public static ItemStack shotgun;
    public static ItemStack weak_throw_bomb;
    public static ItemStack throw_bomb;
    public static ItemStack mermaid_charm;
    public static ItemStack float_charm;
    public static ItemStack whip;
    public static ItemStack JackDanals;
    public static ItemStack fang_shield;
    public static void init() {
        createonerifle();
        createshotgun();
        createweakthrowbomb();
        createthrowbomb();
        createmermaidcharm();
        createfloatcharm();
        createfangshield();
        createJack();
        createwhip();
    }

        
    private static void createonerifle() {
        ItemStack item = new ItemStack(Material.CROSSBOW, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§4Tanegashima");
        List<String> lore = new ArrayList<>();
        lore.add("§7Ancient form of a rifle");
        lore.add("§7found in Feudal Japan");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);
        one_rifle = item;

        ShapedRecipe or = new ShapedRecipe(NamespacedKey.minecraft("onerifle"), item);
        or.shape("wi ", "gcn", "ii ");
        or.setIngredient('i', Material.IRON_INGOT);
        or.setIngredient('g', Material.GUNPOWDER);
        or.setIngredient('c', Material.CROSSBOW);
        or.setIngredient('w', Material.TRIPWIRE_HOOK);
        or.setIngredient('n', Material.NETHERITE_INGOT);
        Bukkit.getServer().addRecipe(or);
    }

    private static void createshotgun() {
        ItemStack item = new ItemStack(Material.CROSSBOW, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§4Blunderbuss");
        List<String> lore = new ArrayList<>();
        lore.add("§7Pirate Shotgun");
        lore.add("§7fires in a spread pattern");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.MULTISHOT, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        shotgun = item;

        ShapedRecipe sg = new ShapedRecipe(NamespacedKey.minecraft("shotgun"), item);
        sg.shape("wi ", "gci", "ii ");
        sg.setIngredient('i', Material.IRON_INGOT);
        sg.setIngredient('g', Material.GUNPOWDER);
        sg.setIngredient('c', Material.CROSSBOW);
        sg.setIngredient('w', Material.TRIPWIRE_HOOK);
        Bukkit.getServer().addRecipe(sg);
    }

    private static void createweakthrowbomb() {
        ItemStack item = new ItemStack(Material.SPLASH_POTION, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6Light Powder Bag");
        List<String> lore = new ArrayList<>();
        lore.add("§fHas a light explosive effect when threw");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        weak_throw_bomb = item;

        ShapedRecipe wtb = new ShapedRecipe(NamespacedKey.minecraft("weakthrowbomb"), item);
        wtb.shape(" g ", "ibi", " i ");
        wtb.setIngredient('b', Material.GLASS_BOTTLE);
        wtb.setIngredient('i', Material.IRON_INGOT);
        wtb.setIngredient('g', Material.GUNPOWDER);
        Bukkit.getServer().addRecipe(wtb);
    }

    private static void createthrowbomb() {
        ItemStack item = new ItemStack(Material.SPLASH_POTION, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§6Powder Bag");
        List<String> lore = new ArrayList<>();
        lore.add("§4Don't Put This in Your Kitchen");
        lore.add("§fHas an explosive effect when threw");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        throw_bomb = item;

        ShapedRecipe tb = new ShapedRecipe(NamespacedKey.minecraft("throwbomb"), item);
        tb.shape(" t ", "ibi", " i ");
        tb.setIngredient('b', Material.GLASS_BOTTLE);
        tb.setIngredient('i', Material.IRON_INGOT);
        tb.setIngredient('t', Material.TNT);
        Bukkit.getServer().addRecipe(tb);
    }

    private static void createmermaidcharm() {
        ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§1Mermaids Charm");
        List<String> lore = new ArrayList<>();
        lore.add("§fCharm discovered by Pirates");
        lore.add("§flets the user harness the power of the sea");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(2);
        item.setItemMeta(meta);

        mermaid_charm = item;

        ShapedRecipe mc = new ShapedRecipe(NamespacedKey.minecraft("mermaidcharm"), item);
        mc.shape("sps", "scs", "sss");
        mc.setIngredient('s', Material.NAUTILUS_SHELL);
        mc.setIngredient('c', Material.CONDUIT);
        mc.setIngredient('p', Material.PUFFERFISH);
        Bukkit.getServer().addRecipe(mc);
    }

    private static void createfloatcharm() {
        ItemStack item = new ItemStack(Material.POPPED_CHORUS_FRUIT, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§5Charm of Levitation");
        List<String> lore = new ArrayList<>();
        lore.add("§fItem long abandoned from");
        lore.add("§fEnd Cities");
        lore.add("§fwhen held grants user levitation");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        float_charm = item;

        ShapedRecipe fc = new ShapedRecipe(NamespacedKey.minecraft("floatcharm"), item);
        fc.shape("ppp", "psp", "ppp");
        fc.setIngredient('p', Material.POPPED_CHORUS_FRUIT);
        fc.setIngredient('s', Material.NETHER_STAR);
        Bukkit.getServer().addRecipe(fc);
    }

    private static void createfangshield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§4Shield of the Maw");
        List<String> lore = new ArrayList<>();
        lore.add("§0Uses black magic");
        lore.add("§7to summon Evoker fangs as");
        lore.add("§7a defensive or offensive measure");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 2, false);
        item.setItemMeta(meta);
        fang_shield = item;

        ShapedRecipe fs = new ShapedRecipe(NamespacedKey.minecraft("fangshield"), item);
        fs.shape(" t ", " e ", " s ");
        fs.setIngredient('t', Material.POINTED_DRIPSTONE);
        fs.setIngredient('e', Material.EXPERIENCE_BOTTLE);
        fs.setIngredient('s', Material.SHIELD);
        Bukkit.getServer().addRecipe(fs);

        ShapelessRecipe pc = new ShapelessRecipe(NamespacedKey.minecraft("popchor"), new ItemStack(Material.CHORUS_FRUIT, 1));
        pc.addIngredient(1, Material.ENDER_PEARL);
        pc.addIngredient(1, Material.BEETROOT);
        Bukkit.getServer().addRecipe(pc);

        FurnaceRecipe rfs = new FurnaceRecipe(NamespacedKey.minecraft("rotflss"), new ItemStack(Material.LEATHER, 1), Material.ROTTEN_FLESH, 1.0F, 200);
        Bukkit.getServer().addRecipe(rfs);
    }

        private static void createJack() {
            ItemStack item = new ItemStack(Material.HONEY_BOTTLE, 4);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName("Jack Danals");
            List<String> lore = new ArrayList<>();
            lore.add("YAY a fitting bevrige");
            meta.setLore(lore);
            item.setItemMeta(meta);
            meta.addEnchant(Enchantment.LUCK, 1, true);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            JackDanals = item;

            ShapedRecipe shr = new ShapedRecipe(NamespacedKey.minecraft("jackdanals"), item);
            shr.shape("HWH", "WBW", "HWH");
            shr.setIngredient('W', Material.WHEAT);
            shr.setIngredient('B', Material.GLASS_BOTTLE);
            shr.setIngredient('H', Material.HONEY_BOTTLE);
            Bukkit.getServer().addRecipe(shr);
            Bukkit.getLogger().info("the jack is ready");

        }

        private static void createwhip() {
            ItemStack item = new ItemStack(Material.NETHERITE_SWORD, 1);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName("Whip");
            meta.setCustomModelData(70);
            List<String> lore = new ArrayList<>();
            lore.add("And you whip and you ney ney");
            meta.setLore(lore);
            meta.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            item.setItemMeta(meta);


            ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("whip"), item);
            sr.shape("tl ", " s ", "  s");
            sr.setIngredient('l', Material.LEATHER);
            sr.setIngredient('t', Material.STICK);
            sr.setIngredient('s', Material.STRING);
            Bukkit.getServer().addRecipe(sr);
            getLogger().info("yay the second time");

        }
     }
