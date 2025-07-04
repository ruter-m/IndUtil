package net.ruter_m.indutil.item.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GraterItem extends Item {
    public GraterItem(Properties properties) {
        super(new Item.Properties()
                .durability(275)
        );
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack copy = stack.copy();
        copy.hurt(1, RandomSource.create(), null);
        return copy.getDamageValue() >= copy.getMaxDamage()
                ? ItemStack.EMPTY
                : copy;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}
