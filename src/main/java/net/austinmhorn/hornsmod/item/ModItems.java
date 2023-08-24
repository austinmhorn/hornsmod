package net.austinmhorn.hornsmod.item;

import net.austinmhorn.hornsmod.HornsMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HornsMod.MODID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> PINK_SAPPHIRE_INGOT = ITEMS.register("pink_sapphire_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RAW_PINK_SAPPHIRE = ITEMS.register("raw_pink_sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));

    // Ruby Tools
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));

    // Ruby Armor
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RUBY_LEGGING = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB)));
    
    // Platinum Tools
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModToolTiers.PLATINUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));

    // Pink Sapphire Tools
    public static final RegistryObject<Item> PINK_SAPPHIRE_PICKAXE = ITEMS.register("pink_sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PINK_SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PINK_SAPPHIRE_SHOVEL = ITEMS.register("pink_sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.PINK_SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PINK_SAPPHIRE_AXE = ITEMS.register("pink_sapphire_axe",
            () -> new AxeItem(ModToolTiers.PINK_SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PINK_SAPPHIRE_SWORD = ITEMS.register("pink_sapphire_sword",
            () -> new SwordItem(ModToolTiers.PINK_SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.HORNSMOD_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
