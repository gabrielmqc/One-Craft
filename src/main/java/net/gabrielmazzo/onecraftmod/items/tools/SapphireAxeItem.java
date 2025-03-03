package net.gabrielmazzo.onecraftmod.items.tools;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class SapphireAxeItem {
    public static Item create() {
        return new AxeItem(ModToolsTiers.SAPPHIRE, 7, 1, new Item.Properties());
    }
}
