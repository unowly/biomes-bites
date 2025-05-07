package dev.unowly.data.provider;

import dev.unowly.block.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesEnglischTranslationProvider extends FabricLanguageProvider {
    public BotaniaBitesEnglischTranslationProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(BlockRegistry.STONE_FLOWER, "Stone Flower");
        translationBuilder.add(BlockRegistry.STONE_FLOWER_POT, "Stone Flower Pot");
    }
}
