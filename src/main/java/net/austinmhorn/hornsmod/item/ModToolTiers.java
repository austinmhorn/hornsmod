package net.austinmhorn.hornsmod.item;

import net.austinmhorn.hornsmod.HornsMod;
import net.austinmhorn.hornsmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier RUBY;
    public static Tier PLATINUM;
    public static Tier PINK_SAPPHIRE;


    static {
        RUBY = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 9f, 3f, 24,
                        ModTags.Blocks.NEED_RUBY_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
                new ResourceLocation(HornsMod.MODID, "ruby"), List.of(Tiers.NETHERITE), List.of());
    }
    static {
        PLATINUM = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 9f, 3f, 24,
                        ModTags.Blocks.NEED_PLATINUM_TOOL, () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
                new ResourceLocation(HornsMod.MODID, "platinum"), List.of(Tiers.NETHERITE), List.of());
    }
    static {
        PINK_SAPPHIRE = TierSortingRegistry.registerTier(
                new ForgeTier(5, 2000, 9f, 3f, 24,
                        ModTags.Blocks.NEED_PINK_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.PINK_SAPPHIRE_INGOT.get())),
                new ResourceLocation(HornsMod.MODID, "pink_sapphire"), List.of(Tiers.NETHERITE), List.of());
    }
}
