package io.nffodev.ediblecompec;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import io.nffodev.ediblecompec.core.init.BlockInit;
import io.nffodev.ediblecompec.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("ediblecompec")
public class ediblecompec {

    public static final String MODID = "ediblecompec";
    public ediblecompec()  {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return ItemInit.EDIBLE_COMPEC_ITEM.get().getDefaultInstance();
        }
    };
}
