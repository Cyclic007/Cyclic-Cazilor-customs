package org.iknowwhatiamdoing.cyclccazlorcustoms;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*     */
/*     */
/*     */ public class CustomMenus
        /*     */ implements InventoryHolder
        /*     */ {
    /*     */   private final Inventory inv;

    /*     */
    /*     */
    public CustomMenus() {
        /*  21 */
        this.inv = Bukkit.createInventory(this, 36, "Cazilor Custom Items");
        /*  22 */
        init();
        /*     */
    }

    /*     */
    /*     */
    /*     */
    private void init() {
        /*  27 */
        this.inv.setItem(0, ItemManager.shotgun);
        /*  28 */
        List<String> lore = new ArrayList<>();
        /*  29 */
        lore.add("§fRecipe for Blunderbuss");
        /*  30 */
        lore.add("");
        /*  31 */
        lore.add("§fTripwire Hook, Iron Ingot, Null");
        /*  32 */
        lore.add("§fGunpowder, Crossbow, Iron Ingot");
        /*  33 */
        lore.add("§fIron Ingot, Iron Ingot, Null");
        /*  34 */
        ItemStack item = createItem("§Blunder Recipe", Material.BOOK, lore);
        /*  35 */
        this.inv.setItem(9, item);
        /*  36 */
        this.inv.setItem(2, ItemManager.weak_throw_bomb);
        /*  37 */
        List<String> lore2 = new ArrayList<>();
        /*  38 */
        lore2.add("§fRecipe for Light Powder Bag");
        /*  39 */
        lore2.add("");
        /*  40 */
        lore2.add("§fNull, Gunpowder, Null");
        /*  41 */
        lore2.add("§fIron Ingot, Bottle, Iron Ingot");
        /*  42 */
        lore2.add("§fNull, Iron Ingot, Null");
        /*  43 */
        item = createItem("§fLight Powder Bag Recipe", Material.BOOK, lore2);
        /*  44 */
        this.inv.setItem(11, item);
        /*  45 */
        this.inv.setItem(4, ItemManager.throw_bomb);
        /*  46 */
        List<String> lore3 = new ArrayList<>();
        /*  47 */
        lore3.add("§fRecipe for Powder Bag");
        /*  48 */
        lore3.add("");
        /*  49 */
        lore3.add("§fNull, TNT, Null");
        /*  50 */
        lore3.add("§fIron Ingot, Bottle, Iron Ingot");
        /*  51 */
        lore3.add("§fNull, Iron Ingot, Null");
        /*  52 */
        item = createItem("§fPowder Bag Recipe", Material.BOOK, lore3);
        /*  53 */
        this.inv.setItem(13, item);
        /*  54 */
        this.inv.setItem(6, ItemManager.mermaid_charm);
        /*  55 */
        List<String> lore4 = new ArrayList<>();
        /*  56 */
        lore4.add("§fRecipe for Mermaid Charm");
        /*  57 */
        lore4.add("");
        /*  58 */
        lore4.add("§fNautilus Shell, Pufferfish, Nautilus Shell");
        /*  59 */
        lore4.add("§fNautilus Shell, Conduit, Nautilus Shell");
        /*  60 */
        lore4.add("§fNautilus Shell, Nautilus Shell, Nautilus Shell");
        /*  61 */
        item = createItem("§fMermaid Charm Recipe", Material.BOOK, lore4);
        /*  62 */
        this.inv.setItem(15, item);
        /*  63 */
        this.inv.setItem(8, ItemManager.fang_shield);
        /*  64 */
        List<String> lore5 = new ArrayList<>();
        /*  65 */
        lore5.add("§fRecipe for Shield of the Maw");
        /*  66 */
        lore5.add("");
        /*  67 */
        lore5.add("§fPointed Dripstone");
        /*  68 */
        lore5.add("§fBottle o' Experience");
        /*  69 */
        lore5.add("§fShield");
        /*  70 */
        item = createItem("§fShield of the Maw Recipe", Material.BOOK, lore5);
        /*  71 */
        this.inv.setItem(17, item);
        /*  72 */
        this.inv.setItem(19, ItemManager.one_rifle);
        /*  73 */
        List<String> lore6 = new ArrayList<>();
        /*  74 */
        lore6.add("§fRecipe for Tanegashima");
        /*  75 */
        lore6.add("");
        /*  76 */
        lore6.add("§fTo be Discovered");
        /*  77 */
        item = createItem("§fTanegashima Recipe", Material.BOOK, lore6);
        /*  78 */
        this.inv.setItem(28, item);
        /*  79 */
        this.inv.setItem(21, ItemManager.float_charm);
        /*  80 */
        List<String> lore7 = new ArrayList<>();
        /*  81 */
        lore7.add("§fRecipe for Charm of Levitation");
        /*  82 */
        lore7.add("");
        /*  83 */
        lore7.add("§fTo be Discovered");
        /*  84 */
        item = createItem("", Material.BOOK, lore7);
        /*  85 */
        this.inv.setItem(30, item);
        /*  86 */
        for (int i = 0; i < 22; i++) {
            /*  87 */
            item = createItem(" ", Material.GRAY_STAINED_GLASS_PANE, Collections.singletonList(""));
            /*  88 */
            this.inv.setItem(this.inv.firstEmpty(), item);
            /*     */
        }
        /*     */
    }

    /*     */
    /*     */
    private ItemStack createItem(String name, Material mat, List<String> lore) {
        /*  93 */
        ItemStack item = new ItemStack(mat, 1);
        /*  94 */
        ItemMeta meta = item.getItemMeta();
        /*  95 */
        meta.setDisplayName(name);
        /*  96 */
        meta.setLore(lore);
        /*  97 */
        item.setItemMeta(meta);
        /*  98 */
        return item;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    public Inventory getInventory() {
        /* 103 */
        return this.inv;
        /*     */
    }
    /*     */
}
