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
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.main_items"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SEASTONE.get());
                        pOutput.accept(ModItems.SEASTONE_INGOT.get());

                        pOutput.accept(ModBlocks.ADAM_WOOD.get());
                        pOutput.accept(ModBlocks.SEASTONE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
