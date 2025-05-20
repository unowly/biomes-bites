package dev.unowly.world.gen;

import dev.unowly.BotaniaBites;
import dev.unowly.world.BotaniaBitesPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class BotaniaBitesTreeGeneration {
    public static void generateTrees(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION,
                BotaniaBitesPlacedFeatures.PALM_TREE_PLACED_KEY
                );
    }
}
