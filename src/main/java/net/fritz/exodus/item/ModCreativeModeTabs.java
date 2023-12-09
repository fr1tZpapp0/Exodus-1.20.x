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

                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModItems.BRONZE_BLEND.get());
                        output.accept(ModItems.BRONZE_INGOT.get());

                        output.accept(ModItems.RUBBER.get());
                        output.accept(ModItems.SILICON.get());
                        output.accept(ModItems.INDUSTRIAL_DIAMOND.get());
                        output.accept(ModItems.LITHIUM.get());

                        output.accept(ModItems.REDSTONE_COIL.get());
                        output.accept(ModItems.COPPER_WIRE.get());
                        output.accept(ModItems.GOLD_WIRE.get());
                        output.accept(ModItems.DIAMOND_WIRE.get());


                        output.accept(ModItems.BASIC_BATTERY.get());
                        output.accept(ModItems.MEDIUM_BATTERY.get());
                        output.accept(ModItems.ADVANCED_BATTERY.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> EXODUS_BLOCK_TAB = CREATIVE_MODE_TABS.register("exodus_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MACHINE_BLOCK.get()))
                    .title(Component.translatable("creativetab.exodus_block_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModBlocks.NICKEL_BLOCK.get());
                        output.accept(ModBlocks.MACHINE_BLOCK.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
