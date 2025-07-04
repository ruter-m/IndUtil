package net.ruter_m.indutil.datagen;

import net.minecraftforge.fml.common.Mod;
import net.ruter_m.indutil.IndUtil;
import net.ruter_m.indutil.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IndUtil.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.VASELINE);
        simpleItem(ModItems.VAFFELS);
        simpleItem(ModItems.VAFFELS_BOX);
        simpleItem(ModItems.APPLE_CIDER_VINEGAR);
        simpleItem(ModItems.APPLE_SHAVINGS);
        simpleItem(ModItems.GRATER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(IndUtil.MOD_ID,"item/" + item.getId().getPath()));
    }
}