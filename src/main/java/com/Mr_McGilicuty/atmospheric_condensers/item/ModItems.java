package com.Mr_McGilicuty.atmospheric_condensers.item;

import com.Mr_McGilicuty.atmospheric_condensers.AtmosphericCondensers;
import com.Mr_McGilicuty.atmospheric_condensers.fluid.ModFluids;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, AtmosphericCondensers.MOD_ID);


    public static final RegistryObject<Item> BITUMEN = ITEMS.register("bitumen", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> SILICA_DUST = ITEMS.register("silica_dust", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> CIRCUIT_BOARDV1 = ITEMS.register("circuit_boardv1", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> CIRCUIT_BOARDV2 = ITEMS.register("circuit_boardv2", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> RAW_CIRCUIT_BOARD = ITEMS.register("raw_circuit_board", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));


    public static final RegistryObject<Item> LIQUID_NITROGEN_BUCKET = ITEMS.register("liquid_nitrogen_bucket", 
    () -> new BucketItem(ModFluids.SOURCE_NITROGEN_WATER, new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)
    .stacksTo(1)
    .craftRemainder(Items.BUCKET)));


    public static final RegistryObject<Item> SILICON_MIXTURE = ITEMS.register("silicon_mixture", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> TRANSISTOR_FEET = ITEMS.register("transistor_feet", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> TRANSISTOR_HEAD = ITEMS.register("transistor_head", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB)));

    public static final RegistryObject<Item> TRANSISTOR = ITEMS.register("transistor", 
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ATMO_TAB).stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
