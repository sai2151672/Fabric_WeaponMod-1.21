package net.saidasari.weaponmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.saidasari.weaponmod.WeaponMod;

public class ModItems {
    public static final Item CHAOS_CRYSTAL = registerItem("chaos_crystal", new Item(new Item.Settings()));
    public static final  Item ORB_OF_INSANITY = registerItem("orb_of_insanity", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WeaponMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        WeaponMod.LOGGER.info("Registering Mod Items for " + WeaponMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHAOS_CRYSTAL);
            entries.add(ORB_OF_INSANITY);
        });
    }
}
