package net.mrys.mysterious_mechanism.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrys.mysterious_mechanism.mysterious_mechanism;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, mysterious_mechanism.MOD_ID);

    public static final RegistryObject<MenuType<MrysChargerMenu>>MRYS_CHARGER_MENU =
            registerMenuType(MrysChargerMenu::new,"mrys_charger_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>>registerMenuType(IContainerFactory<T> factory, String name){
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus){
        MENUS.register(eventBus);
    }
}
