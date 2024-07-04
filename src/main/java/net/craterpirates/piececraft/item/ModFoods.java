package net.craterpirates.piececraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MEAT = new FoodProperties.Builder()
            .meat().saturationMod(2).nutrition(8).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 800), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 800), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800), 1f).build();
}
