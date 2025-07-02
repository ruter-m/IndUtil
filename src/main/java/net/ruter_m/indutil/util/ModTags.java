package net.ruter_m.indutil.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.ruter_m.indutil.IndUtil;

public class ModTags {
    public static class Blocks {
    public static final TagKey<Block> FACTORY_DECORATIONS = tag("factory_decorations.json");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(IndUtil.MOD_ID, name));
        }
    }
    public static class Items {

    }
}
