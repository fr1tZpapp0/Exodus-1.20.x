package net.fritz.exodus.datagen.loot;

import net.fritz.exodus.block.ModBlocks;
import net.fritz.exodus.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.NICKEL_BLOCK.get());
        this.dropSelf(ModBlocks.MACHINE_BLOCK.get());
        this.dropSelf(ModBlocks.SOLAR_PANEL.get());
        this.dropSelf(ModBlocks.REDSTONE_FURNACE.get());
        this.dropSelf(ModBlocks.COAL_GENERATOR.get());
        this.dropSelf(ModBlocks.COMPRESSOR.get());

        this.dropSelf(ModBlocks.DIAMOND_CABLE.get());
        this.dropSelf(ModBlocks.GOLD_CABLE.get());
        this.dropSelf(ModBlocks.COPPER_CABLE.get());




        this.add(ModBlocks.ALUMINUM_ORE.get(), block ->
                createOreDrop(ModBlocks.ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));

        this.add(ModBlocks.TIN_ORE.get(), block ->
                createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.NICKEL_ORE.get(), block ->
                createOreDrop(ModBlocks.NICKEL_ORE.get(), ModItems.RAW_NICKEL.get()));


        this.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), block ->
                createOreDrop(ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(), ModItems.RAW_ALUMINUM.get()));

        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(), block ->
                createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));

        this.add(ModBlocks.DEEPSLATE_NICKEL_ORE.get(), block ->
                createOreDrop(ModBlocks.DEEPSLATE_NICKEL_ORE.get(), ModItems.RAW_NICKEL.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
