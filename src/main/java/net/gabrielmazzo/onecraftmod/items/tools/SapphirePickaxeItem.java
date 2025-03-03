package net.gabrielmazzo.onecraftmod.items.tools;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;

public class SapphirePickaxeItem {

    public static Item create() {

        return new PickaxeItem(ModToolsTiers.SAPPHIRE, 1, 1,  new Item.Properties());
    }
}
