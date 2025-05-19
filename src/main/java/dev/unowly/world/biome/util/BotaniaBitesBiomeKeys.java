package dev.unowly.world.biome.util;

import dev.unowly.BotaniaBites;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class BotaniaBitesBiomeKeys {
    public static final RegistryKey<Biome> TROPICAL_BEACH_BIOME_KEY = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(BotaniaBites.MOD_ID, "your_biome"));
}
