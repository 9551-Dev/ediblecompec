package io.nffodev.ediblecompec.common.items;

import io.nffodev.ediblecompec.core.init.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class EdibleCompecBehavior extends Item {
    public EdibleCompecBehavior(Item.Properties properties) {
        super(properties);
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, Player player) {
        Level level = player.level;
        BlockState state = level.getBlockState(pos);
        if (!state.isAir()) {
            level.setBlockAndUpdate(pos, BlockInit.COMPEC_BLOCK.get().defaultBlockState());
            return true;
        }
        return false;
    }
}