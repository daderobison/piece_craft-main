package net.craterpirates.piececraft.datagen;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.block.ModBlocks;
import net.craterpirates.piececraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PieceCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SEASTONE_ORE.get(), ModBlocks.SEASTONE_BLOCK.get(), ModBlocks.DEEPSLATE_SEASTONE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.SEASTONE_ORE.get(), ModBlocks.DEEPSLATE_SEASTONE_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_SEASTONE_TOOL)
                .add(ModBlocks.SEASTONE_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SEASTONE_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SEASTONE_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SEASTONE_WALL.get());
    }
}
