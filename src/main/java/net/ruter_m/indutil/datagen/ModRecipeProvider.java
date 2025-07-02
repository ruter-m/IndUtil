package net.ruter_m.indutil.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.ruter_m.indutil.IndUtil;
import net.ruter_m.indutil.block.ModBlocks;
import net.ruter_m.indutil.item.ModItems;
import org.spongepowered.asm.util.IConsumer;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VAFFELS_BOX.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModItems.VAFFELS.get())
                .unlockedBy(getHasName(ModItems.VAFFELS.get()), has(ModItems.VAFFELS.get()))
                .save(consumer, new ResourceLocation(IndUtil.MOD_ID, "vaffels_box_from_vaffels"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VAFFELS_BOX.get())
                .pattern("SSS")
                .pattern("E#E")
                .pattern("SSS")
                .define('S', Items.PAPER)
                .define('#', Items.COCOA_BEANS)
                .define('E', Items.WHEAT)
                .unlockedBy("has_item", has(Items.WHEAT))
                .save(consumer, new ResourceLocation(IndUtil.MOD_ID, "vaffels_box"));


        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.VAFFELS.get(), 4)
                .requires(ModItems.VAFFELS_BOX.get())
                .unlockedBy(getHasName(ModItems.VAFFELS_BOX.get()), has(ModItems.VAFFELS_BOX.get()))
                .save(consumer, new ResourceLocation(IndUtil.MOD_ID, "unpack_vaffels"));
    }
}
