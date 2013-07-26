package num.numirp.core.handlers;

import java.util.EnumSet;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import num.numirp.core.util.ImageDownload;
import num.numirp.lib.Reference;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler {
    private static final Minecraft mc = Minecraft.getMinecraft();
    private int playerCounter;

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {
        // This Needs Re-writing
        if ((mc.theWorld != null) && (mc.theWorld.playerEntities.size() > 0)) {
            playerCounter += 1;
            if (playerCounter >= mc.theWorld.playerEntities.size())
                playerCounter = 0;

            EntityPlayer player = (EntityPlayer) mc.theWorld.playerEntities.get(playerCounter);
            String cape = (String) getCape(player.username);
            if (cape != null) {
                String oldCape = player.cloakUrl;
                player.cloakUrl = (player.cloakUrl = cape);

                if (oldCape != cape)
                    mc.renderEngine.obtainImageData(player.cloakUrl, new ImageDownload());
            }

        }
    }

    private String getCape(String username) {
        if (username.equalsIgnoreCase("Numerios") || username.equalsIgnoreCase("j_smart")) {
            return Reference.DEVELOPER_CAPE_PATH;
        } else {
            return null;
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
