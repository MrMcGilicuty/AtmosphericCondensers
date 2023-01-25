package com.Mr_McGilicuty.atmospheric_condensers.block;

import java.util.function.Supplier;


import com.Mr_McGilicuty.atmospheric_condensers.AtmosphericCondensers;
import com.Mr_McGilicuty.atmospheric_condensers.item.ModCreativeModeTab;
import com.Mr_McGilicuty.atmospheric_condensers.item.ModItems;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
    DeferredRegister.create(ForgeRegistries.BLOCKS, AtmosphericCondensers.MOD_ID);


    public static final RegistryObject<Block> SILICA_SAND = registerBlock("silica_sand", () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND)
    .strength(2f)
    .sound(SoundType.SAND)), ModCreativeModeTab.ATMO_TAB);

    public static final RegistryObject<Block> BITUMEN_ORE = registerBlock("bitumen_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
    .strength(2f)
    .sound(SoundType.SAND)
    .requiresCorrectToolForDrops(), UniformInt.of(3,5)), ModCreativeModeTab.ATMO_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
