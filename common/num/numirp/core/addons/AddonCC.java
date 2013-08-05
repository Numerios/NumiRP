package num.numirp.core.addons;

import net.minecraft.item.Item;
import num.numirp.item.ModItems;
import cpw.mods.fml.common.Loader;
import dan200.turtle.api.ITurtleUpgrade;
import dan200.turtle.api.TurtleAPI;

public class AddonCC {
    public static void init() {
        if (Loader.isModLoaded("CCTurtle")) {
            System.out.println("[NumiRP] ComputerCraft found!");

            System.out.println("[NumiRP] Adding the test turtle!");
            TurtleAPI.registerUpgrade(getUpgrade(954, "Green Sapphire", ModItems.pickaxeGreenSapphire, "Pickaxe"));
        } else {
            System.out.println("[NumiRP] ComputerCraft was not found!");
        }
    }

    /**
     * Gets a turtle upgrade
     * 
     * @param ID the turtle ID
     * @param materialName the name of the material - later merged to (materialName + " " + tool + " Turtle")
     * @param item the item used
     * @param tool the basic Minecraft type tool used - pickaxe/axe/shovel/sword/hoe
     * @return desired turtle upgrade
     */
    public static ITurtleUpgrade getUpgrade(int ID, String materialName, Item item, String tool) {
        try {
            String toolClass;
            if (tool == "Pickaxe") {
                toolClass = "TurtleTool";
            } else if (tool == "Axe") {
                toolClass = "TurtleAxe";
            } else if (tool == "Shovel") {
                toolClass = "TurtleShovel";
            } else if (tool == "Sword") {
                toolClass = "TurtleSword";
            } else if (tool == "Hoe") {
                toolClass = "TurtleHoe";
            } else {
                return null;
            }

            Class<?> clazz = Class.forName("dan200.turtle.shared." + toolClass);
            ITurtleUpgrade turtleUpgrade = (ITurtleUpgrade) clazz.getDeclaredConstructors()[0].newInstance(ID,
                    (materialName + " " + tool), item, true);
            return turtleUpgrade;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
