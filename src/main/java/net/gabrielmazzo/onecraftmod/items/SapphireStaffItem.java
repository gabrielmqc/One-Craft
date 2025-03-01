package net.gabrielmazzo.onecraftmod.items;

import net.minecraft.world.item.Item;

public class SapphireStaffItem extends Item {
    public SapphireStaffItem(Properties properties) {
        super(properties);
    }

    public static Item create() {
        return new SapphireStaffItem(new Item.Properties().stacksTo(1));
    }
}
