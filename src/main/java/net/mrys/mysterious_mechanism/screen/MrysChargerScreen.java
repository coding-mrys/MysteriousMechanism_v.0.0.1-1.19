package net.mrys.mysterious_mechanism.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.mrys.mysterious_mechanism.mysterious_mechanism;

public class MrysChargerScreen extends AbstractContainerScreen<MrysChargerMenu> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(mysterious_mechanism.MOD_ID,"textures/gui/mrys_charger_gui.png");

    public MrysChargerScreen(MrysChargerMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionShader);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);
        RenderSystem.setShaderTexture(0,TEXTURE);

        int x=(width-imageWidth)/2;
        int y=(height-imageHeight)/2;

        this.blit(pPoseStack,x,y,0,0,imageHeight,imageHeight);
        renderProgressArrow(pPoseStack,x,y);
    }

    private void renderProgressArrow(PoseStack pPoseStack, int x, int y){
        if(menu.isCrafting()){
            blit(pPoseStack,x+105,y+33,176,0,8, menu.getScaledProgress());
        }
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack,mouseX,mouseY);
    }
}
