package net.saidasari.weaponmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.saidasari.weaponmod.WeaponMod;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(WeaponMod.MOD_ID, name));
        }
    }

    public static class Items {
//        Example:
        public static final TagKey<Item> EXAMPLE_ITEMS = createTag("example_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(WeaponMod.MOD_ID, name));
        }
    }
}
