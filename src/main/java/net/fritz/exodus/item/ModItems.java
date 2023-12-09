package net.fritz.exodus.item;

import net.fritz.exodus.Exodus;
import net.minecraft.world.item.Item;
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





    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INDUSTRIAL_DIAMOND = ITEMS.register("industrial_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium",
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



    public static void register (IEventBus  eventBus) {
        ITEMS.register(eventBus);
    }
}
