package net.mrys.mysterious_mechanism.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrys.mysterious_mechanism.block.custom.gravity_block;
import net.mrys.mysterious_mechanism.item.ModCreativeModeTab;
import net.mrys.mysterious_mechanism.item.ModItems;
import net.mrys.mysterious_mechanism.mysterious_mechanism;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block>BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, mysterious_mechanism.MOD_ID);

    //add a block
    public static final RegistryObject<Block> MRYS_BLOCK = registerBlock("mrys_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.MYSTERIOUS_TAB);

    public static final RegistryObject<Block> MRYS_ORE = registerBlock("mrys_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.MYSTERIOUS_TAB);

    public static final RegistryObject<Block> GRAVITY_BLOCK = registerBlock("gravity_block",
            ()-> new gravity_block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(12f).requiresCorrectToolForDrops()), ModCreativeModeTab.MYSTERIOUS_TAB);
    //

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T>block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,RegistryObject<T>block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
