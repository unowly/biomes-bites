package dev.unowly.data.provider;

import dev.unowly.block.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesBlockLootTableProvider extends FabricBlockLootTableProvider {
    public BotaniaBitesBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockRegistry.STONE_FLOWER);
        addPottedPlantDrops(BlockRegistry.STONE_FLOWER_POT);
    }
}
