package net.austinmhorn.hornsmod.world.dimension;

import net.austinmhorn.hornsmod.HornsMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
    public static final ResourceKey<Level> MOON_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(HornsMod.MODID, "moon"));

    public static final ResourceKey<DimensionType> MOON_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY,
                    new ResourceLocation(HornsMod.MODID, "moon"));

    public static void register() {
        System.out.println("Registering ModDimensions for " + HornsMod.MODID);
    }
}
