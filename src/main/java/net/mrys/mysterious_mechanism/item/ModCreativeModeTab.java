package net.mrys.mysterious_mechanism.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mrys.mysterious_mechanism.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYSTERIOUS_TAB = new CreativeModeTab("mysterious_tab") {
        @Override
        public ItemStack makeIcon() {

            return new ItemStack(ModItems.MRYS_INGOT.get());
        }
    };

    public static final CreativeModeTab MYSTERIOUS_TAB2 = new CreativeModeTab("mysterious_tab2") {
        @Override
        public ItemStack makeIcon() {

            return new ItemStack(ModItems.MRYS_POWER7.get());
        }
    };

    public static final CreativeModeTab MYSTERIOUS_TAB3 = new CreativeModeTab("mysterious_tab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.GRAVITY_BLOCK.get());
        }
    };
}
