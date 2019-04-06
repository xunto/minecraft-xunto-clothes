package ru.xunto.clothes.client.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ru.xunto.clothes.ServerProxy;
import ru.xunto.clothes.XuntoClothes;

@Mod.EventBusSubscriber
public class ClientProxy extends ServerProxy {
    @Override public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
        this.setUpBlockColors();
    }

    @SubscribeEvent public static void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(XuntoClothes.Items.witchery_hunter_hat, 0,
            new ModelResourceLocation(XuntoClothes.Items.witchery_hunter_hat.getRegistryName(), "inventory"));

    }


    public void setUpBlockColors() {
        Minecraft minecraft = Minecraft.getMinecraft();
        ItemColors itemColors = minecraft.getItemColors();

        itemColors.registerItemColorHandler((stack, tintIndex) -> tintIndex > 0 ?
            -1 :
            ((ItemArmor) stack.getItem()).getColor(stack), XuntoClothes.Items.witchery_hunter_hat);

    }

}
