package net.gabrielmazzo.onecraftmod.items.armors;

import net.gabrielmazzo.onecraftmod.init.ModArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class SapphireHelmetItem {
    public static Item create() {
        return new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties());
    }
}
