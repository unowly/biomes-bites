package dev.unowly.datagen.tags;

import dev.unowly.BotaniaBites;
import dev.unowly.block.BlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesBlockTagProvider extends FabricTagProvider {
    public static final TagKey<Block> BOTANIA_BITES_BLOCKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(BotaniaBites.MOD_ID, "botania_bites_blocks"));

    public BotaniaBitesBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(BlockRegistry.PALM_LOG)
                .add(BlockRegistry.PALM_WOOD)
                .add(BlockRegistry.STRIPPED_PALM_LOG)
                .add(BlockRegistry.STRIPPED_PALM_WOOD);

    }
}
