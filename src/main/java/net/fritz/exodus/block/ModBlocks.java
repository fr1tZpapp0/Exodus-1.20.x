package net.fritz.exodus.block;

import net.fritz.exodus.Exodus;
import net.fritz.exodus.block.custom.*;
import net.fritz.exodus.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Exodus.MODID);

    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> MACHINE_BLOCK = registerBlock("machine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));




    public static final RegistryObject<Block> BASIC_ENERGY_CELL = registerBlock("basic_energy_cell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> MEDIUM_ENERGY_CELL = registerBlock("medium_energy_cell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ADVANCED_ENERGY_CELL = registerBlock("advanced_energy_cell",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));




    public static final RegistryObject<Block> SOLAR_PANEL = registerBlock("solar_panel",
            () -> new SolarPanel(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> REDSTONE_FURNACE = registerBlock("redstone_furnace",
            () -> new RedstoneFurnace(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> COAL_GENERATOR = registerBlock("coal_generator",
            () -> new CoalGenerator(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> COMPRESSOR = registerBlock("compressor",
            () -> new Compressor(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> PULVERIZER = registerBlock("pulverizer",
            () -> new PulverizerBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));




    public static final RegistryObject<Block> COPPER_CABLE = registerBlock("copper_cable",
            () -> new CopperCable(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> GOLD_CABLE = registerBlock("gold_cable",
            () -> new GoldCable(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> DIAMOND_CABLE = registerBlock("diamond_cable",
            () -> new DiamondCable(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));



    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));



    public static final RegistryObject<Block> LITHIUM_ORE = registerBlock("lithium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> DEEPSLATE_LITHIUM_ORE = registerBlock("deepslate_lithium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));


    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));



    public static final RegistryObject<Block> NICKEL_ORE = registerBlock("nickel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));


    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));

    public static final RegistryObject<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 5)));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }



    private static <T extends Block>RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
