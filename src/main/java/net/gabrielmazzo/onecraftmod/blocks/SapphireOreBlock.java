package net.gabrielmazzo.onecraftmod.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SapphireOreBlock extends DropExperienceBlock {
    public SapphireOreBlock(Properties properties, UniformInt uniformInt) {
		super(properties);
    }

    public static DropExperienceBlock create() {
        return new SapphireOreBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6));
    }
}
