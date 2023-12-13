package net.fritz.exodus.datagen;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.block.ModBlocks;
import net.fritz.exodus.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> COPPER_SMELT = List.of(
            ModItems.COPPER_DUST.get()
    );

    private static final List<ItemLike> STEEL_SMELT = List.of(
            Items.IRON_INGOT
    );

    private static final List<ItemLike> BRONZE_SMELT = List.of(
            ModItems.BRONZE_BLEND.get()
    );

    private static final List<ItemLike> SILICON_SMELT = List.of(
            Items.QUARTZ
    );

    private static final List<ItemLike> IRON_SMELT = List.of(
            ModItems.IRON_DUST.get()
    );

    private static final List<ItemLike> GOLD_SMELT = List.of(
            ModItems.GOLD_DUST.get()
    );

    public static final List<ItemLike> RUBBER_SMELT = List.of(
            ModItems.TREE_SAP.get(),
            Items.SLIME_BALL
    );


    private static final List<ItemLike> TIN_SMELT = List.of(
            ModItems.RAW_TIN.get(),
            ModItems.TIN_DUST.get(),
            ModBlocks.TIN_ORE.get(),
            ModBlocks.DEEPSLATE_TIN_ORE.get()
    );
    private static final List<ItemLike> NICKEL_SMELT = List.of(
            ModItems.RAW_NICKEL.get(),
            ModItems.NICKEL_DUST.get(),
            ModBlocks.NICKEL_ORE.get(),
            ModBlocks.DEEPSLATE_NICKEL_ORE.get()
    );
    private static final List<ItemLike> ALUMINUM_SMELT = List.of(
            ModItems.RAW_ALUMINUM.get(),
            ModItems.ALUMINUM_DUST.get(),
            ModBlocks.ALUMINUM_ORE.get(),
            ModBlocks.DEEPSLATE_ALUMINUM_ORE.get()
    );

    private static final List<ItemLike> LITHIUM_SMELT = List.of(
            ModBlocks.LITHIUM_ORE.get(),
            ModBlocks.DEEPSLATE_LITHIUM_ORE.get()
    );

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REDSTONE_FURNACE.get())
                .pattern("#Y#")
                .pattern("CXC")
                .pattern("IFI")
                .define('#', ModItems.REDSTONE_COIL.get())
                .define('Y', Blocks.REDSTONE_BLOCK)
                .define('C', ModItems.IRON_GEAR.get())
                .define('X', ModBlocks.MACHINE_BLOCK.get())
                .define('I', Items.IRON_INGOT)
                .define('F', ModItems.FUSE.get())
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COAL_GENERATOR.get())
                .pattern("#IW")
                .pattern("GXG")
                .pattern("CFC")
                .define('#', ModItems.REDSTONE_COIL.get())
                .define('W', ModItems.COPPER_WIRE.get())
                .define('I', Items.IRON_INGOT)
                .define('G', ModItems.IRON_GEAR.get())
                .define('X', ModBlocks.MACHINE_BLOCK.get())
                .define('C', Items.COAL)
                .define('F', ModItems.FUSE.get())
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NICKEL_BLOCK.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ModItems.NICKEL_INGOT.get())
                .unlockedBy("has_nickel_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.NICKEL_INGOT.get()).build())).save(pWriter);


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
                .pattern("BBB")
                .pattern("RFR")
                .pattern("BBB")
                .define('B', ModItems.BRONZE_INGOT.get())
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('F', ModItems.FUSE.get())
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
                .pattern("GPG")
                .pattern("RMR")
                .pattern("BPB")
                .define('B', Blocks.IRON_BLOCK)
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('M', ModBlocks.MACHINE_BLOCK.get())
                .define('P', Blocks.PISTON)
                .define('G', ModItems.IRON_GEAR.get())
                .unlockedBy("has_machine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MACHINE_BLOCK.get()).build())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PULVERIZER.get())
                .pattern("GRG")
                .pattern("TMT")
                .pattern("BWB")
                .define('B', Blocks.IRON_BLOCK)
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('M', ModBlocks.MACHINE_BLOCK.get())
                .define('T', ModItems.TIN_GEAR.get())
                .define('G', ModItems.GOLD_GEAR.get())
                .define('W', ModItems.GOLD_WIRE.get())
                .unlockedBy("has_machine_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.MACHINE_BLOCK.get()).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_GEAR.get())
                        .pattern(" C ")
                        .pattern("CNC")
                        .pattern(" C ")
                        .define('C', Items.COPPER_INGOT)
                        .define('N', Items.IRON_NUGGET)
                        .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                            .of(Items.COPPER_INGOT).build())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_GEAR.get())
                .pattern(" I ")
                .pattern("INI")
                .pattern(" I ")
                .define('I', Items.IRON_INGOT)
                .define('N', Items.IRON_NUGGET)
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_GEAR.get())
                .pattern(" G ")
                .pattern("GNG")
                .pattern(" G ")
                .define('G', Items.GOLD_INGOT)
                .define('N', Items.IRON_NUGGET)
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TIN_GEAR.get())
                .pattern(" T ")
                .pattern("TNT")
                .pattern(" T ")
                .define('T', ModItems.TIN_INGOT.get())
                .define('N', Items.IRON_NUGGET)
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BASIC_BATTERY.get())
                .pattern("RAR")
                .pattern("TLT")
                .pattern("TTT")
                .define('L', ModItems.LITHIUM.get())
                .define('T', ModItems.TIN_INGOT.get())
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('A', ModItems.ALUMINUM_INGOT.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEDIUM_BATTERY.get())
                .pattern("RDR")
                .pattern("GBG")
                .pattern("ALA")
                .define('L', ModItems.LITHIUM.get())
                .define('B', ModItems.BASIC_BATTERY.get())
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('G', Items.GOLD_INGOT)
                .define('D', ModItems.INDUSTRIAL_DIAMOND.get())
                .define('A', ModItems.ALUMINUM_INGOT.get())
                .unlockedBy("has_industrial_diamond_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INDUSTRIAL_DIAMOND.get()).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ADVANCED_BATTERY.get())
                .pattern("RNR")
                .pattern("AMA")
                .pattern("LLL")
                .define('L', ModItems.LITHIUM.get())
                .define('M', ModItems.MEDIUM_BATTERY.get())
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('A', ModItems.ALUMINUM_INGOT.get())
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy("has_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_INGOT).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BASIC_ENERGY_CELL.get())
                .pattern("RCR")
                .pattern("MBM")
                .pattern("ACA")
                .define('A', ModItems.ALUMINUM_INGOT.get())
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('M', ModBlocks.MACHINE_BLOCK.get())
                .define('C', ModItems.CAPACITOR.get())
                .define('B', ModItems.BASIC_BATTERY.get())
                .unlockedBy("has_capacitor", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CAPACITOR.get()).build())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MEDIUM_ENERGY_CELL.get())
                .pattern("RCR")
                .pattern("MBM")
                .pattern("ACA")
                .define('A', ModItems.INDUSTRIAL_DIAMOND.get())
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('M', ModBlocks.MACHINE_BLOCK.get())
                .define('C', ModItems.CAPACITOR.get())
                .define('B', ModItems.MEDIUM_BATTERY.get())
                .unlockedBy("has_capacitor", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CAPACITOR.get()).build())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ADVANCED_ENERGY_CELL.get())
                .pattern("RCR")
                .pattern("MBM")
                .pattern("ACA")
                .define('A', Items.NETHERITE_INGOT)
                .define('R', ModItems.REDSTONE_COIL.get())
                .define('M', ModBlocks.MACHINE_BLOCK.get())
                .define('C', ModItems.CAPACITOR.get())
                .define('B', ModItems.ADVANCED_BATTERY.get())
                .unlockedBy("has_capacitor", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.CAPACITOR.get()).build())).save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUSE.get())
                .pattern("IRI")
                .pattern("PLP")
                .pattern("IRI")
                .define('I', ModItems.TIN_INGOT.get())
                .define('R', Items.REDSTONE)
                .define('P', Items.GLASS_PANE)
                .define('L', ModItems.LITHIUM.get())
                .unlockedBy("has_lithium", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHIUM.get()).build())).save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_BLEND.get())
                .requires(ModItems.TIN_INGOT.get()).requires(Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build())).save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COPPER_CABLE.get())
                .requires(ModItems.COPPER_WIRE.get()).requires(ModItems.RUBBER.get())
                .unlockedBy("has_copper_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COPPER_INGOT).build())).save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GOLD_CABLE.get())
                .requires(ModItems.GOLD_WIRE.get()).requires(ModItems.RUBBER.get())
                .unlockedBy("has_gold_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DIAMOND_CABLE.get())
                .requires(ModItems.DIAMOND_WIRE.get()).requires(ModItems.RUBBER.get())
                .requires(ModItems.SILICON.get())
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build())).save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAPACITOR.get())
                .requires(ModItems.TIN_INGOT.get()).requires(ModItems.RUBBER.get())
                .requires(ModItems.SILICON.get()).requires(Items.REDSTONE)
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build())).save(pWriter);


        oreSmelting(pWriter, TIN_SMELT, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200, "tin");
        oreSmelting(pWriter, ALUMINUM_SMELT, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 0.25f, 200, "aluminum");
        oreSmelting(pWriter, NICKEL_SMELT, RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.25f, 200, "nickel");
        oreSmelting(pWriter, LITHIUM_SMELT, RecipeCategory.MISC, ModItems.LITHIUM.get(), 0.25f, 200, "lithium");

        oreSmelting(pWriter, SILICON_SMELT, RecipeCategory.MISC, ModItems.SILICON.get(), 0.25f, 200, "silicon");
        oreSmelting(pWriter, RUBBER_SMELT, RecipeCategory.MISC, ModItems.RUBBER.get(), 0.25f, 200, "rubber");
        oreSmelting(pWriter, STEEL_SMELT, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 200, "steel");


        oreSmelting(pWriter, COPPER_SMELT, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "copper");
        oreSmelting(pWriter, IRON_SMELT, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "iron");
        oreSmelting(pWriter, GOLD_SMELT, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "gold");


        oreBlasting(pWriter, COPPER_SMELT, RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "copper");
        oreBlasting(pWriter, IRON_SMELT, RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "iron");
        oreBlasting(pWriter, GOLD_SMELT, RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "gold");


        oreBlasting(pWriter, TIN_SMELT, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 100, "tin");
        oreBlasting(pWriter, ALUMINUM_SMELT, RecipeCategory.MISC, ModItems.ALUMINUM_INGOT.get(), 0.25f, 100, "aluminum");
        oreBlasting(pWriter, NICKEL_SMELT, RecipeCategory.MISC, ModItems.NICKEL_INGOT.get(), 0.25f, 100, "nickel");
        oreBlasting(pWriter, LITHIUM_SMELT, RecipeCategory.MISC, ModItems.LITHIUM.get(), 0.25f, 100, "lithium");
        oreBlasting(pWriter, BRONZE_SMELT, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.25f, 100, "bronze");
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience,
                pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience,
                pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience,
                                     int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Exodus.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }



}
