package ru.xunto.clothes.item;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.xunto.clothes.client.model.ModelHunterHat;

import javax.annotation.Nullable;

public class ItemHunterHat extends ItemHat {

    @SideOnly(Side.CLIENT)
    @Nullable @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack,
        EntityEquipmentSlot armorSlot, ModelBiped _default) {
        return ModelHunterHat.getModel(entityLiving.getClass());
    }

    @SideOnly(Side.CLIENT)
    @Nullable @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot,
        String type) {

        return stack != null ?
            "xunto_clothes:textures/entities/hunterclothes" + (type == null ? "" : "_overlay")
                + ".png" :
            null;
    }
}
