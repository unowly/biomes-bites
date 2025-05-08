package dev.unowly;

import dev.unowly.block.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class BotaniaBitesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockRegistry.BLUEBERRY_BUSH, BlockRegistry.STRAWBERRY_BUSH,BlockRegistry.STONE_FLOWER);
	}
}