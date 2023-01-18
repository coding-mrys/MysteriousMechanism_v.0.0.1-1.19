package net.mrys.mysterious_mechanism.item.custom;


import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class mrys_power2 extends Item {
    public mrys_power2(Properties properties) {
        super(properties);
    }

    int a = 75;
    int b = 7;
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {


        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){

            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,a,5));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,a,b));
            player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,a,b));

            player.getCooldowns().addCooldown(this,1000);

        }

        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

        if(Screen.hasShiftDown()){
            components.add(Component
                    .literal("'right click' to use this Item.\nIt will give you a power boost!\nstats: "+a+"/"+b)
                    .withStyle(ChatFormatting.GREEN));

        }else{
            components.add(Component
                    .literal("'shift' for more informations")
                    .withStyle(ChatFormatting.AQUA));
        }

        super.appendHoverText(stack, level, components, flag);
    }

    @Override
    public boolean canAttackBlock(BlockState p_41441_, Level p_41442_, BlockPos p_41443_, Player p_41444_) {
        return false;
    }

}
