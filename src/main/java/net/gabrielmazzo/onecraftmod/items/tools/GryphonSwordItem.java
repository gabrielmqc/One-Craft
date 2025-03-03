package net.gabrielmazzo.onecraftmod.items.tools;

import net.gabrielmazzo.onecraftmod.init.ModToolsTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class GryphonSwordItem {
    public static Item create() {
        return new SwordItem(ModToolsTiers.SAPPHIRE, 20, 5,  new Item.Properties());
    }

}
