package fr.dracoraptors.justchilladdons.item;

import fr.dracoraptors.justchilladdons.JustChillAddons;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JustChillAddons.MOD_ID);
    // This line alone adds an item (but you need a texture for it too!)
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.registerSimpleItem("steel_ingot");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
