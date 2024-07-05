package net.craterpirates.piececraft.util;

import net.craterpirates.piececraft.PieceCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> IS_DEVIL_FRUIT = tag("is_devil_fruit");

        private static TagKey<Item> tag (String name){
            return ItemTags.create(new ResourceLocation(PieceCraft.MOD_ID, name));
        }
    }

    public static class Blocks {

        public static final TagKey<Block> NEEDS_SEASTONE_TOOL = tag("needs_seastone_tool");


        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(PieceCraft.MOD_ID, name));
        }
    }

}
