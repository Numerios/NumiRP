package num.numirp.light;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import num.numirp.core.Module;
import num.numirp.lib.Strings;
import num.numirp.world.WorldGenerator;

public class ModuleLight extends Module {
    public static Item lumar;
    public static Block lampNormal, lampNormalActive, lampInverted, lampInvertedActive;

    public void preInit() {
        registerItems();
        registerBlocks();
    }

    public void init() {
        registerRecipes();
        new WorldGenerator();
    }

    private void registerItems() {
        lumar = new ItemLumar();
        ((ItemLumar) lumar).registerOres();
        GameRegistry.registerItem(lumar, lumar.getUnlocalizedName());
    }

    private void registerBlocks() {
        lampNormal = new BlockLamp(false, false, lampNormal, lampNormalActive, "normal");
        lampNormalActive = new BlockLamp(true, true, lampNormal, lampNormalActive, "normalActive");

        lampInverted = new BlockLamp(false, true, lampInverted, lampInvertedActive, "inverted");
        lampInvertedActive = new BlockLamp(true, false, lampInverted, lampInvertedActive, "invertedActive");

        GameRegistry.registerBlock(lampNormal, ItemBlockLamp.class, lampNormal.getUnlocalizedName());
        GameRegistry.registerBlock(lampNormalActive, ItemBlockLamp.class, lampNormalActive.getUnlocalizedName());
        GameRegistry.registerBlock(lampInverted, ItemBlockLamp.class, lampInverted.getUnlocalizedName());
        GameRegistry.registerBlock(lampInvertedActive, ItemBlockLamp.class, lampInvertedActive.getUnlocalizedName());
    }

    private void registerRecipes() {
        // Lumars
        for (int i = 0; i < Strings.COLORS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(lumar, 4, i),
                    new ItemStack(Items.redstone, 1), new ItemStack(Items.glowstone_dust, 1), new ItemStack(
                            Items.dye, 1, Strings.COLORS.length - i - 1), new ItemStack(Items.dye, 1,
                            Strings.COLORS.length - i - 1)
            );
        }

        for (int i = 0; i < Strings.COLORS.length; i++) {
            for (int j = 0; j < Strings.COLORS.length; j++) {
                if (i != j)
                    GameRegistry.addShapelessRecipe(new ItemStack(lumar, 1, i), new ItemStack(
                            Items.dye, 1, Strings.COLORS.length - i - 1), new ItemStack(lumar, 1,
                            j));
            }
        }


        // Lamps
        for (int i = 0; i < Strings.COLORS.length; i++) {
            GameRegistry.addRecipe(new ItemStack(lampNormal, 1, i),
                    "GLG", "GLG", "GRG", 'G', Blocks.glass,
                    'L', new ItemStack(lumar, 1, i), 'R', Items.redstone);
        }

        for (int i = 0; i < Strings.COLORS.length; i++) {
            GameRegistry.addRecipe(new ItemStack(lampInverted, 1, i),
                    "GLG", "GLG", "GRG", 'G', Blocks.glass,
                    'L', new ItemStack(lumar, 1, i), 'R', Blocks.redstone_torch);
        }

        for (int i = 0; i < Strings.COLORS.length; i++) {
            for (int j = 0; j < Strings.COLORS.length; j++) {
                if (i != j) {
                    GameRegistry.addShapelessRecipe(new ItemStack(lampNormal, 1, i), new ItemStack(
                            Items.dye, 1, Strings.COLORS.length - i - 1), new ItemStack(
                            lampNormal, 1, j));
                    GameRegistry.addShapelessRecipe(new ItemStack(lampInverted, 1, i),
                            new ItemStack(Items.dye, 1, Strings.COLORS.length - i - 1), new ItemStack(
                                    lampInverted, j)
                    );
                }
            }
        }

        for (int i = 0; i < Strings.COLORS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(lampNormal, 1, i), new ItemStack(
                    Items.redstone), new ItemStack(lampInverted, 1, i));
        }

        for (int i = 0; i < Strings.COLORS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(lampInverted, 1, i), new ItemStack(
                    Blocks.redstone_torch), new ItemStack(lampNormal, 1, i));
        }
    }
}

