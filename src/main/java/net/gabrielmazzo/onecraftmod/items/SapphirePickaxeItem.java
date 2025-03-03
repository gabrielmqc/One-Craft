package net.gabrielmazzo.onecraftmod.items;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;

public class SapphirePickaxeItem {

    public static Item create() {

        return new PickaxeItem(ModToolsTiers.SAPPHIRE, 1, 1,  new Item.Properties());
    }
}
