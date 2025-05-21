package dev.unowly.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesGermanLangProvider extends FabricLanguageProvider {
    public BotaniaBitesGermanLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.botania-bites.bell_pepper", "Paprika");
        translationBuilder.add("item.botania-bites.corn", "Mais");
        translationBuilder.add("item.botania-bites.tomato", "Tomate");
        translationBuilder.add("item.botania-bites.leek", "Lauch");
        translationBuilder.add("item.botania-bites.lettuce", "Kopfsalat");
        translationBuilder.add("item.botania-bites.radish", "Radieschen");

        translationBuilder.add("item.botania-bites.avocado", "Avocado");
        translationBuilder.add("item.botania-bites.banana", "Banane");
        translationBuilder.add("item.botania-bites.blueberry", "Blaubeere");
        translationBuilder.add("item.botania-bites.cherry", "Kirsche");
        translationBuilder.add("item.botania-bites.grape", "Traube");
        translationBuilder.add("item.botania-bites.kiwi", "Kiwi");
        translationBuilder.add("item.botania-bites.lemon", "Zitrone");
        translationBuilder.add("item.botania-bites.peach", "Pfirsich");
        translationBuilder.add("item.botania-bites.pear", "Birne");
        translationBuilder.add("item.botania-bites.pineapple", "Ananas");
        translationBuilder.add("item.botania-bites.pomegranate", "Granatapfel");
        translationBuilder.add("item.botania-bites.strawberry", "Erdbeere");

        translationBuilder.add("tag.item.botania-bites.botania_bites_fruits", "Botania & Bites Früchte");
        translationBuilder.add("tag.item.botania-bites.botania_bites_crops", "Botania & Bites Feldfrüchte");
        translationBuilder.add("tag.item.botania-bites.botania_bites_berries", "Botania & Bites Beeren");

        translationBuilder.add("item.botania-bites.palm_log", "Palmenstamm");
        translationBuilder.add("item.botania-bites.stripped_palm_log", "Entrindeter Palmenstamm");
        translationBuilder.add("item.botania-bites.palm_wood", "Palmenholz");
        translationBuilder.add("item.botania-bites.stripped_palm_wood", "Entrindetes Palmenholz");
        translationBuilder.add("item.botania-bites.palm_leaves", "Palmenblätter");
        translationBuilder.add("item.botania-bites.palm_planks", "Palmenholzbretter");
        translationBuilder.add("item.botania-bites.palm_sapling", "Palm Setzling");
    }
}

