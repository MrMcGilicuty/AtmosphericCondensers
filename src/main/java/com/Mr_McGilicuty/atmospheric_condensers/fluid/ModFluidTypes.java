package com.Mr_McGilicuty.atmospheric_condensers.fluid;

import javax.print.event.PrintServiceAttributeEvent;

import com.Mr_McGilicuty.atmospheric_condensers.AtmosphericCondensers;
import com.mojang.math.Vector3f;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation NITROGEN_OVERLAY_RL = new ResourceLocation(AtmosphericCondensers.MOD_ID, "misc/in_nitrogen_water");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, AtmosphericCondensers.MOD_ID);

    public static final RegistryObject<FluidType> NITROGEN_WATER_FLUID_TYPE = register("nitrogen_water_fluid", FluidType.Properties.create()
    .canDrown(true)
    .density(1)
    .canExtinguish(true)
    .temperature(-160)
    .viscosity(1)
    .canPushEntity(true)
    );

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, NITROGEN_OVERLAY_RL, 0xA1B9E2EE, new Vector3f(185f/255f, 226f/255f, 238f/255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
