package fr.dracoraptors.justchilladdons.block;

import fr.dracoraptors.justchilladdons.JustChillAddons;
import fr.dracoraptors.justchilladdons.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(JustChillAddons.MOD_ID);

    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final DeferredBlock<Block> RUBY_DEEPSLATE_ORE = registerBlock("ruby_deepslate_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 5), properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix())));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }
}
