package com.terraformersmc.modmenu.mixin;

import com.terraformersmc.modmenu.event.ModMenuEventHandler;
import net.minecraft.src.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraftClient {
    @Inject(method = "runTick", at = @At("TAIL"))
    private void onKeyEvent(CallbackInfo ci) {
        ModMenuEventHandler.onClientEndTick((Minecraft) (Object) this);
    }
}