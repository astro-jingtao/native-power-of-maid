package net.jfrx.slashblade.maidnativepower;

import com.mojang.logging.LogUtils;
import net.jfrx.slashblade.maidnativepower.config.NativePowerOfMaidClientConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.jfrx.slashblade.maidnativepower.config.NativePowerOfMaidCommonConfig;
import net.jfrx.slashblade.maidnativepower.init.MaidPowerCreativeTab;
import net.jfrx.slashblade.maidnativepower.init.MaidPowerItems;
import net.jfrx.slashblade.maidnativepower.network.NetworkManager;
import org.slf4j.Logger;

@Mod(NativePowerOfMaid.MODID)
public class NativePowerOfMaid {
    public static final String MODID = "native_power_of_maid";
    public static final Logger LOGGER = LogUtils.getLogger();

    @SuppressWarnings("removal")
    public NativePowerOfMaid() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MaidPowerItems.ITEMS.register(modEventBus);
        MaidPowerCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        NetworkManager.register();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, NativePowerOfMaidCommonConfig.COMMON_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, NativePowerOfMaidClientConfig.CLIENT_CONFIG);
    }

    @SuppressWarnings("removal")
    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(MODID, path);
    }
}
