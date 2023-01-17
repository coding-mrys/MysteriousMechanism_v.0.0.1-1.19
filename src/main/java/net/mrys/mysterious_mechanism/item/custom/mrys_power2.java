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

public class mrys_power2 extends Item {
    public mrys_power2(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        int a = 75;
        int b = 7;

        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){

            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,a,5));
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
