package org.wee.cycliccazilorcustons;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
public class ItemManager{
public static ItemStack one_rifle;
public static ItemStack shotgun;
public static ItemStack weak_throw_bomb;
public static ItemStack throw_bomb;

public static void init() {
    createonerifle();
    createshotgun();
    createweakthrowbomb();
    createthrowbomb();
    createmermaidcharm();
    createfloatcharm();
    createfangshield();
}
public static ItemStack mermaid_charm; public static ItemStack float_charm; public static ItemStack whip; public static ItemStack fire_stick; public static ItemStack fang_shield;
private static void createonerifle() {
    ItemStack item = new ItemStack(Material.CROSSBOW, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("§4Tanegashima");
    List<String> lore = new ArrayList<>();
    lore.add("§7Ancient form of a rifle");
    lore.add("§7found in Feudal Japan");
    meta.setLore(lore);
    meta.addEnchant(Enchantment.LUCK, 1, false);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    item.setItemMeta(meta);
    one_rifle = item;

    ShapedRecipe or = new ShapedRecipe(NamespacedKey.minecraft("onerifle"), item);
    or.shape(new String[] { "wi ", "gcn", "ii " });
    or.setIngredient('i', Material.IRON_INGOT);
    or.setIngredient('g', Material.GUNPOWDER);
    or.setIngredient('c', Material.CROSSBOW);
    or.setIngredient('w', Material.TRIPWIRE_HOOK);
    or.setIngredient('n', Material.NETHERITE_INGOT);
    Bukkit.getServer().addRecipe((Recipe)or);
}

private static void createshotgun() {
    ItemStack item = new ItemStack(Material.CROSSBOW, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("§4Blunderbuss");
    List<String> lore = new ArrayList<>();
    lore.add("§7Pirate Shotgun");
    lore.add("§7fires in a spread pattern");
    meta.setLore(lore);
    meta.addEnchant(Enchantment.MULTISHOT, 1, false);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    item.setItemMeta(meta);
    shotgun = item;

    ShapedRecipe sg = new ShapedRecipe(NamespacedKey.minecraft("shotgun"), item);
    sg.shape(new String[] { "wi ", "gci", "ii " });
    sg.setIngredient('i', Material.IRON_INGOT);
    sg.setIngredient('g', Material.GUNPOWDER);
    sg.setIngredient('c', Material.CROSSBOW);
    sg.setIngredient('w', Material.TRIPWIRE_HOOK);
    Bukkit.getServer().addRecipe((Recipe)sg);
}

private static void createweakthrowbomb() {
    ItemStack item = new ItemStack(Material.SPLASH_POTION, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("§6Light Powder Bag");
    List<String> lore = new ArrayList<>();
    lore.add("§fHas a light explosive effect when threw");
    meta.setLore(lore);
    meta.addEnchant(Enchantment.LUCK, 1, false);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    item.setItemMeta(meta);
    weak_throw_bomb = item;

    ShapedRecipe wtb = new ShapedRecipe(NamespacedKey.minecraft("weakthrowbomb"), item);
    wtb.shape(new String[] { " g ", "ibi", " i " });
    wtb.setIngredient('b', Material.GLASS_BOTTLE);
    wtb.setIngredient('i', Material.IRON_INGOT);
    wtb.setIngredient('g', Material.GUNPOWDER);
    Bukkit.getServer().addRecipe((Recipe)wtb);
}

private static void createthrowbomb() {
    ItemStack item = new ItemStack(Material.SPLASH_POTION, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("§6Powder Bag");
    List<String> lore = new ArrayList<>();
    lore.add("§4Don't Put This in Your Kitchen");
    lore.add("§fHas an explosive effect when threw");
    meta.setLore(lore);
    meta.addEnchant(Enchantment.LUCK, 1, false);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    item.setItemMeta(meta);
    throw_bomb = item;

    ShapedRecipe tb = new ShapedRecipe(NamespacedKey.minecraft("throwbomb"), item);
    tb.shape(new String[] { " t ", "ibi", " i " });
    tb.setIngredient('b', Material.GLASS_BOTTLE);
    tb.setIngredient('i', Material.IRON_INGOT);
    tb.setIngredient('t', Material.TNT);
    Bukkit.getServer().addRecipe((Recipe)tb);
}

private static void createmermaidcharm() {
    ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("§1Mermaids Charm");
    List<String> lore = new ArrayList<>();
    lore.add("§fCharm discovered by Pirates");
    lore.add("§flets the user harness the power of the sea");
    meta.setLore(lore);
    meta.addEnchant(Enchantment.LUCK, 1, false);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    item.setItemMeta(meta);
    mermaid_charm = item;

    ShapedRecipe mc = new ShapedRecipe(NamespacedKey.minecraft("mermaidcharm"), item);
    mc.shape(new String[] { "sps", "scs", "sss" });
    mc.setIngredient('s', Material.NAUTILUS_SHELL);
    mc.setIngredient('c', Material.CONDUIT);
    mc.setIngredient('p', Material.PUFFERFISH);
    Bukkit.getServer().addRecipe((Recipe)mc);
}

private static void createfloatcharm() {
    ItemStack item = new ItemStack(Material.POPPED_CHORUS_FRUIT, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName("§5Charm of Levitation");
    List<String> lore = new ArrayList<>();
    lore.add("§fItem long abandoned from");
    lore.add("§fEnd Cities");
    lore.add("§fwhen held grants user levitation");
    meta.setLore(lore);
    meta.addEnchant(Enchantment.LUCK, 1, false);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    item.setItemMeta(meta);
    float_charm = item;

    ShapedRecipe fc = new ShapedRecipe(NamespacedKey.minecraft("floatcharm"), item);
    fc.shape(new String[] { "ppp", "psp", "ppp" });
    fc.setIngredient('p', Material.POPPED_CHORUS_FRUIT);
    fc.setIngredient('s', Material.NETHER_STAR);
    Bukkit.getServer().addRecipe((Recipe)fc);
}

private static void createfangshield() {
    ItemStack item = new ItemStack(Material.SHIELD, 1);
    ItemMeta meta = item.getItemMeta();
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
    fs.shape(new String[] { " t ", " e ", " s " });
    fs.setIngredient('t', Material.POINTED_DRIPSTONE);
    fs.setIngredient('e', Material.EXPERIENCE_BOTTLE);
    fs.setIngredient('s', Material.SHIELD);
    Bukkit.getServer().addRecipe((Recipe)fs);

    ShapelessRecipe pc = new ShapelessRecipe(NamespacedKey.minecraft("popchor"), new ItemStack(Material.CHORUS_FRUIT, 1));
    pc.addIngredient(1, Material.ENDER_PEARL);
    pc.addIngredient(1, Material.BEETROOT);
    Bukkit.getServer().addRecipe((Recipe)pc);

    FurnaceRecipe rfs = new FurnaceRecipe(NamespacedKey.minecraft("rotflss"), new ItemStack(Material.LEATHER, 1), Material.ROTTEN_FLESH, 1.0F, 200);
    Bukkit.getServer().addRecipe((Recipe)rfs);
}
 }
