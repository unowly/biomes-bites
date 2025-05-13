package dev.unowly.datagen;

import dev.unowly.block.BlockRegistry;
import dev.unowly.item.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesLootTableProvider extends FabricBlockLootTableProvider {
    public BotaniaBitesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockRegistry.TOMATO_CROP, LootTable.builder().pool(addSurvivesExplosionCondition(ItemRegistry.TOMATO, LootPool.builder()
                .rolls(new UniformLootNumberProvider(new ConstantLootNumberProvider(2), new ConstantLootNumberProvider(3)))
                .with(ItemEntry.builder(ItemRegistry.TOMATO))))
        );

        addDrop(BlockRegistry.LEEK_CROP, LootTable.builder().pool(addSurvivesExplosionCondition(ItemRegistry.LEEK, LootPool.builder()
                .rolls(new UniformLootNumberProvider(new ConstantLootNumberProvider(1), new ConstantLootNumberProvider(1)))
                .with(ItemEntry.builder(ItemRegistry.LEEK))
                .with(ItemEntry.builder(ItemRegistry.LEEK_SEEDS)))));

        addDrop(BlockRegistry.LETTUCE_CROP, LootTable.builder().pool(addSurvivesExplosionCondition(ItemRegistry.LETTUCE, LootPool.builder()
                .rolls(new UniformLootNumberProvider(new ConstantLootNumberProvider(1), new ConstantLootNumberProvider(1)))
                .with(ItemEntry.builder(ItemRegistry.LETTUCE))
                .with(ItemEntry.builder(ItemRegistry.LETTUCE_SEEDS)))));

        addDrop(BlockRegistry.CORN_CROP, LootTable.builder().pool(addSurvivesExplosionCondition(ItemRegistry.CORN, LootPool.builder()
                .rolls(new UniformLootNumberProvider(new ConstantLootNumberProvider(1), new ConstantLootNumberProvider(1)))
                .with(ItemEntry.builder(ItemRegistry.CORN))
                .with(ItemEntry.builder(ItemRegistry.CORN_SEEDS)))));
    }
}
