package dev.unowly;

import dev.unowly.block.BlockRegistry;
import dev.unowly.item.ItemRegistry;
import dev.unowly.tab.BotaniaBitesBlocksCreativeTab;
import dev.unowly.tab.BotaniaBitesItemsCreativeTab;
import dev.unowly.world.gen.BotaniaBitesWorldGeneration;
import net.fabricmc.api.ModInitializer;

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

		BotaniaBitesBlocksCreativeTab.init();
		BotaniaBitesItemsCreativeTab.init();
		BotaniaBitesWorldGeneration.generateBotaniaBitesWorldGen();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}