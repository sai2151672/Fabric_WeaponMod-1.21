package net.saidasari.weaponmod;

import net.fabricmc.api.ModInitializer;

import net.saidasari.weaponmod.block.ModBlocks;
import net.saidasari.weaponmod.item.ModItemGroups;
import net.saidasari.weaponmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeaponMod implements ModInitializer {
	public static final String MOD_ID = "weaponmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
	}
}