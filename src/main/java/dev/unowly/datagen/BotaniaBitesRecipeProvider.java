package dev.unowly.datagen;

import dev.unowly.item.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BotaniaBitesRecipeProvider extends FabricRecipeProvider {
    public BotaniaBitesRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

//CHEESE
                offerSmelting(
                        List.of(Items.MILK_BUCKET),
                        RecipeCategory.FOOD,
                        ItemRegistry.CHEESE_WHEEL,
                        0.1f,
                        150,
                        "cheese_wheel"
                );
                createShapeless(RecipeCategory.FOOD, ItemRegistry.CHEESE, 8)
                        .input(ItemRegistry.CHEESE_WHEEL)
                        .criterion(hasItem(ItemRegistry.CHEESE_WHEEL), conditionsFromItem(ItemRegistry.CHEESE_WHEEL))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, ItemRegistry.CHEESE_SLICE, 16)
                        .input(ItemRegistry.CHEESE)
                        .criterion(hasItem(ItemRegistry.CHEESE), conditionsFromItem(ItemRegistry.CHEESE))
                        .offerTo(exporter);
//BACON
                createShapeless(RecipeCategory.FOOD, ItemRegistry.RAW_BACON, 16)
                        .input(Items.PORKCHOP)
                        .criterion(hasItem(Items.PORKCHOP), conditionsFromItem(Items.PORKCHOP))
                        .offerTo(exporter);
                offerSmelting(
                        List.of(ItemRegistry.RAW_BACON),
                        RecipeCategory.FOOD,
                        ItemRegistry.COOKED_BACON,
                        0.1f,
                        100,
                        "cooked_bacon"
                );
//Burger
                createShapeless(RecipeCategory.FOOD, ItemRegistry.CHEESEBURGER)
                        .input(Items.COOKED_BEEF)
                        .input(Items.BREAD)
                        .input(ItemRegistry.CHEESE_SLICE)
                        .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                        .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                        .criterion(hasItem(ItemRegistry.CHEESE), conditionsFromItem(ItemRegistry.CHEESE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, ItemRegistry.HAMBURGER)
                        .input(Items.BREAD)
                        .input(Items.COOKED_BEEF)
                        .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                        .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                        .offerTo(exporter);

//SANDWICH
                createShapeless(RecipeCategory.FOOD, ItemRegistry.SANDWICH)
                        .input(Items.BREAD)
                        .input(ItemRegistry.LETTUCE)
                        .input(ItemRegistry.TOMATO)
                        .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                        .criterion(hasItem(ItemRegistry.LETTUCE), conditionsFromItem(ItemRegistry.LETTUCE))
                        .criterion(hasItem(ItemRegistry.TOMATO), conditionsFromItem(ItemRegistry.TOMATO))
                        .offerTo(exporter);

//SUSHI
                createShapeless(RecipeCategory.FOOD, ItemRegistry.SALMON_SUSHI, 16)
                        .input(Items.SEAGRASS)
                        .input(Items.SALMON)
                        .input(ItemRegistry.RICE)
                        .criterion(hasItem(Items.SEAGRASS), conditionsFromItem(Items.SEAGRASS))
                        .criterion(hasItem(Items.SALMON), conditionsFromItem(Items.SALMON))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, ItemRegistry.COD_SUSHI, 16)
                        .input(Items.SEAGRASS)
                        .input(Items.COD)
                        .input(ItemRegistry.RICE)
                        .criterion(hasItem(Items.SEAGRASS), conditionsFromItem(Items.SEAGRASS))
                        .criterion(hasItem(Items.SALMON), conditionsFromItem(Items.SALMON))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "BotaniaBitesRecipeProvider";
    }
}
