package net.mrys.mysterious_mechanism.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrys.mysterious_mechanism.block.ModBlocks;
import net.mrys.mysterious_mechanism.fluid.ModFluids;
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

    public static final RegistryObject<Item>MRYS_MASK = ITEMS.register("mrys_mask",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2)));

    //FARM
    public static final RegistryObject<Item>MRYS_SEEDS = ITEMS.register("mrys_seeds",
            ()-> new ItemNameBlockItem(ModBlocks.MRYS_FARMLAND.get(),
                    new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB4)));

    public static final RegistryObject<Item>MRYS_FRUIT = ITEMS.register("mrys_fruit",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB4)
                    .food(new FoodProperties.Builder().nutrition(40).saturationMod(2f).build()))
    );
    //MRYS POWER

    public static final RegistryObject<Item>MRYS_POWER = ITEMS.register("mrys_power",
            ()-> new mrys_power(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER2 = ITEMS.register("mrys_power2",
            ()-> new mrys_power2(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER3 = ITEMS.register("mrys_power3",
            ()-> new mrys_power3(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER4 = ITEMS.register("mrys_power4",
            ()-> new mrys_power4(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER5 = ITEMS.register("mrys_power5",
            ()-> new mrys_power5(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER6 = ITEMS.register("mrys_power6",
            ()-> new mrys_power6(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2).stacksTo(1)));
    public static final RegistryObject<Item>MRYS_POWER7 = ITEMS.register("mrys_power7",
            ()-> new mrys_power7(new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB2).stacksTo(1)));

    //FLUIDS
    public static final RegistryObject<Item>MRYS_FLUID_BUCKET = ITEMS.register("mrys_fluid_bucket",
            ()-> new BucketItem(ModFluids.SOURCE_MRYS_FLUID,
                    new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));

    //SWORD
    public static final RegistryObject<Item>MRYS_SWORD = ITEMS.register("mrys_sword",
            ()-> new SwordItem(Tiers.NETHERITE,15,6f, new Item.Properties().tab(ModCreativeModeTab.MYSTERIOUS_TAB5).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
