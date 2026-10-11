package fr.dracoraptors.justchilladdons.datagen;

import fr.dracoraptors.justchilladdons.JustChillAddons;
import fr.dracoraptors.justchilladdons.block.ModBlocks;
import fr.dracoraptors.justchilladdons.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, JustChillAddons.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.STEEL_INGOT.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(ModBlocks.RUBY_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RUBY_DEEPSLATE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RUBY_ORE.get());
        blockModels.createTrivialCube(ModBlocks.STEEL_BLOCK.get());

    }
}
