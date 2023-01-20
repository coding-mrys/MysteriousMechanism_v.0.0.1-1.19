package net.mrys.mysterious_mechanism;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mrys.mysterious_mechanism.block.ModBlocks;
import net.mrys.mysterious_mechanism.fluid.ModFluidTypes;
import net.mrys.mysterious_mechanism.fluid.ModFluids;
import net.mrys.mysterious_mechanism.item.ModItems;
import net.mrys.mysterious_mechanism.villager.ModVillagers;
import net.mrys.mysterious_mechanism.world.feature.ModConfiguredFeatures;
import net.mrys.mysterious_mechanism.world.feature.ModPlacedFeatures;
import org.slf4j.Logger;

@Mod(mysterious_mechanism.MOD_ID)
public class mysterious_mechanism {
    public static final String MOD_ID = "mysterious_mechanism";
    private static final Logger LOGGER = LogUtils.getLogger();
    public mysterious_mechanism() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModVillagers.registerPOIs();
        });
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MRYS_FARMLAND.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_MRYS_FLUID.get(),RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_MRYS_FLUID.get(),RenderType.translucent());
        }
    }
}
