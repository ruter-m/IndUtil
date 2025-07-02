package net.ruter_m.indutil;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ruter_m.indutil.block.ModBlocks;
import net.ruter_m.indutil.item.ModItems;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IndUtil.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INDUTIL_TAB = CREATIVE_MODE_TABS.register("indutil",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VASELINE.get()))
                    .title(Component.translatable("creativetab.indutil"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VASELINE.get());
                        pOutput.accept(ModItems.VAFFELS.get());
                        pOutput.accept(ModItems.VAFFELS_BOX.get());

                        pOutput.accept(ModBlocks.CHIPBOARD.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}