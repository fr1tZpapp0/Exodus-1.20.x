package net.fritz.exodus.item;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.item.custom.HammerItem;
import net.fritz.exodus.item.custom.PaxelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Exodus.MODID);

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_BLEND = ITEMS.register("bronze_blend",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_GEAR = ITEMS.register("gold_gear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FUSE = ITEMS.register("fuse",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate",
            () -> new Item(new Item.Properties()));




    public static final RegistryObject<Item> TREE_SAP = ITEMS.register("tree_sap",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INDUSTRIAL_DIAMOND = ITEMS.register("industrial_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOLAR_PANEL_ITEM = ITEMS.register("solar_panel_item",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> CAPACITOR = ITEMS.register("capacitor",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_WIRE = ITEMS.register("gold_wire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_WIRE = ITEMS.register("diamond_wire",
            () -> new Item(new Item.Properties()));



    public static final RegistryObject<Item> BASIC_BATTERY = ITEMS.register("basic_battery",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MEDIUM_BATTERY = ITEMS.register("medium_battery",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> ADVANCED_BATTERY = ITEMS.register("advanced_battery",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> REDSTONE_COIL = ITEMS.register("redstone_coil",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 2, 3, new Item.Properties().durability(556)));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 1, 2, new Item.Properties().durability(556)));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 1, 2, new Item.Properties().durability(556)));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 2, 1, new Item.Properties().durability(556)));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 1, 2, new Item.Properties().durability(556)));

    public static final RegistryObject<Item> STEEL_PAXEL = ITEMS.register("steel_paxel",
            () -> new PaxelItem(ModToolTiers.STEEL, 1, 2, new Item.Properties().durability(556)));

    public static final RegistryObject<Item> STEEL_HAMMER = ITEMS.register("steel_hammer",
            () -> new HammerItem(ModToolTiers.STEEL, 2, 1, new Item.Properties().durability(556)));



    public static final RegistryObject<Item> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new PaxelItem(Tiers.IRON, 1, 2, new Item.Properties().durability(250)));

    public static final RegistryObject<Item> GOLD_PAXEL = ITEMS.register("gold_paxel",
            () -> new PaxelItem(Tiers.GOLD, 1, 2, new Item.Properties().durability(32)));

    public static final RegistryObject<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, 1, 2, new Item.Properties().durability(1561)));

    public static final RegistryObject<Item> NETHERITE_PAXEL = ITEMS.register("netherite_paxel",
            () -> new PaxelItem(Tiers.NETHERITE, 1, 2, new Item.Properties().durability(2031)));







    public static void register (IEventBus  eventBus) {
        ITEMS.register(eventBus);
    }
}
