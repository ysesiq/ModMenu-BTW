package com.terraformersmc.modmenu;

import btw.AddonHandler;
import btw.BTWAddon;
import net.fabricmc.loader.api.FabricLoader;

public class ModMenuBTW extends BTWAddon {

    @Override
    public void postSetup() {
        this.modID = ModMenu.MOD_ID;
        this.addonName = FabricLoader.getInstance().getModContainer(ModMenu.MOD_ID).get().getMetadata().getName();
        this.shouldVersionCheck = false;
        addResourcePackDomain(ModMenu.MOD_ID);
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.addonName + " " + getVersionString() + " Initializing...");
    }
}
