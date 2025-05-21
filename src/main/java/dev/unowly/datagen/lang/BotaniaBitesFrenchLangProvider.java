package dev.unowly.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesFrenchLangProvider extends FabricLanguageProvider {
    public BotaniaBitesFrenchLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "fr_fr", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.botania-bites.bell_pepper", "Poivron");
        translationBuilder.add("item.botania-bites.corn", "Maïs");
        translationBuilder.add("item.botania-bites.tomato", "Tomate");
        translationBuilder.add("item.botania-bites.leek", "Poireau");
        translationBuilder.add("item.botania-bites.lettuce", "Laitue");
        translationBuilder.add("item.botania-bites.radish", "Radis");

        translationBuilder.add("item.botania-bites.avocado", "Avocat");
        translationBuilder.add("item.botania-bites.banana", "Banane");
        translationBuilder.add("item.botania-bites.blueberry", "Myrtille");
        translationBuilder.add("item.botania-bites.cherry", "Cerise");
        translationBuilder.add("item.botania-bites.grape", "Raisin");
        translationBuilder.add("item.botania-bites.kiwi", "Kiwi");
        translationBuilder.add("item.botania-bites.lemon", "Citron");
        translationBuilder.add("item.botania-bites.peach", "Pêche");
        translationBuilder.add("item.botania-bites.pear", "Poire");
        translationBuilder.add("item.botania-bites.pineapple", "Ananas");
        translationBuilder.add("item.botania-bites.pomegranate", "Grenade");
        translationBuilder.add("item.botania-bites.strawberry", "Fraise");

        translationBuilder.add("tag.item.botania-bites.botania_bites_fruits", "Botania & Bites Fruits");
        translationBuilder.add("tag.item.botania-bites.botania_bites_crops", "Botania & Bites Récoltes");
        translationBuilder.add("tag.item.botania-bites.botania_bites_berries", "Botania & Bites Baies");

        translationBuilder.add("item.botania-bites.palm_log", "Tronc de palmier");
        translationBuilder.add("item.botania-bites.stripped_palm_log", "Tronc de palmier écorcé");
        translationBuilder.add("item.botania-bites.palm_wood", "Bois de palmier");
        translationBuilder.add("item.botania-bites.stripped_palm_wood", "Bois de palmier écorcé");
        translationBuilder.add("item.botania-bites.palm_leaves", "Feuilles de palmier");
        translationBuilder.add("item.botania-bites.palm_planks", "Planches de palmier");
        translationBuilder.add("item.botania-bites.palm_sapling", "Pousse de palmier");


    }
}

