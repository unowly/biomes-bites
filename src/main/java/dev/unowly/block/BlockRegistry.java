package dev.unowly.block;

import dev.unowly.BotaniaBites;
import dev.unowly.block.custom.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BlockRegistry {
    //FLOWERS

    //BUSHES
    public static final Block BLUEBERRY_BUSH = registerBlockOnly("blueberry_bush",
        BlueberryBushBlock::new,
        AbstractBlock.Settings
                .copy(Blocks.SWEET_BERRY_BUSH));

    public static final Block STRAWBERRY_BUSH = registerBlockOnly("strawberry_bush",
            StrawberryBushBlock::new,
            AbstractBlock.Settings
                    .copy(Blocks.SWEET_BERRY_BUSH).noCollision());

    //CROPS
    public static final Block  BELL_PEPPER_CROP = registerBlockOnly("bell_pepper_crop",
            BellPepperCropBlock::new,
            AbstractBlock.Settings
                    .create()
                    .nonOpaque()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP));

    public static final Block  CORN_CROP = registerBlockOnly("corn_crop",
            TomatoCropBlock::new,
            AbstractBlock.Settings
                    .create()
                    .nonOpaque()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP));

    public static final Block  TOMATO_CROP = registerBlockOnly("tomato_crop",
            TomatoCropBlock::new,
            AbstractBlock.Settings
                    .create()
                    .nonOpaque()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP));

    public static final Block LEEK_CROP = registerBlockOnly("leek_crop",
            LeekCropBlock::new,
            AbstractBlock.Settings
                    .create()
                    .nonOpaque()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP));

    public static final Block LETTUCE_CROP = registerBlockOnly("lettuce_crop",
            LeekCropBlock::new,
            AbstractBlock.Settings
                    .create()
                    .nonOpaque()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP));

    public static final Block  RICE_CROP = registerBlockOnly("rice_crop",
            RiceCropBlock::new,
            AbstractBlock.Settings
                    .create()
                    .nonOpaque()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CROP));



    private static Block registerBlockOnly(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(BotaniaBites.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        return Blocks.register(registryKey, factory, settings);
    }

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));
        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BotaniaBites.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BotaniaBites.MOD_ID, name));
    }

    public static void init() {}

}
