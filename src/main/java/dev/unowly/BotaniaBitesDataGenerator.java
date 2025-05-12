package dev.unowly;

import dev.unowly.datagen.lang.*;
import dev.unowly.datagen.tags.BotaniaBitesBlockTagProvider;
import dev.unowly.datagen.tags.BotaniaBitesItemTagProvider;
import dev.unowly.datagen.BotaniaBitesRecipeProvider;
import dev.unowly.datagen.BotaniaBitesRegistryDataGenerator;
import dev.unowly.world.BotaniaBitesConfiguredFeatures;
import dev.unowly.world.BotaniaBitesPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BotaniaBitesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

//REGISTRY PROVIDER
        pack.addProvider(BotaniaBitesRegistryDataGenerator::new);

//LANGUAGE PROVIDER
        pack.addProvider(BotaniaBitesEnglishLangProvider::new);
        pack.addProvider(BotaniaBitesGermanLangProvider::new);
        pack.addProvider(BotaniaBitesSpanishLangProvider::new);
        pack.addProvider(BotaniaBitesFrenchLangProvider::new);
        pack.addProvider(BotaniaBitesRussianLangProvider::new);
        pack.addProvider(BotaniaBitesItalianLangProvider::new);

//RECIPE PROVIDER
        pack.addProvider(BotaniaBitesRecipeProvider::new);

//TAG PROVIDER
        pack.addProvider(BotaniaBitesItemTagProvider::new);
        pack.addProvider(BotaniaBitesBlockTagProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, BotaniaBitesConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, BotaniaBitesPlacedFeatures::bootstrap);
    }
}
