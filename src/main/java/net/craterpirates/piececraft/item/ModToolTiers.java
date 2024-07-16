package net.craterpirates.piececraft.item;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SEASTONE = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1800, 6f, 5f, 45,
                    ModTags.Blocks.NEEDS_SEASTONE_TOOL, () -> Ingredient.of(ModItems.SEASTONE_INGOT.get())),
            new ResourceLocation(PieceCraft.MOD_ID, "seastone"), List.of(Tiers.DIAMOND), List.of());
}
