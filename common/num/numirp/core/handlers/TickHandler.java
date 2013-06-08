package num.numirp.core.handlers;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import num.numirp.core.util.ImageDownload;
import num.numirp.lib.Reference;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler {
    private static final Minecraft mc = Minecraft.getMinecraft();

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {
        if ((mc.theWorld != null) && (mc.theWorld.playerEntities.size() > 0)) {
            @SuppressWarnings("unchecked")
            List<EntityPlayer> players = mc.theWorld.playerEntities;
            for (Iterator<EntityPlayer> entity = players.iterator(); entity.hasNext();) {
                EntityPlayer player = (EntityPlayer) entity.next();

                if (player.cloakUrl.startsWith("http://skins.minecraft.net/MinecraftCloaks/")) {
                    if (player.username.equalsIgnoreCase("Numerios") || player.username.equalsIgnoreCase("j_smart")) {
                        player.cloakUrl = Reference.DEVELOPERS_CAPE;
                        System.out.println("Setting player: " + player.username.toLowerCase() + " a new cape  "
                                + player.cloakUrl);
                        mc.renderEngine.obtainImageData(player.cloakUrl, new ImageDownload());
                    }
                }
            }
        }
    }

    @Override
    public void tickEnd(EnumSet<TickType> type, Object... tickData) {
    }

    @Override
    public EnumSet<TickType> ticks() {
        return EnumSet.of(TickType.CLIENT);
    }

    @Override
    public String getLabel() {
        return "NumiRP.TickHandler";
    }

}
