package net.ruter_m.indutil.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ruter_m.indutil.IndUtil;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IndUtil.MOD_ID);

    public static final RegistryObject<Item> VASELINE = ITEMS.register("vaseline",
            () -> new Item(new Item.Properties().food(ModFoods.VASELINE)));
    public static final RegistryObject<Item> VAFFELS = ITEMS.register("vaffels",
            () -> new Item(new Item.Properties().food(ModFoods.VAFFELS)));
    public static final RegistryObject<Item> VAFFELS_BOX = ITEMS.register("vaffels_box",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
