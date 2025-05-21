package dev.unowly.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesSpanishLangProvider extends FabricLanguageProvider {
    public BotaniaBitesSpanishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "es_es", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.botania-bites.bell_pepper", "Pimiento");
        translationBuilder.add("item.botania-bites.corn", "Maíz");
        translationBuilder.add("item.botania-bites.tomato", "Tomate");
        translationBuilder.add("item.botania-bites.leek", "Puerro");
        translationBuilder.add("item.botania-bites.lettuce", "Lechuga");
        translationBuilder.add("item.botania-bites.radish", "Rábano");

        translationBuilder.add("item.botania-bites.avocado", "Aguacate");
        translationBuilder.add("item.botania-bites.banana", "Banana");
        translationBuilder.add("item.botania-bites.blueberry", "Arándano");
        translationBuilder.add("item.botania-bites.cherry", "Cereza");
        translationBuilder.add("item.botania-bites.grape", "Uva");
        translationBuilder.add("item.botania-bites.kiwi", "Kiwi");
        translationBuilder.add("item.botania-bites.lemon", "Limón");
        translationBuilder.add("item.botania-bites.peach", "Melocotón");
        translationBuilder.add("item.botania-bites.pear", "Pera");
        translationBuilder.add("item.botania-bites.pineapple", "Piña");
        translationBuilder.add("item.botania-bites.pomegranate", "Granada");
        translationBuilder.add("item.botania-bites.strawberry", "Fresa");

        translationBuilder.add("tag.item.botania-bites.botania_bites_fruits", "Botania & Bites Frutas");
        translationBuilder.add("tag.item.botania-bites.botania_bites_crops", "Botania & Bites Cultivos");
        translationBuilder.add("tag.item.botania-bites.botania_bites_berries", "Botania & Bites Bayas");

        translationBuilder.add("item.botania-bites.palm_log", "Tronco de palma");
        translationBuilder.add("item.botania-bites.stripped_palm_log", "Tronco de palma pelado");
        translationBuilder.add("item.botania-bites.palm_wood", "Madera de palma");
        translationBuilder.add("item.botania-bites.stripped_palm_wood", "Madera de palma pelada");
        translationBuilder.add("item.botania-bites.palm_leaves", "Hojas de palma");
        translationBuilder.add("item.botania-bites.palm_planks", "Tablones de palma");
        translationBuilder.add("item.botania-bites.palm_sapling", "Brote de palma");

    }
}
