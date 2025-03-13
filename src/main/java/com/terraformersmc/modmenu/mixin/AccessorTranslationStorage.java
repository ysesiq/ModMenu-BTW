package com.terraformersmc.modmenu.mixin;

import java.util.Map;

import net.minecraft.src.Locale;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Locale.class)
public interface AccessorTranslationStorage {

	@Accessor("field_135032_a")
	Map<String, String> getTranslations();

}
