package com.oecklab.chinesecuisines;

import com.oecklab.chinesecuisines.item.ModItemGroups;
import com.oecklab.chinesecuisines.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChineseCuisines implements ModInitializer {
	public static final String MOD_ID = "chinese_cuisines";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}