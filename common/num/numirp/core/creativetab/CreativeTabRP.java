package num.numirp.core.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import num.numirp.block.ModBlocks;

public class CreativeTabRP extends CreativeTabs {

    public CreativeTabRP(int id, String name) {
        super(id, name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        return ModBlocks.blockDecor.blockID;
    }

    @Override
    public String getTranslatedTabLabel() {
        return "NumiRP";
    }

}
