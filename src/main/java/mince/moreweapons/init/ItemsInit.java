package mince.moreweapons.init;

import mince.moreweapons.MoreWeapons;
import mince.moreweapons.items.MoreWeaponsHoe;
import mince.moreweapons.toolmaterials.SteelArmorMaterial;
import mince.moreweapons.toolmaterials.SteelToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;

public class ItemsInit {
    public static final Item STEEL_INGOT = new Item(new FabricItemSettings());

    public static final SteelToolMaterial STEEL_TM = new SteelToolMaterial();
    public static final SteelArmorMaterial STEEL_AM = new SteelArmorMaterial();

    public static ToolItem STEEL_PICKAXE = new PickaxeItem(STEEL_TM,1, 2f, new Item.Settings());
    public static ToolItem STEEL_AXE = new AxeItem(STEEL_TM,1, 2f, new Item.Settings());
    public static ToolItem STEEL_SHOVEL = new ShovelItem(STEEL_TM,1, 2f, new Item.Settings());
    public static ToolItem STEEL_HOE = new MoreWeaponsHoe(STEEL_TM,1, 2f, new Item.Settings());

    public static final Item STEEL_HELMET = new ArmorItem(STEEL_AM, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item STEEL_CHESTPLATE = new ArmorItem(STEEL_AM, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item STEEL_LEGGINGS = new ArmorItem(STEEL_AM, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item STEEL_BOOTS = new ArmorItem(STEEL_AM, EquipmentSlot.FEET, new Item.Settings());

    public static final SwordItem STEEL_SWORD = new SwordItem(STEEL_TM,7, -2.4f, new Item.Settings());

    public static void weaponsInit() {
        registerItem("steel_sword", STEEL_SWORD);
    }


    public static void itemsInit() {
        registerItem("steel_ingot", STEEL_INGOT);
    }

    public static void toolsInit() {
        registerItem("steel_pickaxe", STEEL_PICKAXE);
        registerItem("steel_axe", STEEL_AXE);
        registerItem("steel_shovel", STEEL_SHOVEL);
        registerItem("steel_hoe", STEEL_HOE);
    }

    public static void armorsInit() {
        registerItem("steel_helmet", STEEL_HELMET);
        registerItem("steel_chestplate", STEEL_CHESTPLATE);
        registerItem("steel_leggings", STEEL_LEGGINGS);
        registerItem("steel_boots", STEEL_BOOTS);
    }

    private static void registerItem(String path, Item item) {
        Registry.register(Registry.ITEM, MoreWeapons.ID(path), item);
    }
}
