package net.austinmhorn.hornsmod;

import com.mojang.logging.LogUtils;
import net.austinmhorn.hornsmod.block.ModBlocks;
import net.austinmhorn.hornsmod.screen.GemInfusingStationScreen;
import net.austinmhorn.hornsmod.block.entity.ModBlockEntities;
import net.austinmhorn.hornsmod.item.ModItems;
import net.austinmhorn.hornsmod.screen.ModMenuTypes;
import net.austinmhorn.hornsmod.world.biomemods.ModBiomeModifiers;
import net.austinmhorn.hornsmod.world.dimension.ModDimensions;
import net.austinmhorn.hornsmod.world.feature.ModConfiguredFeatures;
import net.austinmhorn.hornsmod.world.feature.ModPlacedFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HornsMod.MODID)
public class HornsMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "hornsmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public HornsMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register ModItems
        ModItems.register(modEventBus);
        // Register ModBlocks
        ModBlocks.register(modEventBus);
        // Register ModConfiguredFeatures
        ModConfiguredFeatures.register(modEventBus);

        // Register ModBLockEntities
        ModBlockEntities.register(modEventBus);
        // Register ModMenuTypes
        ModMenuTypes.register(modEventBus);
        // Register ModDimensions
        ModDimensions.register();

        // Register ModBiomeModifiers
        ModBiomeModifiers.register(modEventBus);
        // Register ModPlacedFeatures
        ModPlacedFeatures.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            MenuScreens.register(ModMenuTypes.GEM_INFUSING_STATION_MENU.get(), GemInfusingStationScreen::new);
        }
    }
}
