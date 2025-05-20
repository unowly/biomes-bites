package dev.unowly.datagen;

import dev.unowly.block.BlockRegistry;
import dev.unowly.block.custom.*;
import dev.unowly.item.ItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.state.property.IntProperty;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesLootTableProvider extends FabricBlockLootTableProvider {
    public BotaniaBitesLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockRegistry.TOMATO_CROP, createCropLootTable(
                BlockRegistry.TOMATO_CROP, ItemRegistry.TOMATO, null, TomatoCropBlock.AGE));

        addDrop(BlockRegistry.LEEK_CROP, createCropLootTable(
                BlockRegistry.LEEK_CROP, ItemRegistry.LEEK, ItemRegistry.LEEK_SEEDS, LeekCropBlock.AGE));

        addDrop(BlockRegistry.LETTUCE_CROP, createCropLootTable(
                BlockRegistry.LETTUCE_CROP, ItemRegistry.LETTUCE, ItemRegistry.LETTUCE_SEEDS, LettuceCropBlock.AGE));

        addDrop(BlockRegistry.CORN_CROP, createCropLootTable(
                BlockRegistry.CORN_CROP, ItemRegistry.CORN, ItemRegistry.CORN_SEEDS, CornCropBlock.AGE));

        addDrop(BlockRegistry.BELL_PEPPER_CROP, createCropLootTable(
                BlockRegistry.BELL_PEPPER_CROP, ItemRegistry.BELL_PEPPER, ItemRegistry.BELL_PEPPER_SEEDS, BellPepperCropBlock.AGE));

        addDrop(BlockRegistry.RICE_CROP, createCropLootTable(
                BlockRegistry.RICE_CROP, ItemRegistry.RICE, ItemRegistry.RICE_SEEDS, RiceCropBlock.AGE));

        //Palm Drops
        addDrop(BlockRegistry.PALM_LOG);
        addDrop(BlockRegistry.STRIPPED_PALM_LOG);
        addDrop(BlockRegistry.PALM_WOOD);
        addDrop(BlockRegistry.STRIPPED_PALM_WOOD);
        addDrop(BlockRegistry.PALM_PLANKS);
        addDrop(BlockRegistry.PALM_SAPLING);
        addDrop(BlockRegistry.PALM_LEAVES, leavesDrops(BlockRegistry.PALM_LEAVES,BlockRegistry.PALM_SAPLING, 0.0625F));

    }

    private LootTable.Builder createCropLootTable(Block cropBlock, Item cropItem, Item seedItem, IntProperty ageProperty) {
        LootPool.Builder pool = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(BlockStatePropertyLootCondition.builder(cropBlock)
                        .properties(StatePredicate.Builder.create()
                                .exactMatch(ageProperty, ageProperty.getValues().stream().max(Integer::compareTo).orElse(0))))
                .with(ItemEntry.builder(cropItem)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 3.0f))));

        if (seedItem != null) {
            pool.with(ItemEntry.builder(seedItem)
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 3.0f))));
        }

        return LootTable.builder().pool(pool);
    }

}
