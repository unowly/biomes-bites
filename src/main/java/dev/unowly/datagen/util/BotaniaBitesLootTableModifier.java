package dev.unowly.datagen.util;

import dev.unowly.item.ItemRegistry;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class BotaniaBitesLootTableModifier {
    public static final Identifier GRASS_BLOCK_ID =
            Identifier.of("minecraft", "blocks/short_grass");

    public static void mofifyLootTable() {
        LootTableEvents.MODIFY.register(((registryKey, builder, lootTableSource, wrapperLookup) -> {
            if (GRASS_BLOCK_ID.equals(registryKey.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ItemRegistry.LETTUCE))
                        .with(ItemEntry.builder(Items.WHEAT_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f))
                                .build());
                        builder.pool(poolBuilder.build());
            }
        }));
    }
}
