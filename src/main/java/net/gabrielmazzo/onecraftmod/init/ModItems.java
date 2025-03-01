package net.gabrielmazzo.onecraftmod.init;

import net.gabrielmazzo.onecraftmod.OneCraftMod;
import net.gabrielmazzo.onecraftmod.foods.GomuGomuNoMiFood;
import net.gabrielmazzo.onecraftmod.items.MetalDetectorItem;
import net.gabrielmazzo.onecraftmod.items.RawSapphireItem;
import net.gabrielmazzo.onecraftmod.items.SapphireItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OneCraftMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", SapphireItem::create);

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", RawSapphireItem::create);

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", MetalDetectorItem::create);

    public static final RegistryObject<Item> GOMU_GOMU_NO_MI = ITEMS.register("gomu_gomu_no_mi",
            () -> new Item(new Item.Properties().food(GomuGomuNoMiFood.GOMU_GOMU_NO_MI)));

    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff", SapphireItem::create);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

