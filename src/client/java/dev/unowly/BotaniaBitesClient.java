package dev.unowly;

import dev.unowly.block.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class BotaniaBitesClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
//BUSHES
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockRegistry.BLUEBERRY_BUSH, BlockRegistry.STRAWBERRY_BUSH);

//CROPS
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockRegistry.TOMATO_CROP, BlockRegistry.LEEK_CROP, BlockRegistry.LETTUCE_CROP, BlockRegistry.CORN_CROP, BlockRegistry.BELL_PEPPER_CROP);
	}
}