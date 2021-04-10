package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;

public class LlamasMuds implements ModInitializer {

    public static final Item MUD_BALL = new Item(new Item,Settings().group(ItemGroup.MISC))

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("llamasmuds","mud_ball"),MUD_BALL)

	}
}
