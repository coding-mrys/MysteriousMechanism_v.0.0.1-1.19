package net.mrys.mysterious_mechanism.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrys.mysterious_mechanism.block.ModBlocks;
import net.mrys.mysterious_mechanism.mysterious_mechanism;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType>POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, mysterious_mechanism.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, mysterious_mechanism.MOD_ID);

    public static final RegistryObject<PoiType>GRAVITY_BLOCK_POI = POI_TYPES.register("gravity_block_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.GRAVITY_BLOCK.get().getStateDefinition().getPossibleStates()),
                    1,1));

    public static final RegistryObject<VillagerProfession> SCIENTIST = VILLAGER_PROFESSIONS.register("scientist",
        ()-> new VillagerProfession("scientist",x -> x.get() == GRAVITY_BLOCK_POI.get(),
                x -> x.get() == GRAVITY_BLOCK_POI.get(),ImmutableSet.of(),ImmutableSet.of(),
                SoundEvents.ENDER_DRAGON_GROWL));

    public static void registerPOIs(){
        try{
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates",PoiType.class).invoke(null, GRAVITY_BLOCK_POI.get());
        } catch(InvocationTargetException | IllegalAccessException exeption) {
            exeption.printStackTrace();
        }
    }
    public  static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
