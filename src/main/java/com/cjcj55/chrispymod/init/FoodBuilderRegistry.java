package com.cjcj55.chrispymod.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class FoodBuilderRegistry 
{
	// Candy Canes
	public static final Food BLACK_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.BLINDNESS, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food BLUE_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.WATER_BREATHING, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food BROWN_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.HUNGER, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food CYAN_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.JUMP, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food GRAY_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.DIG_SLOWDOWN, 200, 5), 1.0f).alwaysEat().fast().build());
	public static final Food GREEN_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.POISON, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food LIGHT_BLUE_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.DOLPHINS_GRACE, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food LIGHT_GRAY_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.INVISIBILITY, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food LIME_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.CONFUSION, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food MAGENTA_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.HARM, 100, 4), 1.0f).alwaysEat().fast().build());
	public static final Food ORANGE_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.GLOWING, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food PINK_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.DAMAGE_BOOST, 100, 2), 1.0f).alwaysEat().fast().build());
	public static final Food PURPLE_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.LEVITATION, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food RED_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.HEAL, 100, 1), 1.0f).alwaysEat().fast().build());
	public static final Food WHITE_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.SLOW_FALLING, 100, 5), 1.0f).alwaysEat().fast().build());
	public static final Food YELLOW_CANDY_CANE = (new Food.Builder().nutrition(2).saturationMod(0.2f).effect(new EffectInstance(Effects.ABSORPTION, 100, 1), 1.0f).alwaysEat().fast().build());

	// Carrot
	public static final Food COOKED_CARROT = (new Food.Builder().nutrition(4).saturationMod(4.0f).build());
	
	// Honey Stick
	public static final Food HONEY_STICK = (new Food.Builder().nutrition(3).saturationMod(0.6f).fast().build());
	
}