package dev.unowly;

import dev.unowly.block.BlockRegistry;
import dev.unowly.datagen.util.BotaniaBitesLootTableModifier;
import dev.unowly.item.ItemRegistry;
import dev.unowly.tab.BotaniaBitesBlocksCreativeTab;
import dev.unowly.tab.BotaniaBitesItemsCreativeTab;
import dev.unowly.world.feature.foliage.BotaniaBitesFoliagePlacerTypes;
import dev.unowly.world.feature.trunk.BotaniaBitesTrunkPlacerTypes;
import dev.unowly.world.gen.BotaniaBitesWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotaniaBites implements ModInitializer {
	public static final String MOD_ID = "botania-bites";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRegistry.init();
		ItemRegistry.init();

		BotaniaBitesFoliagePlacerTypes.register();
		BotaniaBitesTrunkPlacerTypes.register();

		BotaniaBitesBlocksCreativeTab.init();
		BotaniaBitesItemsCreativeTab.init();
		BotaniaBitesWorldGeneration.generateBotaniaBitesWorldGen();
		BotaniaBitesLootTableModifier.mofifyLootTable();

		StrippableBlockRegistry.register(BlockRegistry.PALM_LOG, BlockRegistry.STRIPPED_PALM_LOG);
		StrippableBlockRegistry.register(BlockRegistry.PALM_WOOD, BlockRegistry.STRIPPED_PALM_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(BlockRegistry.PALM_LOG, 5,5);
		FlammableBlockRegistry.getDefaultInstance().add(BlockRegistry.STRIPPED_PALM_LOG, 5,5);
		FlammableBlockRegistry.getDefaultInstance().add(BlockRegistry.PALM_WOOD, 5,5);
		FlammableBlockRegistry.getDefaultInstance().add(BlockRegistry.STRIPPED_PALM_WOOD, 5,5);
		FlammableBlockRegistry.getDefaultInstance().add(BlockRegistry.PALM_LEAVES, 30,60);
		FlammableBlockRegistry.getDefaultInstance().add(BlockRegistry.PALM_PLANKS, 5,20);
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}