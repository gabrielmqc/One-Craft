package net.gabrielmazzo.onecraftmod.init;

import net.gabrielmazzo.onecraftmod.OneCraftMod;
import net.gabrielmazzo.onecraftmod.blocks.RawSapphireBlock;
import net.gabrielmazzo.onecraftmod.blocks.SapphireBlock;
import net.gabrielmazzo.onecraftmod.blocks.SapphireOreBlock;
import net.gabrielmazzo.onecraftmod.blocks.SoundBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OneCraftMod.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", SapphireBlock::create);
    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block", RawSapphireBlock::create);
    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", SapphireOreBlock::create);
    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block", SoundBlock::create);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
       //essa linha aqui registra o Bloco em si
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        //E essa aqui registra o item do bloco que aparece pra gente no inventário
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
