package net.fritz.exodus.datagen;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Exodus.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.MACHINE_BLOCK);
        blockWithItem(ModBlocks.COPPER_CABLE);
        blockWithItem(ModBlocks.GOLD_CABLE);
        blockWithItem(ModBlocks.DIAMOND_CABLE);
        blockWithItem(ModBlocks.NICKEL_BLOCK);

        blockWithItem(ModBlocks.BASIC_ENERGY_CELL);
        blockWithItem(ModBlocks.MEDIUM_ENERGY_CELL);
        blockWithItem(ModBlocks.ADVANCED_ENERGY_CELL);

        blockWithItem(ModBlocks.ALUMINUM_ORE);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.NICKEL_ORE);
        blockWithItem(ModBlocks.LITHIUM_ORE);

        blockWithItem(ModBlocks.DEEPSLATE_ALUMINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_NICKEL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_LITHIUM_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }




}
