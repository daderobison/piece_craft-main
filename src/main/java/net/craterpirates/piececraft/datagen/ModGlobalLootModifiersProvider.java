package net.craterpirates.piececraft.datagen;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.item.ModItems;
import net.craterpirates.piececraft.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, PieceCraft.MOD_ID);
    }

    @Override
    protected void start() {
        add("flame_dial_from_sand", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SAND).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build()}, ModItems.FLAME_DIAL.get()));
        add("seastone_ingot_from_stronghold", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.5f).build()}, ModItems.SEASTONE_INGOT.get()));
        add("seastone_ingot_from_stronghold", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.9f).build()}, ModItems.RAW_SEASTONE.get()));
        add("seastone_ingot_from_stronghold", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.9f).build()}, ModItems.SEASTONE_ROD.get()));

    }
}
