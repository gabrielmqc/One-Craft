package net.gabrielmazzo.onecraftmod.items;

import net.minecraft.world.item.Item;

public class SapphireItem extends Item {
    public SapphireItem(Properties properties) {
        super(properties);
    }

    public static Item create() {
        return new SapphireItem(new Item.Properties());
    }
}
