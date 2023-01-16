package net.mrys.mysterious_mechanism.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrys.mysterious_mechanism.mysterious_mechanism;

public class ModItems {
    public static final DeferredRegister<Item>ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, mysterious_mechanism.MOD_ID);

    //add item
    public static final RegistryObject<Item>MRYS_INGOT = ITEMS.register("mrys_ingot",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB)));

    public static final RegistryObject<Item>MRYS_NUGGET = ITEMS.register("mrys_nugget",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB)));

    public static final RegistryObject<Item>RAW_MRYS = ITEMS.register("raw_mrys",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB)));

    //
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
