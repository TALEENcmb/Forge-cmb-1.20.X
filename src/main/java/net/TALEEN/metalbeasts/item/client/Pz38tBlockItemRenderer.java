package net.TALEEN.metalbeasts.item.client;

import net.TALEEN.metalbeasts.item.custom.Pz38tBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class Pz38tBlockItemRenderer extends GeoItemRenderer<Pz38tBlockItem> {
    public Pz38tBlockItemRenderer() {
        super(new Pz38tBlockItemModel());
    }
}
