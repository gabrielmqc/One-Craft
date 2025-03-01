package net.gabrielmazzo.onecraftmod.foods;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GomuGomuNoMiFood {
    public static final FoodProperties GOMU_GOMU_NO_MI = new FoodProperties.Builder()
            .nutrition(8)
            .fast()// Valor nutricional
            .saturationMod(1.2f) // Modificador de saturação
            .effect(()-> new MobEffectInstance(MobEffects.JUMP, 200 ), 0.9f)
            .alwaysEat() // Pode ser consumido mesmo com fome cheia
            .build();
}
