package net.fritz.exodus.datagen;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Exodus.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.NICKEL_ORE.get(),
                        ModBlocks.LITHIUM_ORE.get(),

                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_LITHIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get()
                        );
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        ModBlocks.ALUMINUM_ORE.get(),
                        ModBlocks.TIN_ORE.get(),
                        ModBlocks.NICKEL_ORE.get(),
                        ModBlocks.LITHIUM_ORE.get(),

                        ModBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
                        ModBlocks.DEEPSLATE_LITHIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_NICKEL_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get()
                );

    }


    @Override
    public String getName() {
        return "BLOCK TAGS";
    }
}
