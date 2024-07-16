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

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> DEVIL_FRUIT_TAB = CREATIVE_MODE_TABS.register("devil_fruit_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SUBE_SUBE_NO_MI.get()))
                .title(Component.translatable("creativetab.devil_fruit"))
                .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SUBE_SUBE_NO_MI.get());

                })
                .build());

    public static final RegistryObject<CreativeModeTab> COMBAT_TAB = CREATIVE_MODE_TABS.register("combat_tab",
             () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SEASTONE_SWORD.get()))
                .title(Component.translatable("creativetab.combat_tab"))
                .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OAK_POLEARM.get());
                        pOutput.accept(ModItems.SEASTONE_HELMET.get());
                        pOutput.accept(ModItems.SEASTONE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SEASTONE_LEGGINGS.get());
                        pOutput.accept(ModItems.SEASTONE_BOOTS.get());
                        pOutput.accept(ModItems.SEASTONE_AXE.get());
                        pOutput.accept(ModItems.SEASTONE_SWORD.get());
                })
                .build());

    public static final RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("tools_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.SEASTONE_PICKAXE.get()))
                .title(Component.translatable("creativetab.tools_tab"))
                .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SEASTONE_PICKAXE.get());
                        pOutput.accept(ModItems.SEASTONE_SHOVEL.get());
                        pOutput.accept(ModItems.SEASTONE_HOE.get());

                })
                .build());
    
    public static final RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("food_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MEAT.get()))
                .title(Component.translatable("creativetab.food_tab"))
                .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MEAT.get());
                })
                .build());

    public static final RegistryObject<CreativeModeTab> MISC_TAB = CREATIVE_MODE_TABS.register("misc_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLAME_DIAL.get()))
                .title(Component.translatable("creativetab.misc_tab"))
                .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_SEASTONE.get());
                        pOutput.accept(ModItems.SEASTONE_INGOT.get());
                        pOutput.accept(ModItems.SEASTONE_ROD.get());
                        pOutput.accept(ModItems.FLAME_DIAL.get());
                })
                .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
