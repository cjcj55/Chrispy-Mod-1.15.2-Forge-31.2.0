package com.cjcj55.chrispymod.objects.items;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

public enum ChrispyRarity implements net.minecraftforge.common.IExtensibleEnum 
{
   BLACK(TextFormatting.BLACK),
   DARK_BLUE(TextFormatting.DARK_BLUE),
   DARK_GREEN(TextFormatting.DARK_GREEN),
   DARK_AQUA(TextFormatting.DARK_AQUA),
   DARK_RED(TextFormatting.DARK_RED),
   DARK_PURPLE(TextFormatting.DARK_PURPLE),
   GOLD(TextFormatting.GOLD),
   GRAY(TextFormatting.GRAY),
   DARK_GRAY(TextFormatting.DARK_GRAY),
   BLUE(TextFormatting.BLUE),
   GREEN(TextFormatting.GREEN),
   AQUA(TextFormatting.AQUA),
   RED(TextFormatting.RED),
   LIGHT_PURPLE(TextFormatting.LIGHT_PURPLE),
   YELLOW(TextFormatting.YELLOW),
   WHITE(TextFormatting.WHITE),
   OBFUSCATED(TextFormatting.OBFUSCATED),
   BOLD(TextFormatting.BOLD),
   STRIKETHROUGH(TextFormatting.STRIKETHROUGH),
   UNDERLINE(TextFormatting.UNDERLINE),
   ITALIC(TextFormatting.ITALIC),
   RESET(TextFormatting.RESET);

	public final TextFormatting color;

   private ChrispyRarity(TextFormatting p_i48837_3_) {
      this.color = p_i48837_3_;
   }

   public static ChrispyRarity create(String name, TextFormatting p_i48837_3_) {
      throw new IllegalStateException("Enum not extended");
   }
   
   public ChrispyRarity getChrispyRarity(ItemStack stack) {
      if (!stack.isEnchanted()) {
         return this;
      } else {
         switch(this) {
         case BLACK:
        	 return ChrispyRarity.BLACK;
         case DARK_BLUE:
            return ChrispyRarity.DARK_BLUE;
         case DARK_GREEN:
            return ChrispyRarity.DARK_GREEN;
         case DARK_AQUA:
        	 return ChrispyRarity.DARK_AQUA;
         default:
            return this;
         }
      }
   }
}
