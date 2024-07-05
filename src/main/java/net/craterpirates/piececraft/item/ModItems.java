package net.craterpirates.piececraft.item;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.item.custom.FuelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PieceCraft.MOD_ID);



    public static final RegistryObject<Item> RAW_SEASTONE = ITEMS.register("raw_seastone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_INGOT = ITEMS.register("seastone_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_ROD = ITEMS.register("seastone_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_SWORD = ITEMS.register("seastone_sword",
            () -> new SwordItem(ModToolTiers.SEASTONE, 8, 8, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_PICKAXE = ITEMS.register("seastone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SEASTONE, 5, 6, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_AXE = ITEMS.register("seastone_axe",
            () -> new AxeItem(ModToolTiers.SEASTONE, 10, 4, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_SHOVEL = ITEMS.register("seastone_shovel",
            () -> new ShovelItem(ModToolTiers.SEASTONE, 4, 5, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_HOE = ITEMS.register("seastone_hoe",
            () -> new HoeItem(ModToolTiers.SEASTONE, 3, 5, new Item.Properties()));




    public static final RegistryObject<Item> FLAME_DIAL = ITEMS.register("flame_dial",
            () -> new FuelItem(new Item.Properties(), 300));


    public static final RegistryObject<Item> MEAT = ITEMS.register("meat",
            ()-> new Item(new Item.Properties().food(ModFoods.MEAT)));



    public static final RegistryObject<Item> SUBE_SUBE_NO_MI = ITEMS.register("sube_sube_no_mi",
            ()-> new Item(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
