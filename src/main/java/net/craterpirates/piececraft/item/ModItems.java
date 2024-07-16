package net.craterpirates.piececraft.item;

import net.craterpirates.piececraft.PieceCraft;
import net.craterpirates.piececraft.item.custom.DevilFruitItem;
import net.craterpirates.piececraft.item.custom.FuelItem;
import net.craterpirates.piececraft.item.custom.ModArmorItem;
import net.craterpirates.piececraft.item.custom.ModPolearmItem;
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
            () -> new SwordItem(ModToolTiers.SEASTONE, 6, 2, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_PICKAXE = ITEMS.register("seastone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SEASTONE, 3, 3, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_AXE = ITEMS.register("seastone_axe",
            () -> new AxeItem(ModToolTiers.SEASTONE, 7, 2, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_SHOVEL = ITEMS.register("seastone_shovel",
            () -> new ShovelItem(ModToolTiers.SEASTONE, 4, 1, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_HOE = ITEMS.register("seastone_hoe",
            () -> new HoeItem(ModToolTiers.SEASTONE, 3, 1, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_HELMET = ITEMS.register("seastone_helmet",
            () -> new ModArmorItem(ModArmourMaterials.SEASTONE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_CHESTPLATE = ITEMS.register("seastone_chestplate",
            () -> new ArmorItem(ModArmourMaterials.SEASTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_LEGGINGS = ITEMS.register("seastone_leggings",
            () -> new ArmorItem(ModArmourMaterials.SEASTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> SEASTONE_BOOTS = ITEMS.register("seastone_boots",
            () -> new ArmorItem(ModArmourMaterials.SEASTONE, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static final RegistryObject<Item> OAK_POLEARM = ITEMS.register("oak_polearm",
            () -> new ModPolearmItem(Tiers.WOOD, 2, -1f, new Item.Properties()));




    public static final RegistryObject<Item> FLAME_DIAL = ITEMS.register("flame_dial",
            () -> new FuelItem(new Item.Properties(), 300));


    public static final RegistryObject<Item> MEAT = ITEMS.register("meat",
            ()-> new Item(new Item.Properties().food(ModFoods.MEAT)));



    public static final RegistryObject<Item> SUBE_SUBE_NO_MI = ITEMS.register("sube_sube_no_mi",
            ()-> new DevilFruitItem(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
