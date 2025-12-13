package net.jfrx.slashblade.maidnativepower.event;

import com.github.tartaricacid.touhoulittlemaid.entity.passive.EntityMaid;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.jfrx.slashblade.maidnativepower.item.SlashBladeMaidBauble;
//import net.mrqx.nativepower.entity.EntityBlastSummonedSword;

//@Mod.EventBusSubscriber
//public class EntityJoinLevelHandler {
//    @SubscribeEvent
//    public static void onEntityJoinLevelEvent(EntityJoinLevelEvent event) {
//        if (event.getEntity() instanceof EntityBlastSummonedSword summonedSword) {
//            if (summonedSword.getOwner() instanceof EntityMaid maid) {
//                if (!SlashBladeMaidBauble.MirageBlade.checkBauble(maid)) {
//                    EntityBlastSummonedSword.getPreSummonSwordList(maid).clear();
//                    EntityBlastSummonedSword.getPreBlastSwordList(maid).clear();
//                    event.setCanceled(true);
//                }
//            }
//        }
//    }
//}
