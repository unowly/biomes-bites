package dev.unowly.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesItalianLangProvider extends FabricLanguageProvider {
    public BotaniaBitesItalianLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "it_it", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.botania-bites.bell_pepper", "Peperone");
        translationBuilder.add("item.botania-bites.corn", "Mais");
        translationBuilder.add("item.botania-bites.tomato", "Pomodoro");
        translationBuilder.add("item.botania-bites.leek", "Porro");
        translationBuilder.add("item.botania-bites.lettuce", "Lattuga");
        translationBuilder.add("item.botania-bites.radish", "Ravanello");

        translationBuilder.add("item.botania-bites.avocado", "Avocado");
        translationBuilder.add("item.botania-bites.banana", "Banana");
        translationBuilder.add("item.botania-bites.blueberry", "Mirtillo");
        translationBuilder.add("item.botania-bites.cherry", "Ciliegia");
        translationBuilder.add("item.botania-bites.grape", "Uva");
        translationBuilder.add("item.botania-bites.kiwi", "Kiwi");
        translationBuilder.add("item.botania-bites.lemon", "Limone");
        translationBuilder.add("item.botania-bites.peach", "Pesca");
        translationBuilder.add("item.botania-bites.pear", "Pera");
        translationBuilder.add("item.botania-bites.pineapple", "Ananas");
        translationBuilder.add("item.botania-bites.pomegranate", "Melagrana");
        translationBuilder.add("item.botania-bites.strawberry", "Fragola");
    }
}


