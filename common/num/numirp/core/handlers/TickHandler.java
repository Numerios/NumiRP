package num.numirp.core.handlers;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import net.minecraft.client.Minecraft;
import num.numirp.lib.Reference;

import java.util.EnumSet;

public class TickHandler implements ITickHandler {
    private static final Minecraft mc = Minecraft.getMinecraft();
    private int playerCounter;

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {
        //TODO: FIX CAPES!
       /* if ((mc.theWorld != null) && (mc.theWorld.playerEntities.size() > 0)) {
            playerCounter += 1;
            if (playerCounter >= mc.theWorld.playerEntities.size())
                playerCounter = 0;

            EntityPlayer player = (EntityPlayer) mc.theWorld.playerEntities.get(playerCounter);
            String capeURL = (String) getCape(player.username);
            if (capeURL != null){
                ThreadDownloadImageData object = new ThreadDownloadImageData(capeURL, null, null);
                mc.renderEngine.loadTexture(new ResourceLocation("cloaks/" + player.username), (TextureObject) object);
            }
            if (cape != null) {
                String oldCape = player.cloakUrl;
                player.cloakUrl = (player.cloakUrl = cape);

                if (oldCape != cape)
                    mc.renderEngine.obtainImageData(player.cloakUrl, new ImageDownload());
            }
            

        }*/
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
