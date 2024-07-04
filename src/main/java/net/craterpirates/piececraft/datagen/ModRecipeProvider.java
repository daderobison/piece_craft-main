package net.craterpirates.piececraft.datagen;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.block.ModBlocks;
import net.craterpirates.piececraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> SEASTONE_SMELTABLES = List.of(ModItems.RAW_SEASTONE.get(),
            ModBlocks.SEASTONE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, SEASTONE_SMELTABLES, RecipeCategory.MISC, ModItems.SEASTONE_INGOT.get(), 0.5f, 100, "seastone");
        oreSmelting(pWriter, SEASTONE_SMELTABLES, RecipeCategory.MISC, ModItems.SEASTONE_INGOT.get(), 0.5f, 100, "seastone");

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_BLOCK.get())
                .pattern("III")
                .pattern("III")
                .pattern("III")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_STAIRS.get())
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SEASTONE_ROD.get(), 2)
                .pattern("I")
                .pattern("I")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.SEASTONE_DOOR.get(), 3)
                .pattern("II")
                .pattern("II")
                .pattern("II")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_WALL.get(), 3)
                .pattern("II")
                .pattern("II")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_SLAB.get(), 6)
                .pattern("III")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.SEASTONE_TRAPDOOR.get(), 3)
                .pattern("III")
                .pattern("III")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_FENCE.get(), 3)
                .pattern("IRI")
                .pattern("IRI")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .define('R', ModItems.SEASTONE_ROD.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_ROD.get()), has(ModItems.SEASTONE_ROD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_FENCE_GATE.get(), 3)
                .pattern("RIR")
                .pattern("RIR")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .define('R', ModItems.SEASTONE_ROD.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_ROD.get()), has(ModItems.SEASTONE_ROD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, ModBlocks.SEASTONE_PRESSURE_PLATE.get())
                .pattern("II")
                .define('I', ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SEASTONE_INGOT.get(), 9)
                .requires(ModBlocks.SEASTONE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SEASTONE_BLOCK.get()), has(ModBlocks.SEASTONE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, ModBlocks.SEASTONE_BUTTON.get(), 1)
                .requires(ModItems.SEASTONE_INGOT.get())
                .unlockedBy(getHasName(ModItems.SEASTONE_INGOT.get()), has(ModItems.SEASTONE_INGOT.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, PieceCraft.MOD_ID + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
