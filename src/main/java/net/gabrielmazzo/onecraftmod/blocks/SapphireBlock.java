package net.gabrielmazzo.onecraftmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SapphireBlock extends Block {
    public SapphireBlock(Properties properties) {
        super(properties);
    }

    public static Block create() {
        return new SapphireBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST));
    }
}