package net.craterpirates.piececraft.datagen;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PieceCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SEASTONE_ORE);
        blockWithItem(ModBlocks.SEASTONE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SEASTONE_ORE);

        stairsBlock((StairBlock) ModBlocks.SEASTONE_STAIRS.get(), blockTexture(ModBlocks.SEASTONE_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.SEASTONE_SLAB.get(), blockTexture(ModBlocks.SEASTONE_BLOCK.get()), blockTexture(ModBlocks.SEASTONE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.SEASTONE_BUTTON.get(), blockTexture(ModBlocks.SEASTONE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.SEASTONE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.SEASTONE_BLOCK.get()));

        fenceBlock((FenceBlock) ModBlocks.SEASTONE_FENCE.get(), blockTexture(ModBlocks.SEASTONE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.SEASTONE_FENCE_GATE.get(), blockTexture(ModBlocks.SEASTONE_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.SEASTONE_WALL.get(), blockTexture(ModBlocks.SEASTONE_BLOCK.get()));

        doorBlockWithRenderType((DoorBlock) ModBlocks.SEASTONE_DOOR.get(), modLoc("block/seastone_door_bottom"), modLoc("block/seastone_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.SEASTONE_TRAPDOOR.get(), modLoc("block/seastone_trapdoor"), true, "cutout");


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
