package net.fritz.exodus.datagen;

import net.fritz.exodus.block.ModBlocks;
import net.fritz.exodus.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> TIN_SMELT = List.of();
    private static final List<ItemLike> NICKEL_SMELT = List.of();
    private static final List<ItemLike> ALUMINUM_SMELT = List.of();

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REDSTONE_FURNACE.get())
                .pattern("#Y#")
                .pattern("CXC")
                .pattern("III")
                .define('#', ModItems.REDSTONE_COIL.get())
                .define('Y', Blocks.REDSTONE_BLOCK)
                .define('C', ModItems.COPPER_WIRE.get())
                .define('X', ModBlocks.MACHINE_BLOCK.get())
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build())).save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_BLEND.get())
                .requires(ModItems.TIN_INGOT.get()).requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build())).save(pWriter);

    }
}
