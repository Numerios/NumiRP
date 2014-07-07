package num.numirp.addons;

/*
public class AddonCC {
    // using 4900 - 4914 by default
    public static final int BASE_UPGRADE_ID = Tweaks.TURTLE_UPGRADE_BASE;

    public static void init() {
        if (Loader.isModLoaded("CCTurtle")) {
            Logger.info("ComputerCraft found!");
            if (Module.TURTLES) {
                Logger.info("Adding new turtle tools to ComputerCraft");
                // Ruby turtles
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID, "Ruby", ModItems.swordRuby, "sword"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 1, "Ruby", ModItems.shovelRuby, "shovel"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 2, "Ruby", ModItems.pickaxeRuby, "pickaxe"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 3, "Ruby", ModItems.axeRuby, "axe"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 4, "Ruby", ModItems.hoeRuby, "hoe"));

                // Green Sapphire turtles
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 5, "Green Sapphire",
                        ModItems.swordGreenSapphire, "sword"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 6, "Green Sapphire",
                        ModItems.shovelGreenSapphire, "shovel"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 7, "Green Sapphire",
                        ModItems.pickaxeGreenSapphire, "pickaxe"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 8, "Green Sapphire", ModItems.axeGreenSapphire,
                        "axe"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 9, "Green Sapphire", ModItems.hoeGreenSapphire,
                        "hoe"));

                // Sapphire turtles
                TurtleAPI
                        .registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 10, "Sapphire", ModItems.swordSapphire, "sword"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 11, "Sapphire", ModItems.shovelSapphire,
                        "shovel"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 12, "Sapphire", ModItems.pickaxeSapphire,
                        "pickaxe"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 13, "Sapphire", ModItems.axeSapphire, "axe"));
                TurtleAPI.registerUpgrade(getUpgrade(BASE_UPGRADE_ID + 14, "Sapphire", ModItems.hoeSapphire, "hoe"));
            }
        } else {
            Logger.warn("ComputerCraft was not found!");
        }
    }

    /**
     * Gets a turtle upgrade
     *
     * @param ID           the turtle ID
     * @param materialName the name of the material - later merged to (materialName + " " + tool + " Turtle")
     * @param item         the item used
     * @param tool         the basic Minecraft type tool used - pickaxe/axe/shovel/sword/hoe
     * @return desired turtle upgrade
     */      /*
    private static ITurtleUpgrade getUpgrade(int ID, String materialName, Item item, String tool) {
        try {
            tool = tool.toLowerCase();
            String toolClass, turtleName;
            if (tool == "pickaxe") {
                toolClass = "TurtleTool";
                turtleName = "Mining";
            } else if (tool == "axe") {
                toolClass = "TurtleAxe";
                turtleName = "Felling";
            } else if (tool == "shovel") {
                toolClass = "TurtleShovel";
                turtleName = "Digging";
            } else if (tool == "sword") {
                toolClass = "TurtleSword";
                turtleName = "Melee";
            } else if (tool == "hoe") {
                toolClass = "TurtleHoe";
                turtleName = "Farming";
            } else {
                return null;
            }

            Class<?> clazz = Class.forName("dan200.turtle.shared." + toolClass);
            ITurtleUpgrade turtleUpgrade = (ITurtleUpgrade) clazz.getDeclaredConstructors()[0].newInstance(ID,
                    (materialName + " " + turtleName), item, false);
            return turtleUpgrade;
        } catch (Exception e) {
            Logger.warn("Turtle was not found!");
            e.printStackTrace();
        }
        return null;

    }
}            */
