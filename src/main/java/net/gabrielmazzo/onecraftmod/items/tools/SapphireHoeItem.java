package net.gabrielmazzo.onecraftmod.items.tools;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;

public class SapphireHoeItem {
    public static Item create() {
        return new HoeItem(ModToolsTiers.SAPPHIRE,  0, 0,  new Item.Properties());
    }
}
