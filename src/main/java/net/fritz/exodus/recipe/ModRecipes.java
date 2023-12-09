package net.fritz.exodus.recipe;

import net.fritz.exodus.Exodus;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Exodus.MODID);

    public static final RegistryObject<RecipeSerializer<RedstoneFurnaceRecipe>> REDSTONE_FURNACE_SERIALIZER =
            SERIALIZERS.register("redstone_furnace", () -> RedstoneFurnaceRecipe.Serializer.INSTANCE);

    public static void register (IEventBus eventBus) { SERIALIZERS.register(eventBus); }
}
