package net.gabrielmazzo.onecraftmod.init;

import net.gabrielmazzo.onecraftmod.OneCraftMod;
import net.gabrielmazzo.onecraftmod.foods.GomuGomuNoMiFood;
import net.gabrielmazzo.onecraftmod.items.*;
import net.gabrielmazzo.onecraftmod.items.armors.SapphireBootsItem;
import net.gabrielmazzo.onecraftmod.items.armors.SapphireChestPlateItem;
import net.gabrielmazzo.onecraftmod.items.armors.SapphireHelmetItem;
import net.gabrielmazzo.onecraftmod.items.armors.SapphireLeggingsItem;
import net.gabrielmazzo.onecraftmod.items.tools.*;
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

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", SapphirePickaxeItem::create);
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", SapphireSwordItem::create);
    public static final RegistryObject<Item> GRYPHON_SWORD = ITEMS.register("gryphon_sword", GryphonSwordItem::create);
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", SapphireAxeItem::create);
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", SapphireShovelItem::create);
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", SapphireHoeItem::create);
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", SapphireHelmetItem ::create);
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", SapphireChestPlateItem::create);
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", SapphireLeggingsItem::create);
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", SapphireBootsItem::create);
    public static final RegistryObject<Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff", SapphireItem::create);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

