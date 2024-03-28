package net.mavity.slabs_build_additions.blockregister;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mavity.slabs_build_additions.MavitysSlabsBuildAdditions;
import net.mavity.slabs_build_additions.blockregister.blocktyperegister.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockInit {

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MavitysSlabsBuildAdditions.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MavitysSlabsBuildAdditions.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().maxCount(64)));
    }
    //LOGGER
    public static void registerBlockInit() {
        MavitysSlabsBuildAdditions.LOGGER.info(MavitysSlabsBuildAdditions.MOD_ID + " has registered its' blocks.");
    }
}
