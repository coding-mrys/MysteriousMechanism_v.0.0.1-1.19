package net.mrys.mysterious_mechanism.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrys.mysterious_mechanism.item.custom.*;
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

    public static final RegistryObject<Item>MRYS_POWER = ITEMS.register("mrys_power",
            ()-> new mrys_power(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER2 = ITEMS.register("mrys_power2",
            ()-> new mrys_power2(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER3 = ITEMS.register("mrys_power3",
            ()-> new mrys_power3(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER4 = ITEMS.register("mrys_power4",
            ()-> new mrys_power4(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER5 = ITEMS.register("mrys_power5",
            ()-> new mrys_power5(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER6 = ITEMS.register("mrys_power6",
            ()-> new mrys_power6(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER7 = ITEMS.register("mrys_power7",
            ()-> new mrys_power7(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).stacksTo(1)));

    //
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
