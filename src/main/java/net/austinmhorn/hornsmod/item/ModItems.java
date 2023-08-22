package net.austinmhorn.hornsmod.item;

import net.austinmhorn.hornsmod.HornsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HornsMod.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> PINK_SAPPHIRE_INGOT = ITEMS.register("pink_sapphire_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RAW_PINK_SAPPHIRE = ITEMS.register("raw_pink_sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.HORNSMOD_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
