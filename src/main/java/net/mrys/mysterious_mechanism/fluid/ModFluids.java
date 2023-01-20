package net.mrys.mysterious_mechanism.fluid;


import net.mrys.mysterious_mechanism.mysterious_mechanism;
import net.mrys.mysterious_mechanism.block.ModBlocks;
import net.mrys.mysterious_mechanism.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, mysterious_mechanism.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_MRYS_FLUID = FLUIDS.register("source_mrys_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MRYS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_MRYS_FLUID = FLUIDS.register("flowing_mrys_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MRYS_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties MRYS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MRYS_FLUID_TYPE, SOURCE_MRYS_FLUID, FLOWING_MRYS_FLUID)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MRYS_FLUID_BLOCK)
            .bucket(ModItems.MRYS_FLUID_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}