package net.mrys.mysterious_mechanism.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYSTERIOUS_TAB = new CreativeModeTab("mysterious_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MRYS_INGOT.get());
        }
    };
}
