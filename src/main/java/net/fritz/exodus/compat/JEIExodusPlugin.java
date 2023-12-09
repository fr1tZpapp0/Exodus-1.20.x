package net.fritz.exodus.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.fritz.exodus.Exodus;
import net.fritz.exodus.recipe.RedstoneFurnaceRecipe;
import net.fritz.exodus.screen.RedstoneFurnaceScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIExodusPlugin implements IModPlugin {


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Exodus.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new RedstoneFurnaceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<RedstoneFurnaceRecipe> redstoneFurnaceRecipeList = recipeManager.getAllRecipesFor(RedstoneFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(RedstoneFurnaceRecipeCategory.REDSTONE_FURNACE_TYPE, redstoneFurnaceRecipeList);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(RedstoneFurnaceScreen.class, 60, 30, 20, 30, RedstoneFurnaceRecipeCategory.REDSTONE_FURNACE_TYPE);
    }
}
