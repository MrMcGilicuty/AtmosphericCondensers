package com.Mr_McGilicuty.atmospheric_condensers.fluid;

import com.Mr_McGilicuty.atmospheric_condensers.AtmosphericCondensers;
import com.Mr_McGilicuty.atmospheric_condensers.block.ModBlocks;
import com.Mr_McGilicuty.atmospheric_condensers.item.ModItems;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, AtmosphericCondensers.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_NITROGEN_WATER = FLUIDS.register("nitrogen_water_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.NITROGEN_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_NITROGEN_WATER = FLUIDS.register("flowing_nitrogen_water", () -> new ForgeFlowingFluid.Source(ModFluids.NITROGEN_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties NITROGEN_WATER_FLUID_PROPERTIES = 
    new ForgeFlowingFluid.Properties(ModFluidTypes.NITROGEN_WATER_FLUID_TYPE, SOURCE_NITROGEN_WATER, FLOWING_NITROGEN_WATER)
    .slopeFindDistance(2)
    .levelDecreasePerBlock(1)
    .block(ModBlocks.NITROGEN_WATER_BLOCK)
    .bucket(ModItems.LIQUID_NITROGEN_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
