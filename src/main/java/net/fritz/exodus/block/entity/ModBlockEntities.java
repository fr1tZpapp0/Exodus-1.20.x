package net.fritz.exodus.block.entity;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITY_TYPES, Exodus.MODID);


    public static final RegistryObject<BlockEntityType<RedstoneFurnaceBlockEntity>> REDSTONE_FURNACE_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "redstone_furnace_block_entity",
            () -> BlockEntityType.Builder.of(RedstoneFurnaceBlockEntity::new, ModBlocks.REDSTONE_FURNACE.get()).build(null));



    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
