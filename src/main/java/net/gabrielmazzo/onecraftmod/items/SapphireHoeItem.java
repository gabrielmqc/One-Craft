package net.gabrielmazzo.onecraftmod.items;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class SapphireHoeItem  {

    public static Item create() {
        return new HoeItem(ModToolsTiers.SAPPHIRE,  0, 0,  new Item.Properties());
    }
}
