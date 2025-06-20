package dev.unowly;

import dev.unowly.block.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

public class BotaniaBitesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
//BUSHES
		BlockRenderLayerMap.putBlocks(BlockRenderLayer.CUTOUT, BlockRegistry.BLUEBERRY_BUSH, BlockRegistry.STRAWBERRY_BUSH);

//CROPS
		BlockRenderLayerMap.putBlocks(BlockRenderLayer.CUTOUT, BlockRegistry.TOMATO_CROP, BlockRegistry.LEEK_CROP,
				BlockRegistry.LETTUCE_CROP, BlockRegistry.CORN_CROP, BlockRegistry.BELL_PEPPER_CROP, BlockRegistry.RICE_CROP);
	}
}