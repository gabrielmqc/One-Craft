package net.gabrielmazzo.onecraftmod.items;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class SapphireSwordItem {
    public static Item create() {
        return new SwordItem(ModToolsTiers.SAPPHIRE, 4, 2,  new Item.Properties());
    }
}
