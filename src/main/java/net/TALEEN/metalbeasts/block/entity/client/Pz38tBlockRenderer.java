package net.TALEEN.metalbeasts.block.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.TALEEN.metalbeasts.block.entity.Pz38tBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class Pz38tBlockRenderer extends GeoBlockRenderer<Pz38tBlockEntity> {
    public Pz38tBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new Pz38tBlockModel());
    }
}

