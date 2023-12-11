package net.fritz.exodus.block.entity;

import net.fritz.exodus.item.ModItems;
import net.fritz.exodus.recipe.RedstoneFurnaceRecipe;
import net.fritz.exodus.screen.RedstoneFurnaceMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

public class RedstoneFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    private Map<Item, Integer> BURN_DURATION_MAP =
            Map.of(
                    Items.BLAZE_ROD, 600,
                    Items.COAL, 200
            );


    public RedstoneFurnaceBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.REDSTONE_FURNACE_BLOCK_ENTITY.get(), pPos, pBlockState, RedstoneFurnaceRecipe.Type.INSTANCE);
    }




    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.exodus.redstone_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory) {
        return new RedstoneFurnaceMenu(pContainerId, pInventory, this, dataAccess);
    }

    @Override
    protected int getBurnDuration(ItemStack pFuel) {
        return BURN_DURATION_MAP.getOrDefault(pFuel.getItem(), 0);
    }
}
