package num.numirp.core.cape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class Capes {

    private static Capes instance;

    private static final Minecraft mc = Minecraft.getMinecraft();

    private HashMap<String, String> users;
    private HashMap<String, String> groupUrls;

    private boolean tickSetUp = false;

    private Capes() {
        users = new HashMap<String, String>();
        groupUrls = new HashMap<String, String>();
    }

    public static Capes getInstance() {
        if (instance == null){
            instance = new Capes();
        }
        return instance;
    }

    public void init(String parTxtUrl) {
        try{
            URL url = new URL(parTxtUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;

            String username = "";
            String group = "";
            String capeUrl = "";
            
            while ((line = reader.readLine()) != null){

                if (!line.startsWith("#")){

                    for (int i = 0; i < line.length(); i++){

                        if (line.charAt(i) == '='){
                            group = line.substring(0, i);
                            String subLine = line.substring(i + 1);

                            if (subLine.startsWith("http")){
                                capeUrl = subLine;
                                getInstance().addGroupUrl(group, capeUrl);
                                mc.renderEngine.obtainImageData(capeUrl, new ImageBufferDownload());
                                continue;
                            }else{
                                username = subLine.toLowerCase();
                                getInstance().addUser(username, group);
                            }
                        }
                    }
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }


        if (!instance.tickSetUp){

            TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
            instance.tickSetUp = true;
        }
    }

    public void addUser(String parUsername, String parGroup) {
        if (getUserGroup(parUsername) == null){
            users.put(parUsername, parGroup);

        }
    }
    
    public String getUserGroup(String parUsername) {
        return users.get(parUsername.toLowerCase());
    }

    public void addGroupUrl(String parGroup, String parCapeUrl) {
        if (getGroupUrl(parGroup) == null){
            groupUrls.put(parGroup, parCapeUrl);
        }
    }

    public String getGroupUrl(String group) {
        return groupUrls.get(group);
    }
}