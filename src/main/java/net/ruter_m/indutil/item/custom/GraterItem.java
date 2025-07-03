package net.ruter_m.indutil.item.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GraterItem extends Item {
    public GraterItem() {
        super(new Item.Properties()
                .durability(275)
                .stacksTo(1)
                .setNoRepair()
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
    public boolean hasCraftingRemainingItem() {
        return true;
    }
}

