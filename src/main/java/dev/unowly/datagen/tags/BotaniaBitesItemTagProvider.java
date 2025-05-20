package dev.unowly.datagen.tags;

import dev.unowly.BotaniaBites;
import dev.unowly.block.BlockRegistry;
import dev.unowly.item.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesItemTagProvider extends FabricTagProvider<Item> {
    public static final TagKey<Item> BOTANIA_BITES_FRUITS = TagKey.of(RegistryKeys.ITEM, Identifier.of(BotaniaBites.MOD_ID, "botania_bites_fruits"));
    public static final TagKey<Item> BOTANIA_BITES_CROPS = TagKey.of(RegistryKeys.ITEM, Identifier.of(BotaniaBites.MOD_ID, "botania_bites_crops"));
    public static final TagKey<Item> BOTANIA_BITES_BERRIES = TagKey.of(RegistryKeys.ITEM, Identifier.of(BotaniaBites.MOD_ID, "botania_bites_berries"));
    public static final TagKey<Item> BOTANIA_BITES_SEEDS = TagKey.of(RegistryKeys.ITEM, Identifier.of(BotaniaBites.MOD_ID, "botania_bites_seeds"));


    public BotaniaBitesItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BOTANIA_BITES_FRUITS)
                .add(ItemRegistry.AVOCADO)
                .add(ItemRegistry.BANANA)
                .add(ItemRegistry.CHERRY)
                .add(ItemRegistry.GRAPE)
                .add(ItemRegistry.KIWI)
                .add(ItemRegistry.LEMON)
                .add(ItemRegistry.PEACH)
                .add(ItemRegistry.PEAR)
                .add(ItemRegistry.PINEAPPLE)
                .add(ItemRegistry.POMEGRANATE);

        getOrCreateTagBuilder(BOTANIA_BITES_CROPS)
                .add(ItemRegistry.BELL_PEPPER)
                .add(ItemRegistry.CORN)
                .add(ItemRegistry.TOMATO)
                .add(ItemRegistry.LEEK)
                .add(ItemRegistry.LETTUCE);

        getOrCreateTagBuilder(BOTANIA_BITES_BERRIES)
                .add(ItemRegistry.BLUEBERRY)
                .add(ItemRegistry.STRAWBERRY);

        getOrCreateTagBuilder(BOTANIA_BITES_SEEDS)
                .add(ItemRegistry.BELL_PEPPER_SEEDS)
                .add(ItemRegistry.CORN_SEEDS)
                .add(ItemRegistry.LEEK_SEEDS)
                .add(ItemRegistry.LETTUCE_SEEDS);

        getOrCreateTagBuilder(ItemTags.PLANKS)              //already gets basics Crafting recepies which are not bound to a specific type of plank
                .add(BlockRegistry.PALM_PLANK.asItem());
    }
}
