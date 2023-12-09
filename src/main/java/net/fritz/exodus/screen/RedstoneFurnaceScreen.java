package net.fritz.exodus.screen;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.recipe.RedstoneFurnaceRecipeBookComponent;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class RedstoneFurnaceScreen extends AbstractFurnaceScreen<RedstoneFurnaceMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Exodus.MODID, "textures/gui/redstone_furnace.png");

    public RedstoneFurnaceScreen(RedstoneFurnaceMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new RedstoneFurnaceRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
