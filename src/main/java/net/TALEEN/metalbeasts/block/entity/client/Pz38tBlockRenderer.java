package net.TALEEN.metalbeasts.block.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.TALEEN.metalbeasts.block.entity.Pz38tBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class Pz38tBlockRenderer extends GeoBlockRenderer<Pz38tBlockEntity> {
    public Pz38tBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new Pz38tBlockModel());
    }

    @Override
    public void scaleModelForRender(float widthScale, float heightScale, PoseStack poseStack, Pz38tBlockEntity animatable, BakedGeoModel model, boolean isReRender, float partialTick, int packedLight, int packedOverlay) {
        super.scaleModelForRender(1.55f, 1.55f, poseStack, animatable, model, isReRender, partialTick, packedLight, packedOverlay);
    }
}

