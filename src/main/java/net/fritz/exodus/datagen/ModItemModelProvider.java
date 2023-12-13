package net.fritz.exodus.datagen;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Exodus.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_ALUMINUM);
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.RAW_NICKEL);

        simpleItem(ModItems.ALUMINUM_INGOT);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.NICKEL_INGOT);

        simpleItem(ModItems.BRONZE_BLEND);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.STEEL_INGOT);

        simpleItem(ModItems.ALUMINUM_DUST);
        simpleItem(ModItems.TIN_DUST);
        simpleItem(ModItems.NICKEL_DUST);
        simpleItem(ModItems.IRON_DUST);
        simpleItem(ModItems.GOLD_DUST);
        simpleItem(ModItems.COPPER_DUST);

        simpleItem(ModItems.COPPER_GEAR);
        simpleItem(ModItems.IRON_GEAR);
        simpleItem(ModItems.GOLD_GEAR);
        simpleItem(ModItems.TIN_GEAR);

        simpleItem(ModItems.TREE_SAP);
        simpleItem(ModItems.RUBBER);
        simpleItem(ModItems.SILICON);
        simpleItem(ModItems.INDUSTRIAL_DIAMOND);
        simpleItem(ModItems.LITHIUM);
        simpleItem(ModItems.SOLAR_PANEL_ITEM);
        simpleItem(ModItems.FUSE);
        simpleItem(ModItems.REDSTONE_COIL);
        simpleItem(ModItems.CAPACITOR);

        simpleItem(ModItems.COPPER_WIRE);
        simpleItem(ModItems.GOLD_WIRE);
        simpleItem(ModItems.DIAMOND_WIRE);

        simpleItem(ModItems.BASIC_BATTERY);
        simpleItem(ModItems.MEDIUM_BATTERY);
        simpleItem(ModItems.ADVANCED_BATTERY);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Exodus.MODID, "item/" + item.getId().getPath()));
    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Exodus.MODID, "item/" + item.getId().getPath()));
    }

}
