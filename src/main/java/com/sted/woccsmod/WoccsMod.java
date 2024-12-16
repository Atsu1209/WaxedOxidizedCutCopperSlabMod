package com.sted.woccsmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("woccsmod")
public class WoccsMod {
    public static final String MOD_ID = "woccsmod";

    public WoccsMod() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Mod setup logic here
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Client-specific setup
    }
}
