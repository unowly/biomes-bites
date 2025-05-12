package dev.unowly.item;

import dev.unowly.BotaniaBites;
import dev.unowly.block.BlockRegistry;
import dev.unowly.list.FoodList;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ItemRegistry {


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

    public static final Item CORN = register("corn",
            settings ->  new Item(settings.food(FoodList.CORN)));

    public static final Item TOMATO = register("tomato",
            settings ->  new BlockItem(BlockRegistry.TOMATO_CROP, settings
                    .food(FoodList.TOMATO)));

    public static final Item LEEK = register("leek",
            settings ->  new Item(settings.food(FoodList.LEEK)));

    public static final Item LETTUCE = register("lettuce",
            settings ->  new Item(settings.food(FoodList.LETTUCE)));


    public static Item register(String name, Function<Item.Settings, Item> factory) {
        RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BotaniaBites.MOD_ID, name));
        Item.Settings settings = new Item.Settings().registryKey(registryKey);
        return Registry.register(Registries.ITEM, registryKey.getValue(), factory.apply(settings));
    }


    public static void init(){}
}
