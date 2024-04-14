package net.TALEEN.metalbeasts.block.entity;

import net.TALEEN.metalbeasts.MetalBeastsMod;
import net.TALEEN.metalbeasts.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MetalBeastsMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<Pz38tBlockEntity>> PZ38T_BLOCK_ENTITY =
             BLOCK_ENTITIES.register("pz38t_block_entity", () ->
                    BlockEntityType.Builder.of(Pz38tBlockEntity::new,
                            ModBlocks.PZ38T_BLOCK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
