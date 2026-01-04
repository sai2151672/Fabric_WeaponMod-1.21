package net.saidasari.weaponmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.saidasari.weaponmod.WeaponMod;
import net.saidasari.weaponmod.block.ModBlocks;
import net.saidasari.weaponmod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> INSANITY_ORB_SMELTABLES = List.of(ModItems.CHAOS_CRYSTAL);
        offerSmelting(recipeExporter, INSANITY_ORB_SMELTABLES, RecipeCategory.MISC, ModItems.ORB_OF_INSANITY, 0.5f, 200, "orb_of_insanity");
        offerBlasting(recipeExporter, INSANITY_ORB_SMELTABLES, RecipeCategory.MISC, ModItems.ORB_OF_INSANITY, 0.5f, 100, "orb_of_insanity");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.CHAOS_CRYSTAL, RecipeCategory.DECORATIONS, ModBlocks.CHAOS_CRYSTAL_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, ModItems.ORB_OF_INSANITY, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_INSANITY_ORBS);

//        Examples of other uses for Recipes
//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_INSANITY_ORBS)
//                .pattern("RRR")
//                .pattern("RRR")
//                .pattern("RRR")
//                .input('R', ModItems.ORB_OF_INSANITY)
//                .criterion(hasItem(ModItems.ORB_OF_INSANITY), conditionsFromItem(ModItems.ORB_OF_INSANITY));

//        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORB_OF_INSANITY, 9)
//                .input(ModBlocks.BLOCK_OF_INSANITY_ORBS)
//                .criterion(hasItem(ModBlocks.BLOCK_OF_INSANITY_ORBS), conditionsFromItem(ModBlocks.BLOCK_OF_INSANITY_ORBS))
//                .offerTo(recipeExporter, Identifier.of(WeaponMod.MOD_ID, "insanity_orbs_from_block_of_insanity_orbs"));

    }
}
