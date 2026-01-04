package net.saidasari.weaponmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.saidasari.weaponmod.WeaponMod;

public class ModBlocks {

    public static final Block CHAOS_ORE = registerBlock("chaos_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static final Block CHAOS_CRYSTAL_BLOCK = registerBlock("chaos_crystal_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static final Block CHAOS_DEEPSLATE_ORE = registerBlock("chaos_deepslate_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.SCULK)));

    public static final Block BLOCK_OF_INSANITY_ORBS = registerBlock("block_of_insanity_orbs",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.SCULK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(WeaponMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(WeaponMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        WeaponMod.LOGGER.info("Registering Mod Blocks for " + WeaponMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CHAOS_ORE);
            entries.add(ModBlocks.CHAOS_CRYSTAL_BLOCK);
            entries.add(ModBlocks.CHAOS_DEEPSLATE_ORE);
            entries.add(ModBlocks.BLOCK_OF_INSANITY_ORBS);
        });
    }

}
