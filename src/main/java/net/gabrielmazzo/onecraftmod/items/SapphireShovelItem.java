package net.gabrielmazzo.onecraftmod.items;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;


public class SapphireShovelItem {

    public static Item create() {
        return new ShovelItem(ModToolsTiers.SAPPHIRE,  0, 0, new Item.Properties());    }
}
