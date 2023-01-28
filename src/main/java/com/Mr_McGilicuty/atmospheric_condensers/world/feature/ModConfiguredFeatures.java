package com.Mr_McGilicuty.atmospheric_condensers.world.feature;

import java.util.List;

import com.Mr_McGilicuty.atmospheric_condensers.AtmosphericCondensers;
import com.Mr_McGilicuty.atmospheric_condensers.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = 
    DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, AtmosphericCondensers.MOD_ID);


    public static final Supplier<List<OreConfiguration.TargetBlockState>> BITUMEN_ORES = Suppliers.memoize(() -> List.of(
    OreConfiguration.target(new BlockMatchTest(Blocks.SANDSTONE), ModBlocks.BITUMEN_ORE.get().defaultBlockState())));

    public static final Supplier<List<OreConfiguration.TargetBlockState>> SILICA_SANDS = Suppliers.memoize(() -> List.of(
    OreConfiguration.target(new BlockMatchTest(Blocks.SAND), ModBlocks.SILICA_SAND.get().defaultBlockState())));



    public static final RegistryObject<ConfiguredFeature<?, ?>> BITUMEN_ORE = CONFIGURED_FEATURES.register("bitumen_ore", 
    () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(BITUMEN_ORES.get(), 7)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SILICA_SAND = CONFIGURED_FEATURES.register("silica_sand", 
    () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(SILICA_SANDS.get(), 25)));


    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
