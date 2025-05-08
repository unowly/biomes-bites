package dev.unowly;

import dev.unowly.data.provider.BotaniaBitesBlockLootTableProvider;
import dev.unowly.data.provider.BotaniaBitesBlockTagProvider;
import dev.unowly.data.provider.BotaniaBitesEnglischTranslationProvider;
import dev.unowly.data.provider.BotaniaBitesItemTagProvider;
import dev.unowly.worldgen.ConfiguredFeatureRegistry;
import dev.unowly.worldgen.PlacedFeatureRegistry;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BotaniaBitesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BotaniaBitesBlockLootTableProvider::new);
        pack.addProvider(BotaniaBitesBlockTagProvider::new);
        pack.addProvider(BotaniaBitesEnglischTranslationProvider::new);
        pack.addProvider(BotaniaBitesItemTagProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureRegistry::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureRegistry::bootstrap);
    }
}
