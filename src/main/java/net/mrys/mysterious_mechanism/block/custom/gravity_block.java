package net.mrys.mysterious_mechanism.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class gravity_block extends Block {
    public gravity_block(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {

        player.addEffect(new MobEffectInstance(MobEffects.LEVITATION,80,3));

        return super.use(state, level, pos, player, hand, result);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {

        if (entity instanceof LivingEntity livingEntity){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.LEVITATION,80,3));
        }

        super.stepOn(level, pos, state, entity);
    }
}
