package com.terraformersmc.modmenu.event;

import com.terraformersmc.modmenu.gui.ModsScreen;
import net.minecraft.src.GuiButton;
import net.minecraft.src.KeyBinding;
import net.minecraft.src.Minecraft;
import org.lwjgl.input.Keyboard;

public class ModMenuEventHandler {
	public static ModMenuEventHandler instance;
	public static KeyBinding MENU_KEY_BIND;

	public ModMenuEventHandler() {
		instance = this;
	}

	public void register() {
		MENU_KEY_BIND = new KeyBinding("key.modmenu.open_menu", Keyboard.KEY_NUMPAD9);
	}

	public static void onClientEndTick(Minecraft client) {
		while (MENU_KEY_BIND.isPressed()) {
			client.displayGuiScreen(new ModsScreen(client.currentScreen));
		}
	}

	public static void shiftButtons(GuiButton button, boolean shiftUp, int spacing) {
		if (shiftUp) {
			button.yPosition -= spacing / 2;
		} else {
			button.yPosition += spacing / 2;
		}
	}
}
