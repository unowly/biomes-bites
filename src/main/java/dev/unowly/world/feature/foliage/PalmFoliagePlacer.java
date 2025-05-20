package dev.unowly.world.feature.foliage;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class PalmFoliagePlacer extends FoliagePlacer {

    public static final MapCodec<PalmFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(
            instance -> fillFoliagePlacerFields(instance)
                    .apply(instance, PalmFoliagePlacer::new)
    );

    public PalmFoliagePlacer(IntProvider radius, IntProvider offset) {
        super(radius, offset);
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.PALM_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(
            TestableWorld world,
            BlockPlacer placer,
            Random random,
            TreeFeatureConfig config,
            int trunkHeight,
            TreeNode treeNode,
            int foliageHeight,
            int radius,
            int offset
    ) {
        BlockPos center = treeNode.getCenter().up(offset);

        if (offset == foliageHeight) {
            BlockPos pos = treeNode.getCenter();
            if (!(pos.getX() % 2 == 0 && pos.getZ() % 2 == 0)) {
                placeFoliageBlock(world, placer, random, config, center);
                placeFoliageBlock(world, placer, random, config, center.up());
                placeFoliageBlock(world, placer, random, config, center.add(1,1,0));
                placeFoliageBlock(world, placer, random, config, center.add(0,1,1));
                placeFoliageBlock(world, placer, random, config, center.add(-1,1,0));
                placeFoliageBlock(world, placer, random, config, center.add(0,1,-1));

                placeFoliageBlock(world, placer, random, config, center.add(1,0,0));
                placeFoliageBlock(world, placer, random, config, center.add(0,0,1));
                placeFoliageBlock(world, placer, random, config, center.add(0,0,-1));
                placeFoliageBlock(world, placer, random, config, center.add(-1,0,0));
                placeFoliageBlock(world, placer, random, config, center.add(1,0,-1));
                placeFoliageBlock(world, placer, random, config, center.add(1,0,1));
                placeFoliageBlock(world, placer, random, config, center.add(-1,0,1));
                placeFoliageBlock(world, placer, random, config, center.add(-1,0,-1));

                placeFoliageBlock(world, placer, random, config, center.add(2,0,0));
                placeFoliageBlock(world, placer, random, config, center.add(0,0,2));
                placeFoliageBlock(world, placer, random, config, center.add(0,0,-2));
                placeFoliageBlock(world, placer, random, config, center.add(-2,0,0));

                placeFoliageBlock(world, placer, random, config, center.add(-3,-1,0));
                placeFoliageBlock(world, placer, random, config, center.add(3,-1,0));
                placeFoliageBlock(world, placer, random, config, center.add(0,-1,-3));
                placeFoliageBlock(world, placer, random, config, center.add(0,-1,3));

                placeFoliageBlock(world, placer, random, config, center.add(2,-1,2));
                placeFoliageBlock(world, placer, random, config, center.add(-2,-1,2));
                placeFoliageBlock(world, placer, random, config, center.add(2,-1,-2));
                placeFoliageBlock(world, placer, random, config, center.add(-2,-1,-2));




            }
        }




    }

    private boolean checkForSourroundingLeaves(TestableWorld world, TreeNode treeNode, int offset) {
        BlockPos center = treeNode.getCenter().up(offset);

        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                if (!world.testBlockState(center.add(x, 0, z), BlockState::isAir)) {
                    return false; // es ist etwas da
                }
            }
        }

        return true;
    }



    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return 1; // Beispielwert
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
