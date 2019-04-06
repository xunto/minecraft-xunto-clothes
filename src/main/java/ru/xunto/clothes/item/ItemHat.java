package ru.xunto.clothes.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import ru.xunto.clothes.XuntoClothes;

public class ItemHat extends ItemArmor {

    public ItemHat() {
        super(ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.HEAD);
        this.setCreativeTab(CreativeTabs.DECORATIONS);
    }

    public ItemHat setIdentifier(String name) {
        this.setRegistryName(XuntoClothes.MODID, name);
        this.setUnlocalizedName(name);

        return this;
    }
}
