package net.craterpirates.piececraft.datagen.loot;

import net.craterpirates.piececraft.block.ModBlocks;
import net.craterpirates.piececraft.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.SEASTONE_BLOCK.get());

        this.add(ModBlocks.SEASTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SEASTONE_ORE.get(), ModItems.RAW_SEASTONE.get()));

        this.add(ModBlocks.DEEPSLATE_SEASTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SEASTONE_ORE.get(), ModItems.RAW_SEASTONE.get()));

        this.dropSelf(ModBlocks.SEASTONE_STAIRS.get());
        this.dropSelf(ModBlocks.SEASTONE_BUTTON.get());
        this.dropSelf(ModBlocks.SEASTONE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SEASTONE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SEASTONE_FENCE.get());
        this.dropSelf(ModBlocks.SEASTONE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SEASTONE_WALL.get());

        this.add(ModBlocks.SEASTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SEASTONE_SLAB.get()));
        this.add(ModBlocks.SEASTONE_DOOR.get(),
                block -> createDoorTable(ModBlocks.SEASTONE_DOOR.get()));


    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                    .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
