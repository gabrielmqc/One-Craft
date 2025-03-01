package net.gabrielmazzo.onecraftmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.registerBlock;

public class RawSapphireBlock extends Block {
    public RawSapphireBlock(Properties properties) {
        super(properties);
    }

    public static Block create() {
        return new RawSapphireBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.NETHERITE_BLOCK));
    }
}
