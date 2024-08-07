package net.craterpirates.piececraft.datagen;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.item.ModItems;
import net.craterpirates.piececraft.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {


    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, PieceCraft.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.IS_DEVIL_FRUIT)
                .add(ModItems.SUBE_SUBE_NO_MI.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SEASTONE_HELMET.get(),
                        ModItems.SEASTONE_CHESTPLATE.get(),
                        ModItems.SEASTONE_LEGGINGS.get(),
                        ModItems.SEASTONE_BOOTS.get());
    }
}
