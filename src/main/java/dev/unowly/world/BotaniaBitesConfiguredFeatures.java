package dev.unowly.world;

import dev.unowly.BotaniaBites;
import dev.unowly.block.BlockRegistry;
import dev.unowly.world.feature.foliage.PalmFoliagePlacer;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;

import java.util.List;

public class BotaniaBitesConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> STRAWBERRY_BUSH_KEY = registerKey("strawberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH_KEY = registerKey("blueberry_bush");

    public static final RegistryKey<ConfiguredFeature<?,?>> PALM_TREE_KEY = registerKey("palm_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context ){
    //BUSHES
        register(context, STRAWBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(BlockRegistry.STRAWBERRY_BUSH.getDefaultState()
                                .with(SweetBerryBushBlock.AGE, 3))),
                        List.of(Blocks.GRASS_BLOCK)));
        register(context, BLUEBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(BlockRegistry.BLUEBERRY_BUSH.getDefaultState()
                                .with(SweetBerryBushBlock.AGE, 3))),
                        List.of(Blocks.GRASS_BLOCK)));


       //Palm Tree
        register(context, PALM_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BlockRegistry.PALM_LOG),
                new BendingTrunkPlacer(2,3,5,7,ConstantIntProvider.create(1)),
                BlockStateProvider.of(BlockRegistry.PALM_LEAVES),
                new PalmFoliagePlacer(ConstantIntProvider.create(1),ConstantIntProvider.create(1)),
                new TwoLayersFeatureSize(0, 0, 0)
        )     .dirtProvider(BlockStateProvider.of(Blocks.SAND))
                .forceDirt()
                .ignoreVines()
                .build());


    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BotaniaBites.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
