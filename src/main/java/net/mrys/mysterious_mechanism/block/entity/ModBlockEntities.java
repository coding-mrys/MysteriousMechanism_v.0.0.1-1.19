package net.mrys.mysterious_mechanism.block.entity;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrys.mysterious_mechanism.block.ModBlocks;
import net.mrys.mysterious_mechanism.mysterious_mechanism;

public class ModBlockEntities {
    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, mysterious_mechanism.MOD_ID);

    public static final RegistryObject<BlockEntityType<MrysChargerBlockEntity>> MRYS_CHARGER =
            BLOCK_ENTITIES.register("mrys_charger",() ->
                    BlockEntityType.Builder.of(MrysChargerBlockEntity::new,
                            ModBlocks.MRYS_CHARGER.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);

    }
}
