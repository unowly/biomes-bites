package dev.unowly.world.feature.trunk;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class PalmTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<PalmTrunkPlacer> MAP_CODEC = RecordCodecBuilder.mapCodec(
            instance -> fillTrunkPlacerFields(instance)
                    .apply(instance, PalmTrunkPlacer::new)
    );

    public static final Codec<PalmTrunkPlacer> CODEC = MAP_CODEC.codec();


    public PalmTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
       return BotaniaBitesTrunkPlacerTypes.PALM_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(
            TestableWorld world,
            BiConsumer<BlockPos, BlockState> replacer,
            Random random,
            int height,
            BlockPos startPos,
            TreeFeatureConfig config
    ) {
        Direction direction = Direction.Type.HORIZONTAL.random(random);
        BlockPos.Mutable mutable = startPos.mutableCopy();
        BlockPos groundPos = mutable.down();

        setToDirt(world, replacer, random, groundPos, config);

        for (int y = 0; y < height - 1; y++) {
            if (random.nextBoolean() && y > 1) {
                mutable.move(direction);
            }

            if (TreeFeature.canReplace(world, mutable)) {
                this.getAndSetState(world, replacer, random, mutable, config);
            }

            mutable.move(Direction.UP);
        }

        if (TreeFeature.canReplace(world, mutable)) {
            this.getAndSetState(world, replacer, random, mutable, config);
        }

        List<FoliagePlacer.TreeNode> list = new ArrayList<>();
        list.add(new FoliagePlacer.TreeNode(mutable.toImmutable(), 0, false));

        return list;
    }

}
