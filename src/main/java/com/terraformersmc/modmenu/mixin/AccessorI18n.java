package com.terraformersmc.modmenu.mixin;

import net.minecraft.src.I18n;
import net.minecraft.src.Locale;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(I18n.class)
public interface AccessorI18n {

	@Accessor("i18nLocale")
	public static Locale getTranslations() {
		throw new UnsupportedOperationException();
	}
}
