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


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_WIRE.get())
                        .pattern("III")
                        .define('I', Items.COPPER_INGOT)
                        .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                                .of(Items.COPPER_INGOT).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_WIRE.get())
                .pattern("III")
                .define('I', Items.GOLD_INGOT)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build())).save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_WIRE.get())
                .pattern("III")
                .define('I', Items.DIAMOND)
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REDSTONE_COIL.get())
                .pattern("  I")
                .pattern(" R ")
                .pattern("I  ")
                .define('R', Items.REDSTONE)
                .define('I', Items.GOLD_INGOT)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOLAR_PANEL_ITEM.get())
                .pattern("LGL")
                .pattern("LSL")
                .pattern("LRL")
                .define('R', Items.REDSTONE)
                .define('L', Items.LAPIS_LAZULI)
                .define('G', Blocks.GLASS_PANE)
                .define('S', ModItems.SILICON.get())
                .unlockedBy("has_lapis_lazuli", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LAPIS_LAZULI).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MACHINE_BLOCK.get())
                .pattern("III")
                .pattern("R R")
                .pattern("III")
                .define('I', Blocks.IRON_BLOCK)
                .define('R', Blocks.REDSTONE_BLOCK)
                .unlockedBy("has_redstone_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.REDSTONE_BLOCK).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOLAR_PANEL.get())
                .pattern("PPP")
                .pattern("MRM")
                .pattern("III")
                .define('I', Items.IRON_INGOT)
                .define('R', Blocks.REDSTONE_BLOCK)
                .define('M', ModBlocks.MACHINE_BLOCK.get())
                .define('P', ModItems.SOLAR_PANEL_ITEM.get())
                .unlockedBy("has_machine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MACHINE_BLOCK.get()).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COMPRESSOR.get())
                .pattern("BBB")
                .pattern("MRM")
                .pattern("BBB")
                .define('B', Blocks.IRON_BLOCK)
                .define('R', Blocks.REDSTONE_BLOCK)
                .define('M', ModBlocks.MACHINE_BLOCK.get())
                .unlockedBy("has_machine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MACHINE_BLOCK.get()).build())).save(pWriter);





        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_BLEND.get())
                .requires(ModItems.TIN_INGOT.get()).requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build())).save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SILICON.get())
                .requires(ModItems.LITHIUM.get()).requires(Items.COAL)
                .unlockedBy("has_lithium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHIUM.get()).build())).save(pWriter);

    }
}
