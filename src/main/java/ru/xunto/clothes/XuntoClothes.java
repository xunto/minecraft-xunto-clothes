package ru.xunto.clothes;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import ru.xunto.clothes.item.ItemHunterHat;

@Mod(modid = XuntoClothes.MODID, name = XuntoClothes.NAME, version = XuntoClothes.VERSION, dependencies = "required-after:moreplayermodels")
@Mod.EventBusSubscriber public class XuntoClothes {
    public static final String MODID = "xunto_clothes";
    static final String NAME = "xunto_clothes";
    static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "ru.xunto.clothes.client.model.ClientProxy", serverSide = "ru.xunto.clothes.ServerProxy")
    public static ServerProxy proxy;

    @Mod.EventHandler public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SubscribeEvent public static void addItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(new ItemHunterHat().setIdentifier("witchery_hunter_hat"));
    }

    @GameRegistry.ObjectHolder(XuntoClothes.MODID) public static class Items {
        public static final ItemHunterHat witchery_hunter_hat = null;
    }

}
