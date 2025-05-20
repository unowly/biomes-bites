package dev.unowly.world.feature.trunk;

import dev.unowly.BotaniaBites;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.minecraft.registry.Registry;



public class BotaniaBitesTrunkPlacerTypes {
    public static final TrunkPlacerType<PalmTrunkPlacer> PALM_TRUNK_PLACER =
            Registry.register(
                    Registries.TRUNK_PLACER_TYPE,
                    Identifier.of(BotaniaBites.MOD_ID, "palm_trunk_placer"
                    ), new TrunkPlacerType<>(PalmTrunkPlacer.MAP_CODEC)
            );


    public static void register(){
    }
}
