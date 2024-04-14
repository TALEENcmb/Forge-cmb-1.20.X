package net.TALEEN.metalbeasts.block.entity.client;

import net.TALEEN.metalbeasts.block.entity.Pz38tBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class Pz38tBlockRenderer extends GeoBlockRenderer<Pz38tBlockEntity> {
    public Pz38tBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new Pz38tBlockModel());
    }
}

