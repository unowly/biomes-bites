package dev.unowly.item;

import dev.unowly.BotaniaBites;
import dev.unowly.block.BlockRegistry;
import dev.unowly.list.FoodList;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class ItemRegistry {

//BURGER
    public static final Item HAMBURGER = register("hamburger",
            settings ->  new Item(settings.food(FoodList.HAMBURGER).maxCount(16).rarity(Rarity.RARE)));

    public static final Item CHEESEBURGER = register("cheeseburger",
            settings ->  new Item(settings.food(FoodList.CHEESEBURGER).maxCount(16).rarity(Rarity.RARE)));

//SANDWICH
    public static final Item SANDWICH = register("sandwich",
            settings ->  new Item(settings.food(FoodList.SANDWICH).maxCount(16)));

//SUSHI
    public static final Item SALMON_SUSHI = register("salmon_sushi",
            settings ->  new Item(settings.food(FoodList.SALMON_SUSHI).maxCount(16)));

    public static final Item COD_SUSHI = register("cod_sushi",
            settings ->  new Item(settings.food(FoodList.COD_SUSHI).maxCount(16)));

//CHEESE
    public static final Item CHEESE_WHEEL = register("cheese_wheel",
            settings -> new Item(settings.food(FoodList.CHEESE_WHEEL).maxCount(16)));

    public static final Item CHEESE = register("cheese",
            settings ->  new Item(settings.food(FoodList.CHEESE).maxCount(64)));

    public static final Item CHEESE_SLICE = register("cheese_slice",
            settings -> new Item(settings.food(FoodList.CHEESE_SLICE).maxCount(64)));

//BACON
    public static final Item RAW_BACON =register("raw_bacon",
            settings -> new Item(settings.food(FoodList.RAW_BACON).maxCount(64)));

    public static final Item COOKED_BACON =register("cooked_bacon",
            settings -> new Item(settings.food(FoodList.COOKED_BACON).maxCount(64)));

//BUSHES
public static final Item BLUEBERRY = register("blueberry",
        settings ->  new BlockItem(BlockRegistry.BLUEBERRY_BUSH, settings
                .food(FoodList.BLUEBERRY)));

    public static final Item STRAWBERRY = register("strawberry",
            settings ->  new BlockItem(BlockRegistry.STRAWBERRY_BUSH, settings
                    .food(FoodList.STRAWBERRY)));

//FLOWERS

//FRUITS
public static final Item AVOCADO = register("avocado",
        settings ->  new Item(settings.food(FoodList.AVOCADO)));

    public static final Item BANANA = register("banana",
            settings ->  new Item(settings.food(FoodList.BANANA)));

    public static final Item CHERRY = register("cherry",
            settings ->  new Item(settings.food(FoodList.CHERRY)));

    public static final Item GRAPE = register("grape",
            settings ->  new Item(settings.food(FoodList.GRAPE)));

    public static final Item KIWI = register("kiwi",
            settings ->  new Item(settings.food(FoodList.KIWI)));

    public static final Item LEMON = register("lemon",
            settings ->  new Item(settings.food(FoodList.LEMON)));

    public static final Item PEACH = register("peach",
            settings ->  new Item(settings.food(FoodList.PEACH)));

    public static final Item PEAR = register("pear",
            settings ->  new Item(settings.food(FoodList.PEAR)));

    public static final Item PINEAPPLE = register("pineapple",
            settings ->  new Item(settings.food(FoodList.PINEAPPLE)));

    public static final Item POMEGRANATE = register("pomegranate",
            settings ->  new Item(settings.food(FoodList.POMEGRANATE)));

//VEGETABLES AND CROPS
    public static final Item BELL_PEPPER = register("bell_pepper",
            settings ->  new Item(settings.food(FoodList.BELL_PEPPER)));

    public static final Item BELL_PEPPER_SEEDS = register("bell_pepper_seeds",
            settings ->  new BlockItem(BlockRegistry.BELL_PEPPER_CROP, settings));

    public static final Item CORN = register("corn",
            settings ->  new Item(settings.food(FoodList.CORN)));

    public static final Item CORN_SEEDS = register("corn_seeds",
            settings ->  new BlockItem(BlockRegistry.CORN_CROP, settings));

    public static final Item TOMATO = register("tomato",
            settings ->  new BlockItem(BlockRegistry.TOMATO_CROP, settings.food(FoodList.TOMATO)));

    public static final Item LEEK = register("leek",
            settings ->  new Item(settings.food(FoodList.LEEK)));

    public static final Item LEEK_SEEDS = register("leek_seeds",
            settings ->  new BlockItem(BlockRegistry.LEEK_CROP, settings));

    public static final Item LETTUCE = register("lettuce",
            settings ->  new Item(settings.food(FoodList.LETTUCE)));

    public static final Item LETTUCE_SEEDS = register("lettuce_seeds",
            settings ->  new BlockItem(BlockRegistry.LETTUCE_CROP, settings));

    //Palm
    public static final Item PALM_LOG = register(
            "palm_log",
            settings -> new BlockItem(BlockRegistry.PALM_LOG, settings)
    );
    public static final Item STRIPPED_PALM_LOG = register(
            "stripped_palm_log",
            settings -> new BlockItem(BlockRegistry.STRIPPED_PALM_LOG, settings)
    );
    public static final Item PALM_WOOD = register(
            "palm_wood",
            settings -> new BlockItem(BlockRegistry.PALM_WOOD, settings)
    );
    public static final Item STRIPPED_PALM_WOOD = register(
            "stripped_palm_wood",
            settings -> new BlockItem(BlockRegistry.STRIPPED_PALM_WOOD, settings)
    );
    public static final Item PALM_PLANKS = register(
            "palm_planks",
            settings -> new BlockItem(BlockRegistry.PALM_PLANKS, settings)
    );
    public static final Item PALM_LEAVES = register(
            "palm_leaves",
            settings -> new BlockItem(BlockRegistry.PALM_LEAVES, settings)
    );
    public static final Item PALM_SAPLING = register(
            "palm_sapling",
            settings -> new BlockItem(BlockRegistry.PALM_SAPLING, settings)
    );


    public static Item register(String name, Function<Item.Settings, Item> factory) {
        RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BotaniaBites.MOD_ID, name));
        Item.Settings settings = new Item.Settings().registryKey(registryKey);
        return Registry.register(Registries.ITEM, registryKey.getValue(), factory.apply(settings));
    }


    public static void init(){}
}
