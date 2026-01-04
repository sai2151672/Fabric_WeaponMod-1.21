package net.saidasari.weaponmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.saidasari.weaponmod.datagen.*;

public class WeaponModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
	FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

	pack.addProvider(ModItemTagProvider::new);
	pack.addProvider(ModBlockTagProvider::new);
	pack.addProvider(ModLootTableProvider::new);
	pack.addProvider(ModModelProvider::new);
	pack.addProvider(ModRecipeProvider::new);
	}
}
