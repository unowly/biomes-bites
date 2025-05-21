package dev.unowly.world.tree;

import dev.unowly.BotaniaBites;
import dev.unowly.world.BotaniaBitesConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class BotaniaBitesSaplingGenerators {
    public static final SaplingGenerator PALM = new SaplingGenerator(BotaniaBites.MOD_ID + ":palm", Optional.empty(),Optional.of(BotaniaBitesConfiguredFeatures.PALM_TREE_KEY),Optional.empty());
}
