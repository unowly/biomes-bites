package dev.unowly.data.provider;

import dev.unowly.block.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BotaniaBitesBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(BlockRegistry.STONE_FLOWER);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(BlockRegistry.STONE_FLOWER_POT);
    }
}
