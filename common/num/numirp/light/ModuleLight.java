package num.numirp.light;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import num.numirp.core.Module;
import num.numirp.item.ModItems;
import num.numirp.lib.Strings;
import num.numirp.world.WorldGenerator;

public class ModuleLight extends Module {
    public static Item lumar;

    public void preInit() {
        registerItems();
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

    private void registerRecipes() {
        // Lumars
        for (int i = 0; i < Strings.COLORS.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemLumar, 4, i),
                    new ItemStack(Items.redstone, 1), new ItemStack(Items.glowstone_dust, 1), new ItemStack(
                            Items.dye, 1, Strings.COLORS.length - i - 1), new ItemStack(Items.dye, 1,
                            Strings.COLORS.length - i - 1)
            );
        }

        for (int i = 0; i < Strings.COLORS.length; i++) {
            for (int j = 0; j < Strings.COLORS.length; j++) {
                if (i != j)
                    GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemLumar, 1, i), new ItemStack(
                            Items.dye, 1, Strings.COLORS.length - i - 1), new ItemStack(ModItems.itemLumar, 1,
                            j));
            }
        }
    }
}

