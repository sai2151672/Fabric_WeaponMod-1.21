package net.saidasari.weaponmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.saidasari.weaponmod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHAOS_CRYSTAL_BLOCK)
                .add(ModBlocks.CHAOS_ORE)
                .add(ModBlocks.CHAOS_DEEPSLATE_ORE)
                .add(ModBlocks.BLOCK_OF_INSANITY_ORBS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CHAOS_CRYSTAL_BLOCK)
                .add(ModBlocks.BLOCK_OF_INSANITY_ORBS);
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.CHAOS_ORE)
                .add(ModBlocks.CHAOS_DEEPSLATE_ORE);


    }
}
