package dev.unowly.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesRussianLangProvider extends FabricLanguageProvider {
    public BotaniaBitesRussianLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.botania-bites.bell_pepper", "Болгарский перец");
        translationBuilder.add("item.botania-bites.corn", "Кукуруза");
        translationBuilder.add("item.botania-bites.tomato", "Томат");
        translationBuilder.add("item.botania-bites.leek", "Лук-порей");
        translationBuilder.add("item.botania-bites.lettuce", "Салат");
        translationBuilder.add("item.botania-bites.radish", "Редис");

        translationBuilder.add("item.botania-bites.avocado", "Авокадо");
        translationBuilder.add("item.botania-bites.banana", "Банан");
        translationBuilder.add("item.botania-bites.blueberry", "Черника");
        translationBuilder.add("item.botania-bites.cherry", "Вишня");
        translationBuilder.add("item.botania-bites.grape", "Виноград");
        translationBuilder.add("item.botania-bites.kiwi", "Киви");
        translationBuilder.add("item.botania-bites.lemon", "Лимон");
        translationBuilder.add("item.botania-bites.peach", "Персик");
        translationBuilder.add("item.botania-bites.pear", "Груша");
        translationBuilder.add("item.botania-bites.pineapple", "Ананас");
        translationBuilder.add("item.botania-bites.pomegranate", "Гранат");
        translationBuilder.add("item.botania-bites.strawberry", "Клубника");

        translationBuilder.add("tag.item.botania-bites.botania_bites_fruits", "Botania & Bites Фрукты");
        translationBuilder.add("tag.item.botania-bites.botania_bites_crops", "Botania & Bites Урожай");
        translationBuilder.add("tag.item.botania-bites.botania_bites_berries", "Botania & Bites Ягоды");

    }
}
