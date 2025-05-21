package dev.unowly.world.feature.foliage;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import dev.unowly.BotaniaBites; // oder dein Mod-Hauptklasse


public class BotaniaBitesFoliagePlacerTypes {
    public static final FoliagePlacerType<PalmFoliagePlacer> PALM_FOLIAGE_PLACER =
            Registry.register(
                    Registries.FOLIAGE_PLACER_TYPE,
                    Identifier.of(BotaniaBites.MOD_ID, "palm_foliage_placer"),
                    new FoliagePlacerType<>(PalmFoliagePlacer.CODEC)
            );

    public static void register() {
        // Methode zum expliziten Aufruf im Mod-Initializer
    }
}
