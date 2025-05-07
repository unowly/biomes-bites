package dev.unowly.worldgen;

import dev.unowly.BotaniaBites;
import dev.unowly.block.BlockRegistry;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider;

import java.util.List;

public class ConfiguredFeatureRegistry {
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_FLOWER_KEY = registerKey("stone_flower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STONE_FLOWER_PATCH_KEY = registerKey("stone_flower_patch");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RegistryEntryLookup<PlacedFeature> registryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        register(context, STONE_FLOWER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                new NoiseBlockStateProvider(
                        345672L,
                        new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0),
                        0.020833334F,
                        List.of(
                                BlockRegistry.STONE_FLOWER.getDefaultState()
                        )
                )
        ));

        register(context, STONE_FLOWER_PATCH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                64,
                2,
                2,
                registryEntryLookup.getOrThrow(PlacedFeatureRegistry.STONE_FLOWER_KEY)
        ));
    }




    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, BotaniaBites.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key,
            F feature, FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}
