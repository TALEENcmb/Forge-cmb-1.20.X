package net.TALEEN.metalbeasts.block.entity.client;

import net.TALEEN.metalbeasts.MetalBeastsMod;
import net.TALEEN.metalbeasts.block.entity.Pz38tBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class Pz38tBlockModel extends GeoModel<Pz38tBlockEntity> {
    @Override
    public ResourceLocation getModelResource(Pz38tBlockEntity pz38tBlockEntity) {
        return new ResourceLocation(MetalBeastsMod.MOD_ID, "geo/pz38t.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Pz38tBlockEntity pz38tBlockEntity) {
        return new ResourceLocation(MetalBeastsMod.MOD_ID, "textures/block/pz38t.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Pz38tBlockEntity pz38tBlockEntity) {
        return new ResourceLocation(MetalBeastsMod.MOD_ID, "animations/pz38t_block.animation.json");
    }
}
