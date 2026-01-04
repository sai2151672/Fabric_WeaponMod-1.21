package net.saidasari.weaponmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.saidasari.weaponmod.WeaponMod;
import net.saidasari.weaponmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup CHAOS_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WeaponMod.MOD_ID, "chaos_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHAOS_CRYSTAL))
                    .displayName(Text.translatable("itemgroup.weaponmod.chaos_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHAOS_CRYSTAL);
                        entries.add(ModItems.ORB_OF_INSANITY);

                    })

                    .build());

    public static final ItemGroup CHAOS_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WeaponMod.MOD_ID, "chaos_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CHAOS_CRYSTAL_BLOCK))
                    .displayName(Text.translatable("itemgroup.weaponmod.chaos_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHAOS_ORE);
                        entries.add(ModBlocks.CHAOS_DEEPSLATE_ORE);
                        entries.add(ModBlocks.CHAOS_CRYSTAL_BLOCK);
                        entries.add(ModBlocks.BLOCK_OF_INSANITY_ORBS);

                    })

                    .build());

    public static void registerItemGroups() {
        WeaponMod.LOGGER.info("Registering Item Groups for " + WeaponMod.MOD_ID);
    }
}
