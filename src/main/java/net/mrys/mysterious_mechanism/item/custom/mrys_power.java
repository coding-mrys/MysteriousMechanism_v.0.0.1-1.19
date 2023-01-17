package net.mrys.mysterious_mechanism.item.custom;


import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fluids.FluidActionResult;

public class mrys_power extends Item {
    public mrys_power(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){

            player.addEffect(new MobEffectInstance(MobEffects.JUMP,200,6));
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200,10));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,200,10));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,200,16));
            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION,50,50));

            player.getCooldowns().addCooldown(this,1000);

        }

        return super.use(level, player, hand);
    }

    @Override
    public boolean canAttackBlock(BlockState p_41441_, Level p_41442_, BlockPos p_41443_, Player p_41444_) {
        return false;
    }

}
