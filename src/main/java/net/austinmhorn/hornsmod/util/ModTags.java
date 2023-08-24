package net.austinmhorn.hornsmod.util;

import net.austinmhorn.hornsmod.HornsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
    public static final TagKey<Block> NEED_RUBY_TOOL
            = tag("needs_ruby_tool");
        public static final TagKey<Block> NEED_PLATINUM_TOOL
                = tag("needs_platinum_tool");

        public static final TagKey<Block> NEED_PINK_SAPPHIRE_TOOL
                = tag("needs_pink_sapphire_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(HornsMod.MODID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }
}
