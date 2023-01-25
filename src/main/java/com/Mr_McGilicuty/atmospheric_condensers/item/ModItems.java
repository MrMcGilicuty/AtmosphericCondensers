package com.Mr_McGilicuty.atmospheric_condensers.item;

import com.Mr_McGilicuty.atmospheric_condensers.AtmosphericCondensers;

import net.minecraft.world.item.Item;
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



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
