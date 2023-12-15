package net.fritz.exodus.item;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Exodus.MODID);

    public static final RegistryObject<CreativeModeTab> EXODUS_TAB = CREATIVE_MODE_TABS.register("exodus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBBER.get()))
                    .title(Component.translatable("creativetab.exodus_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.RAW_NICKEL.get());
                        output.accept(ModItems.NICKEL_INGOT.get());

                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.TIN_INGOT.get());

                        output.accept(ModItems.RAW_ALUMINUM.get());
                        output.accept(ModItems.ALUMINUM_INGOT.get());

                        output.accept(ModItems.RAW_URANIUM.get());
                        output.accept(ModItems.URANIUM.get());

                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.BRONZE_BLEND.get());
                        output.accept(ModItems.BRONZE_INGOT.get());

                        output.accept(ModItems.RUBBER.get());
                        output.accept(ModItems.TREE_SAP.get());
                        output.accept(ModItems.SILICON.get());
                        output.accept(ModItems.INDUSTRIAL_DIAMOND.get());
                        output.accept(ModItems.LITHIUM.get());
                        output.accept(ModItems.STEEL_PLATE.get());

                        output.accept(ModItems.ALUMINUM_DUST.get());
                        output.accept(ModItems.TIN_DUST.get());
                        output.accept(ModItems.NICKEL_DUST.get());
                        output.accept(ModItems.IRON_DUST.get());
                        output.accept(ModItems.GOLD_DUST.get());
                        output.accept(ModItems.COPPER_DUST.get());
                        output.accept(ModItems.URANIUM_DUST.get());

                        output.accept(ModItems.REDSTONE_COIL.get());
                        output.accept(ModItems.COPPER_WIRE.get());
                        output.accept(ModItems.GOLD_WIRE.get());
                        output.accept(ModItems.DIAMOND_WIRE.get());
                        output.accept(ModItems.SOLAR_PANEL_ITEM.get());
                        output.accept(ModItems.FUSE.get());
                        output.accept(ModItems.CAPACITOR.get());

                        output.accept(ModItems.COPPER_GEAR.get());
                        output.accept(ModItems.IRON_GEAR.get());
                        output.accept(ModItems.GOLD_GEAR.get());
                        output.accept(ModItems.TIN_GEAR.get());


                        output.accept(ModItems.BASIC_BATTERY.get());
                        output.accept(ModItems.MEDIUM_BATTERY.get());
                        output.accept(ModItems.ADVANCED_BATTERY.get());


                        output.accept(ModItems.STEEL_SWORD.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.STEEL_SHOVEL.get());
                        output.accept(ModItems.STEEL_HOE.get());
                        output.accept(ModItems.STEEL_PAXEL.get());
                        output.accept(ModItems.STEEL_HAMMER.get());

                        output.accept(ModItems.IRON_PAXEL.get());
                        output.accept(ModItems.GOLD_PAXEL.get());
                        output.accept(ModItems.DIAMOND_PAXEL.get());
                        output.accept(ModItems.NETHERITE_PAXEL.get());


                    }).build());

    public static final RegistryObject<CreativeModeTab> EXODUS_BLOCK_TAB = CREATIVE_MODE_TABS.register("exodus_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LITHIUM_ORE.get()))
                    .title(Component.translatable("creativetab.exodus_block_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModBlocks.NICKEL_BLOCK.get());
                        output.accept(ModBlocks.NICKEL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_NICKEL_ORE.get());

                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());

                        output.accept(ModBlocks.ALUMINUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get());

                        output.accept(ModBlocks.LITHIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_LITHIUM_ORE.get());

                        output.accept(ModBlocks.URANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> EXODUS_MACHINE_TAB = CREATIVE_MODE_TABS.register("exodus_machine_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.REDSTONE_FURNACE.get()))
                    .title(Component.translatable("creativetab.exodus_machine_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModBlocks.MACHINE_BLOCK.get());
                        output.accept(ModBlocks.SOLAR_PANEL.get());
                        output.accept(ModBlocks.REDSTONE_FURNACE.get());
                        output.accept(ModBlocks.COAL_GENERATOR.get());
                        output.accept(ModBlocks.COMPRESSOR.get());
                        output.accept(ModBlocks.PULVERIZER.get());

                        output.accept(ModBlocks.COPPER_CABLE.get());
                        output.accept(ModBlocks.GOLD_CABLE.get());
                        output.accept(ModBlocks.DIAMOND_CABLE.get());

                        output.accept(ModBlocks.BASIC_ENERGY_CELL.get());
                        output.accept(ModBlocks.MEDIUM_ENERGY_CELL.get());
                        output.accept(ModBlocks.ADVANCED_ENERGY_CELL.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
