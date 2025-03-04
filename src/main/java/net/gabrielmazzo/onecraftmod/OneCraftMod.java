package net.gabrielmazzo.onecraftmod;

import com.mojang.logging.LogUtils;
import net.gabrielmazzo.onecraftmod.entity.ModEntities;
import net.gabrielmazzo.onecraftmod.entity.client.RhinoRenderer;
import net.gabrielmazzo.onecraftmod.init.ModBlocks;
import net.gabrielmazzo.onecraftmod.init.ModCreativeModTabs;
import net.gabrielmazzo.onecraftmod.init.ModItems;
import net.gabrielmazzo.onecraftmod.loot.ModLootModifiers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(OneCraftMod.MOD_ID)
public class OneCraftMod
{
    public static final String MOD_ID = "onecraftmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public OneCraftMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);
        }
        {

        }
    }

}
