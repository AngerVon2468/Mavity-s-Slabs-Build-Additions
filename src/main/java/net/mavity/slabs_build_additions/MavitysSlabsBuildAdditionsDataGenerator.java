package net.mavity.slabs_build_additions;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MavitysSlabsBuildAdditionsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

	}

	public static void registerMSBADataGen() {
		MavitysSlabsBuildAdditions.LOGGER.info(MavitysSlabsBuildAdditions.MOD_ID + " has registered its' Data Generator.");
	}
}
