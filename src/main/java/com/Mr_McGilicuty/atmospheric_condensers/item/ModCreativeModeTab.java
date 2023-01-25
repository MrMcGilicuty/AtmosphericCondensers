package com.Mr_McGilicuty.atmospheric_condensers.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ATMO_TAB = new CreativeModeTab("atmosphericcondenserstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILICA_DUST.get());
        }
    };
}
