package io.nffodev.ediblecompec.core.init;

import io.nffodev.ediblecompec.common.items.EdibleCompecBehavior;
import io.nffodev.ediblecompec.ediblecompec;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ediblecompec.MODID);
    public static RegistryObject<EdibleCompecBehavior> EDIBLE_COMPEC_ITEM = ITEMS.register("edible_compec",
            () -> new EdibleCompecBehavior(new Item.Properties().tab(ediblecompec.TAB).food(
                    new FoodProperties.Builder().nutrition(15).saturationMod(1).build())));
}
