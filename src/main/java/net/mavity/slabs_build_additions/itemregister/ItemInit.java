package net.mavity.slabs_build_additions.itemregister;

import net.mavity.slabs_build_additions.MavitysSlabsBuildAdditions;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MavitysSlabsBuildAdditions.MOD_ID, name), item);
    }




    //LOGGER
    public static void registerItemInit() {
        MavitysSlabsBuildAdditions.LOGGER.info(MavitysSlabsBuildAdditions.MOD_ID + " has registered its' items.");
    }
}
