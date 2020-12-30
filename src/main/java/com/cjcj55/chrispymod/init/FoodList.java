package com.cjcj55.chrispymod.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList 
{
	public static final Food BLACK_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.BLINDNESS, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food BLUE_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.WATER_BREATHING, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food BROWN_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.HUNGER, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food CYAN_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.JUMP_BOOST, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food GRAY_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.MINING_FATIGUE, 200, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food GREEN_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.POISON, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food LIGHT_BLUE_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.DOLPHINS_GRACE, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food LIGHT_GRAY_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.INVISIBILITY, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food LIME_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.NAUSEA, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food MAGENTA_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.INSTANT_DAMAGE, 100, 4), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food ORANGE_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.GLOWING, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food PINK_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.STRENGTH, 100, 2), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food PURPLE_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.LEVITATION, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food RED_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.INSTANT_HEALTH, 100, 1), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food WHITE_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.SLOW_FALLING, 100, 5), 1.0f).setAlwaysEdible().fastToEat().build());
	public static final Food YELLOW_CANDY_CANE = (new Food.Builder().hunger(2).saturation(0.2f).effect(new EffectInstance(Effects.ABSORPTION, 100, 1), 1.0f).setAlwaysEdible().fastToEat().build());

	public static final Food COOKED_CARROT = (new Food.Builder().hunger(4).saturation(4.0f).build());
	
	public static final Food HONEY_STICK = (new Food.Builder().hunger(3).saturation(0.6f).fastToEat().build());
	
}