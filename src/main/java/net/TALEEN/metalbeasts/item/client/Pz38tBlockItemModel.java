package net.TALEEN.metalbeasts.item.client;

import net.TALEEN.metalbeasts.MetalBeastsMod;
import net.TALEEN.metalbeasts.item.custom.Pz38tBlockItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class Pz38tBlockItemModel extends GeoModel<Pz38tBlockItem> {
    @Override
    public ResourceLocation getModelResource(Pz38tBlockItem animatable) {
        return new ResourceLocation(MetalBeastsMod.MOD_ID, "geo/pz38t.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Pz38tBlockItem animatable) {
        return new ResourceLocation(MetalBeastsMod.MOD_ID, "textures/block/pz38t.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Pz38tBlockItem animatable) {
        return new ResourceLocation(MetalBeastsMod.MOD_ID, "animations/pz38t_block.animation.json");
    }
}
