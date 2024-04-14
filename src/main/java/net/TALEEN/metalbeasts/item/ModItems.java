package net.TALEEN.metalbeasts.item;

import net.TALEEN.metalbeasts.MetalBeastsMod;
import net.TALEEN.metalbeasts.block.ModBlocks;
import net.TALEEN.metalbeasts.item.custom.Pz38tBlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MetalBeastsMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PZ38T_BLOCK_ITEM = ITEMS.register("pz38t_block",
            () -> new Pz38tBlockItem(ModBlocks.PZ38T_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
