package com.Mr_McGilicuty.atmospheric_condensers.world.feature;



import com.Mr_McGilicuty.atmospheric_condensers.AtmosphericCondensers;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import java.util.List;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
    DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, AtmosphericCondensers.MOD_ID);

    public static final RegistryObject<PlacedFeature> BITUMEN_ORE_PLACED = PLACED_FEATURES.register("bitumen_ore_placed",
    () -> new PlacedFeature(ModConfiguredFeatures.BITUMEN_ORE.getHolder().get(),
    commonOrePlacement(4, // VeinsPerChunk
    HeightRangePlacement.triangle(VerticalAnchor.absolute(50), VerticalAnchor.absolute(70)))));

    public static final RegistryObject<PlacedFeature> SILICA_SAND_PLACED = PLACED_FEATURES.register("silica_sand_placed",
    () -> new PlacedFeature(ModConfiguredFeatures.SILICA_SAND.getHolder().get(), commonOrePlacement(2, // VeinsPerChunk
    HeightRangePlacement.uniform(VerticalAnchor.absolute(50), VerticalAnchor.absolute(70)))));


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
