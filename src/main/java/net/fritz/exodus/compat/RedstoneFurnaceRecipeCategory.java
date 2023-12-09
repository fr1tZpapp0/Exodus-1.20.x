package net.fritz.exodus.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.fritz.exodus.Exodus;
import net.fritz.exodus.block.ModBlocks;
import net.fritz.exodus.recipe.RedstoneFurnaceRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.crafting.IRecipeContainer;

public class RedstoneFurnaceRecipeCategory implements IRecipeCategory<RedstoneFurnaceRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(Exodus.MODID, "redstone_furnace");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Exodus.MODID, "textures/gui/redstone_furnace.png");

    private final IDrawable background;
    private final IDrawable icon;

    public static final RecipeType<RedstoneFurnaceRecipe> REDSTONE_FURNACE_TYPE = new RecipeType<>(UID, RedstoneFurnaceRecipe.class);


    public RedstoneFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.REDSTONE_FURNACE.get()));
    }

    @Override
    public RecipeType<RedstoneFurnaceRecipe> getRecipeType() {
        return REDSTONE_FURNACE_TYPE;
    }


    @Override
    public Component getTitle() {
        return Component.translatable("block.exodus.redstone_furnace");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RedstoneFurnaceRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT , 56, 17).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 116, 35).addItemStack(recipe.getResultItem(null));
    }
}
