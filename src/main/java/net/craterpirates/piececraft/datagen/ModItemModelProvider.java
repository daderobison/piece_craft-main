package net.craterpirates.piececraft.datagen;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.block.ModBlocks;
import net.craterpirates.piececraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PieceCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_SEASTONE);
        simpleItem(ModItems.SEASTONE_INGOT);
        simpleItem(ModItems.SEASTONE_ROD);
        simpleItem(ModItems.FLAME_DIAL);
        simpleItem(ModItems.MEAT);

        simpleBlockItem(ModBlocks.SEASTONE_DOOR);

        fenceItem(ModBlocks.SEASTONE_FENCE, ModBlocks.SEASTONE_BLOCK);
        buttonItem(ModBlocks.SEASTONE_BUTTON, ModBlocks.SEASTONE_BLOCK);
        wallItem(ModBlocks.SEASTONE_WALL, ModBlocks.SEASTONE_BLOCK);
        trapdoorItem(ModBlocks.SEASTONE_TRAPDOOR);

        evenSimplerBlockItem(ModBlocks.SEASTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.SEASTONE_SLAB);
        evenSimplerBlockItem(ModBlocks.SEASTONE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SEASTONE_FENCE_GATE);

    }

    private void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/"+ForgeRegistries.BLOCKS.getKey(block.get()).getPath()+"_bottom"));
    }

    private ItemModelBuilder simpleItem (RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PieceCraft.MOD_ID, "item/"+item.getId().getPath()));
    }

    private void evenSimplerBlockItem (RegistryObject<Block> block){
        this.withExistingParent(PieceCraft.MOD_ID+":"+ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/"+ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItem (RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(PieceCraft.MOD_ID, "block/"+ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void buttonItem (RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(PieceCraft.MOD_ID, "block/"+ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void wallItem (RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(PieceCraft.MOD_ID, "block/"+ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PieceCraft.MOD_ID, "item/"+item.getId().getPath()));
    }


}
