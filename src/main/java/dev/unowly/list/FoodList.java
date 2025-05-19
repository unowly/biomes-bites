package dev.unowly.list;

import net.minecraft.component.type.FoodComponent;

public class FoodList {

//BURGER
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(2f)
            .build();

    public static final FoodComponent CHEESEBURGER = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(2.5f)
            .build();

//SANDWICH
    public static final FoodComponent SANDWICH = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.5f)
            .build();
//SUSHI
    public static final FoodComponent SALMON_SUSHI = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(1.2f)
            .build();

    public static final FoodComponent COD_SUSHI = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(1.2f)
            .build();

//CHEESE
    public static final FoodComponent CHEESE_WHEEL = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(2f)
            .build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .build();
    public static final FoodComponent CHEESE_SLICE = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .build();
//BACON
    public static final FoodComponent RAW_BACON = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .build();
    public static final FoodComponent COOKED_BACON = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(0.6f)
            .build();

//FRUITS AND BUSHES
    public static final FoodComponent AVOCADO = new FoodComponent.Builder()
        .nutrition(2)
        .saturationModifier(0.3f)
        .build();

    public static final FoodComponent BANANA = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent CHERRY = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent GRAPE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent KIWI = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent LEMON = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent PEACH = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent PEAR = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent POMEGRANATE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

//VEGETABLES AND CROPS
    public static final FoodComponent BELL_PEPPER = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent CORN = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent TOMATO = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent LEEK = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();

    public static final FoodComponent LETTUCE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.3f)
            .build();
}
