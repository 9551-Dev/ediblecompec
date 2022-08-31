package io.nffodev.ediblecompec.core.init;

import io.nffodev.ediblecompec.ediblecompec;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockInit {
    private BlockInit() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ediblecompec.MODID);
    public static RegistryObject<Block> COMPEC_BLOCK = BLOCKS.register("compec_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_PINK)
                    .strength(10,100).friction(0.5f)));
}
