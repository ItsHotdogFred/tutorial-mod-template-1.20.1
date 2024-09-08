package net.fred.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fred.tutorialmod.item.ModItemGroups;
import net.fred.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}