package net.quedoom.modthatclosesthegamewhenitopens.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {

	@Inject(method = "onGameLoadFinished", at = @At("TAIL"))
	private void closeGame(CallbackInfo info) {
		System.exit(69);
	}
}