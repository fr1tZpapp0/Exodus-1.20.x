package net.fritz.exodus.screen;

import net.fritz.exodus.recipe.RedstoneFurnaceRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;

public class RedstoneFurnaceMenu extends AbstractFurnaceMenu {
    protected RedstoneFurnaceMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public RedstoneFurnaceMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(ModMenuTypes.REDSTONE_FURNACE_MENU.get(), RedstoneFurnaceRecipe.Type.INSTANCE, RecipeBookType.FURNACE,
                pContainerId, pPlayerInventory, container, data);
    }

    public RedstoneFurnaceMenu(int pContainerId, Inventory pPlayerInventory) {
        super(ModMenuTypes.REDSTONE_FURNACE_MENU.get(), RedstoneFurnaceRecipe.Type.INSTANCE,
                RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }


}
