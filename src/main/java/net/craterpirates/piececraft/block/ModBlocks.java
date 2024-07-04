package net.craterpirates.piececraft.block;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PieceCraft.MOD_ID);

    //New Blocks

    public static final RegistryObject<Block> SEASTONE_ORE = registerBlock("seastone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(4,8)));

    public static final RegistryObject<Block> DEEPSLATE_SEASTONE_ORE = registerBlock("deepslate_seastone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(10,14)));

    public static final RegistryObject<Block> SEASTONE_BLOCK = registerBlock("seastone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SEASTONE_STAIRS = registerBlock("seastone_stairs",
            () -> new StairBlock(() -> ModBlocks.SEASTONE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SEASTONE_SLAB = registerBlock("seastone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.STONE)));


    public static final RegistryObject<Block> SEASTONE_BUTTON = registerBlock("seastone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.STONE),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> SEASTONE_PRESSURE_PLATE = registerBlock("seastone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.STONE),
                    BlockSetType.IRON));


    public static final RegistryObject<Block> SEASTONE_FENCE = registerBlock("seastone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SEASTONE_FENCE_GATE = registerBlock("seastone_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.STONE), SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_DOOR_CLOSE));
    public static final RegistryObject<Block> SEASTONE_WALL = registerBlock("seastone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).sound(SoundType.STONE)));


    public static final RegistryObject<Block> SEASTONE_DOOR = registerBlock("seastone_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> SEASTONE_TRAPDOOR = registerBlock("seastone_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_TRAPDOOR),
                    BlockSetType.IRON));





    //Registers blocks and block items
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    //Registers Block Item with associated Block in BLOCKS list
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
