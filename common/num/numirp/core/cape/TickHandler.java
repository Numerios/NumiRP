package num.numirp.core.cape;

import java.util.EnumSet;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TickHandler implements ITickHandler {

    private static final Minecraft mc = Minecraft.getMinecraft();
    private static final Capes instance = Capes.getInstance();

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {

        if ((mc.theWorld != null) && (mc.theWorld.playerEntities.size() > 0)){

            @SuppressWarnings("unchecked")
            List<EntityPlayer> players = mc.theWorld.playerEntities;

            for (int counter = 0; counter < players.size(); counter++){

                if (players.get(counter) != null){

                    EntityPlayer player = players.get(counter);

                    if (player.cloakUrl.startsWith("http://skins.minecraft.net/MinecraftCloaks/")){

                        String lowerUsername = player.username.toLowerCase();

                        if (instance.getUserGroup(lowerUsername) != null){

                            String userGroup = instance.getUserGroup(lowerUsername);
                            String groupUrl = instance.getGroupUrl(userGroup);

                            player.cloakUrl = groupUrl;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void tickEnd(EnumSet<TickType> type, Object... tickData) {}

    @Override
    public EnumSet<TickType> ticks() {
        return EnumSet.of(TickType.CLIENT);
    }

    @Override
    public String getLabel() {
        return "DeveloperCapesTickHandler";
    }
}