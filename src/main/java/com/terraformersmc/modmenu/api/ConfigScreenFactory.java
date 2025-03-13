package com.terraformersmc.modmenu.api;

import net.minecraft.src.GuiScreen;

@FunctionalInterface
public interface ConfigScreenFactory<S extends GuiScreen> {
	S create(GuiScreen parent);
}
