package fr.dracoraptors.justchilladdons.creativemodetab;

import fr.dracoraptors.justchilladdons.JustChillAddons;
import fr.dracoraptors.justchilladdons.block.ModBlocks;
import fr.dracoraptors.justchilladdons.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JustChillAddons.MOD_ID);

    public static final Supplier<CreativeModeTab> JUST_CHILL_ADDONS_TAB = CREATIVE_MODE_TABS.register("just_chill_addons_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
            .title(Component.translatable("creativetab.justchilladdons.just_chill_addons"))
            .displayItems((itemDisplayParameters, output) -> {
                // Add the mod's items here

                output.accept(ModItems.RUBY);
                output.accept(ModItems.STEEL_INGOT);
                output.accept(ModBlocks.RUBY_ORE);
                output.accept(ModBlocks.RUBY_DEEPSLATE_ORE);
                output.accept(ModBlocks.RUBY_BLOCK);
                output.accept(ModBlocks.STEEL_BLOCK);




            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
