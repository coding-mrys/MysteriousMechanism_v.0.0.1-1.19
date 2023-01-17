package net.mrys.mysterious_mechanism.item.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class mrys_power3 extends Item {
    public mrys_power3(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        int a = 200;
        int b = 20;

        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){

            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,a,6));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,a,b));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,a,b));

            player.getCooldowns().addCooldown(this,1000);

        }

        return super.use(level, player, hand);
    }

    @Override
    public boolean canAttackBlock(BlockState p_41441_, Level p_41442_, BlockPos p_41443_, Player p_41444_) {
        return false;
    }

}
