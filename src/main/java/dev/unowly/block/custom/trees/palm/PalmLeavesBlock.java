package dev.unowly.block.custom.trees.palm;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class PalmLeavesBlock extends LeavesBlock {
    public PalmLeavesBlock(float leafParticleChance, Settings settings) {
        super(leafParticleChance, settings);
    }

    @Override
    public MapCodec<? extends LeavesBlock> getCodec() {
        return null;
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {

    }
}
