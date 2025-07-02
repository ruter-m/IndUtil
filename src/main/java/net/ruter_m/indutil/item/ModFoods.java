package net.ruter_m.indutil.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties VASELINE = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(new MobEffectInstance(MobEffects.REGENERATION, 50, 1), 1.0f).alwaysEat().build();
    public static final FoodProperties VAFFELS = new FoodProperties.Builder().nutrition(3).fast()
            .saturationMod(0.6f).build();
}