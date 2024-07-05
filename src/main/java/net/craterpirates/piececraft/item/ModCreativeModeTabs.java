package net.craterpirates.piececraft.item;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PieceCraft.MOD_ID);



    public static final RegistryObject<CreativeModeTab> MAIN_ITEMS_TAB = CREATIVE_MODE_TABS.register("main_items_tab",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.SEASTONE_INGOT.get()))
                    .title(Component.translatable("creativetab.main_items"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.RAW_SEASTONE.get());
                        pOutput.accept(ModItems.SEASTONE_INGOT.get());
                        pOutput.accept(ModItems.SEASTONE_SWORD.get());
                        pOutput.accept(ModItems.SEASTONE_PICKAXE.get());
                        pOutput.accept(ModItems.SEASTONE_AXE.get());
                        pOutput.accept(ModItems.SEASTONE_SHOVEL.get());
                        pOutput.accept(ModItems.SEASTONE_HOE.get());
                        pOutput.accept(ModItems.SEASTONE_ROD.get());

                        pOutput.accept(ModItems.FLAME_DIAL.get());

                        pOutput.accept(ModBlocks.SEASTONE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SEASTONE_ORE.get());
                        pOutput.accept(ModBlocks.SEASTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.SEASTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.SEASTONE_SLAB.get());
                        pOutput.accept(ModBlocks.SEASTONE_BUTTON.get());
                        pOutput.accept(ModBlocks.SEASTONE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SEASTONE_FENCE.get());
                        pOutput.accept(ModBlocks.SEASTONE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SEASTONE_WALL.get());
                        pOutput.accept(ModBlocks.SEASTONE_DOOR.get());
                        pOutput.accept(ModBlocks.SEASTONE_TRAPDOOR.get());

                        pOutput.accept(ModItems.MEAT.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> DEVIL_FRUIT_TAB = CREATIVE_MODE_TABS.register("devil_fruit_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SUBE_SUBE_NO_MI.get()))
                .title(Component.translatable("creativetab.devil_fruit"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.SUBE_SUBE_NO_MI.get());
                })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
