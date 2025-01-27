package mince.moreweapons.enchantment;

import mince.moreweapons.MoreWeapons;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.registry.Registry;

public class PoisoningEnchantment extends Enchantment {
    protected PoisoningEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes){
        super(weight, type, slotTypes);
        Registry.register(Registry.ENCHANTMENT, MoreWeapons.ID("poisoning"), this);

    }
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level){
        if(target instanceof LivingEntity livingEntity){
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1, true, false));
        }
        super.onTargetDamaged(user, target, level);
    }
}
