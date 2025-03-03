package net.gabrielmazzo.onecraftmod.items.armors;

import net.gabrielmazzo.onecraftmod.init.ModArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

public class SapphireBootsItem {

    public static Item create() {
       return new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties());
    }
}
